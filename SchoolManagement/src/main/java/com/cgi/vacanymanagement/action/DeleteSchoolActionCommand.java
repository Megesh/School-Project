package com.cgi.vacanymanagement.action;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;

import org.osgi.service.component.annotations.Component;

import com.hp.school.management.constants.SchoolManagementPortletKeys;
import com.hp.school.management.service.SchoolLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;



@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name="+SchoolManagementPortletKeys.SchoolManagementPortlet,
	        "mvc.command.name=/delete/school/action/url"
	    },
	    service = MVCActionCommand.class
	)
public class DeleteSchoolActionCommand extends BaseMVCActionCommand  {
	
	
	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) {
		// TODO Auto-generated method stub
		
		ThemeDisplay themeDisplay=(ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		if(themeDisplay.getPermissionChecker().hasPermission(themeDisplay.getLayout().getGroupId(),  SchoolManagementPortletKeys.SchoolManagementPortlet, 0, SchoolManagementPortletKeys.PERMISSION_DELETE_SCHOOL_DETAILS ))
		{
			long schoolId=ParamUtil.getLong(actionRequest, "schoolId");
			try {
				SchoolLocalServiceUtil.deleteSchool(schoolId);
				log.info("school deleted successfully");
				SessionMessages.add(actionRequest, SchoolManagementPortletKeys.SCHOOL_DELETED_SESSION_MSG_SUCESS);
				
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				SessionErrors.add(actionRequest, SchoolManagementPortletKeys.SESSION_MSG_ERROR);
			}
		}
	}
	Log log=LogFactoryUtil.getLog(getClass());
			

}
