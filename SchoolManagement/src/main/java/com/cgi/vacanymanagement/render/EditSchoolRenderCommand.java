package com.cgi.vacanymanagement.render;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import com.hp.school.management.constants.SchoolManagementPortletKeys;
import com.hp.school.management.model.School;
import com.hp.school.management.service.SchoolLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;



@Component(
	    immediate = true,
	    property = {
	        "javax.portlet.name="+SchoolManagementPortletKeys.SchoolManagementPortlet,
	        "mvc.command.name=/edit/school/render/url"
	    },
	    service = MVCRenderCommand.class
	)
public class EditSchoolRenderCommand  implements MVCRenderCommand   {
	
	
	Log log=LogFactoryUtil.getLog(getClass());

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		ThemeDisplay themeDisplay=(ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		if(themeDisplay.getPermissionChecker().hasPermission(themeDisplay.getLayout().getGroupId(),  SchoolManagementPortletKeys.SchoolManagementPortlet, 0, SchoolManagementPortletKeys.PERMISSION_UPDATE_SCHOOL_DETAILS ))
		{
			long schoolId= ParamUtil.getLong(renderRequest, "schoolId");
		 	School school= SchoolLocalServiceUtil.fetchSchool(schoolId);
			renderRequest.setAttribute("school", school);
			return "/add_or_update_school.jsp";
		}
		return "/view.jsp";
	}
	

}
