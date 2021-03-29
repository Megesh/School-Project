package com.cgi.vacanymanagement.portlet;

import java.io.IOException;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.hp.school.management.constants.SchoolManagementPortletKeys;
import com.hp.school.management.service.SchoolLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

/**
 * @author ityug28
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=SchoolManagement",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + SchoolManagementPortletKeys.SchoolManagementPortlet,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class SchoolManagementPortlet extends MVCPortlet {

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		// TODO Auto-generated method stub
		long schoolId= ParamUtil.getLong(resourceRequest, "schoolId");
		try {
			SchoolLocalServiceUtil.deleteSchool(schoolId);
		
			System.out.println("School Deleted Sucessfully");
			
			try {

				resourceResponse.getWriter().write("success");
			} catch (IOException e) {
				e.printStackTrace();
			}	
			
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		 
	}
	
	
	
	
}