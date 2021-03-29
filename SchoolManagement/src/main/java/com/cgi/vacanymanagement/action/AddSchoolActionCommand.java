package com.cgi.vacanymanagement.action;

import java.util.Date;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.hp.school.management.constants.SchoolManagementPortletKeys;
import com.hp.school.management.model.School;
import com.hp.school.management.service.SchoolLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Constants;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;

 
@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name="+SchoolManagementPortletKeys.SchoolManagementPortlet,
	        "mvc.command.name=/add/school/action/url"
	    },
	    service = MVCActionCommand.class
	)
public class AddSchoolActionCommand extends BaseMVCActionCommand  {
	
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
		String cmd= ParamUtil.getString(actionRequest, Constants.CMD,Constants.ADD);
		if(Constants.ADD.equals(cmd))
		{
			addSchool(actionRequest, actionResponse)	;
		}
		else if(Constants.UPDATE.equals(cmd))
		{
			editSchool(actionRequest, actionResponse)	;
		}
		
		
	}
	
	private boolean addSchool(ActionRequest actionRequest, ActionResponse actionResponse)
	{
		
		ThemeDisplay themeDisply=(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		String name=ParamUtil.getString(actionRequest, "name");
		String type=ParamUtil.getString(actionRequest, "type");
		String city=ParamUtil.getString(actionRequest, "city");
		int noOfstudent=ParamUtil.getInteger(actionRequest, "noOfStudent");
		
		try {
			SchoolLocalServiceUtil.addSchool(name, type, noOfstudent, city, themeDisply.getUserId(),themeDisply.getScopeGroupId());
			SessionMessages.add(actionRequest, SchoolManagementPortletKeys.SCHOOL_ADDED_SESSION_MSG_SUCESS);

		} catch (Exception e) {
			e.printStackTrace();
			SessionErrors.add(actionRequest, SchoolManagementPortletKeys.SESSION_MSG_ERROR);
			return false;
		}
		
		log.info("school added successfully");
		return true;
		
	}
	private boolean editSchool(ActionRequest actionRequest, ActionResponse actionResponse)
	{
		
		ThemeDisplay themeDisply=(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long schoolId=ParamUtil.getLong(actionRequest, "schoolId");
		String name=ParamUtil.getString(actionRequest, "name");
		String type=ParamUtil.getString(actionRequest, "type");
		String city=ParamUtil.getString(actionRequest, "city");
		int noOfstudent=ParamUtil.getInteger(actionRequest, "noOfStudent");
		
		try {
			SchoolLocalServiceUtil.updateSchool(schoolId,name, type, noOfstudent, city, themeDisply.getUserId(),themeDisply.getScopeGroupId());
			SessionMessages.add(actionRequest, SchoolManagementPortletKeys.SCHOOL_EDITED_SESSION_MSG_SUCESS);

		} catch (Exception e) {
			e.printStackTrace();
			SessionErrors.add(actionRequest, SchoolManagementPortletKeys.SESSION_MSG_ERROR);
			return false;
		}
		
		log.info("school updated successfully");
		return true;
		
	}
	
	Log log=LogFactoryUtil.getLog(getClass());
			

}
