<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="javax.xml.bind.ValidationEvent"%>
<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.hp.school.management.constants.SchoolManagementPortletKeys"%>
<%@page import="com.cgi.vacanymanagement.portlet.SchoolManagementPortlet"%>
<%@page import="com.hp.school.management.service.SchoolLocalServiceUtil"%>
<%@page import="javax.portlet.PortletRequest"%>
<%@page import="javax.portlet.PortletURL"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayPortletMode"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="com.liferay.portal.kernel.portlet.PortletURLFactoryUtil"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@ include file="/init.jsp" %>



<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>


<liferay-theme:defineObjects />

<portlet:defineObjects />


<liferay-theme:defineObjects />

<portlet:defineObjects />

		<%
		String searchKeyword= ParamUtil.getString(renderRequest, "searchKeyword",StringPool.BLANK);
		%>
		<portlet:renderURL var="addSchoolRender">
		<portlet:param name="mvcPath" value="/add_or_update_school.jsp"/>
		</portlet:renderURL>
			 <portlet:renderURL var="searchSchoolRender">
				<portlet:param name="mvcPath" value="/view.jsp"/>
			</portlet:renderURL>

			<aui:row>
				<aui:col md="3"  cssClass="offset-md-6">
									 
				 <aui:form action="<%= searchSchoolRender %>" method="post" name="searchForm" id="searchForm" >
				 	<aui:row>
						 	<aui:input placeholder="Search" name="searchKeyword" label="" type="text"  value="<%=searchKeyword %>" >
					        </aui:input>
					       <%--  <div onClick="searchSchools()">
						 		<liferay-ui:icon icon="trash"    />
					        </div> --%>
					        <aui:button value="Search" cssClass="search-btn-cus" primary="true"  type="submit" ></aui:button>
					 	</aui:row>
				  </aui:form>
				 
				</aui:col>
				 <c:if test="<%= themeDisplay.getPermissionChecker().hasPermission(themeDisplay.getLayout().getGroupId(),  SchoolManagementPortletKeys.SchoolManagementPortlet, 0, SchoolManagementPortletKeys.PERMISSION_ADD_SCHOOL_DETAILS )	 %>">
						<aui:col md="3">
						<aui:button-row  cssClass="add-v-b-row">
							<aui:button  primary="true" href="<%=addSchoolRender %>" icon="icon-plus" cssClass="add-school-btn v-plus-icon" value="Add School"></aui:button>
						</aui:button-row>
						</aui:col>
			  </c:if>
			</aui:row>
			
<liferay-ui:search-container emptyResultsMessage="<%=Validator.isNull(searchKeyword)?"No schools found":"No schools found with search result" %>" total="<%= SchoolLocalServiceUtil.searchSchoolsCount(themeDisplay.getScopeGroupId(), searchKeyword) %>" delta="2" >
<liferay-ui:search-container-results results="<%= SchoolLocalServiceUtil.searchSchools(themeDisplay.getScopeGroupId(), searchKeyword,searchContainer.getStart(), searchContainer.getEnd()) %>"

/>
 
<liferay-ui:search-container-row
className="com.hp.school.management.model.School"
modelVar="school"
>
 
<liferay-ui:search-container-column-text property="name"  />
 
<liferay-ui:search-container-column-text property="type"  />
 
<liferay-ui:search-container-column-text property="city"  />
 
<liferay-ui:search-container-column-text  name="No Of Student" property="noOfstudent"  />	
<c:if test="<%= themeDisplay.getPermissionChecker().hasPermission(themeDisplay.getLayout().getGroupId(),  SchoolManagementPortletKeys.SchoolManagementPortlet, 0, SchoolManagementPortletKeys.PERMISSION_UPDATE_SCHOOL_DETAILS ) || themeDisplay.getPermissionChecker().hasPermission(themeDisplay.getLayout().getGroupId(),  SchoolManagementPortletKeys.SchoolManagementPortlet, 0, SchoolManagementPortletKeys.PERMISSION_DELETE_SCHOOL_DETAILS )	 %>">
 
	<liferay-ui:search-container-column-text name="Action" >
	  
		  <c:if test="<%= themeDisplay.getPermissionChecker().hasPermission(themeDisplay.getLayout().getGroupId(),  SchoolManagementPortletKeys.SchoolManagementPortlet, 0, SchoolManagementPortletKeys.PERMISSION_UPDATE_SCHOOL_DETAILS )	 %>">
			   <portlet:renderURL var="editEntryURL" >
			  	<portlet:param name="schoolId" value="<%=String.valueOf(school.getSchoolId()) %>"/>
				<portlet:param name="mvcRenderCommandName" value="/edit/school/render/url"/>
			  </portlet:renderURL>
				<liferay-ui:icon icon="edit"  cssClass="edit-icon" url="<%=editEntryURL %>" method="get"  />
		  </c:if>
		  <c:if test="<%= themeDisplay.getPermissionChecker().hasPermission(themeDisplay.getLayout().getGroupId(),  SchoolManagementPortletKeys.SchoolManagementPortlet, 0, SchoolManagementPortletKeys.PERMISSION_DELETE_SCHOOL_DETAILS )	 %>">
			  <portlet:actionURL name="/delete/school/action/url" var="deleteEntryURL" >
			  	<portlet:param name="schoolId" value="<%=String.valueOf(school.getSchoolId()) %>"/>
			  	<portlet:param name="redirect" value="<%=defaultPage%>"/>
			  </portlet:actionURL>
				<liferay-ui:icon icon="trash"  cssClass="delete-icon" url="<%=deleteEntryURL %>" method="get"   />
		  </c:if>
  	</liferay-ui:search-container-column-text>
  </c:if>

</liferay-ui:search-container-row>
 
<liferay-ui:search-iterator />
</liferay-ui:search-container>

<style>

i.icon-plus {
    color: white;
}
.search-btn-cus
{
	height: 40px;
}
.button-holder.add-v-b-row {
    margin-top: 0px;
}
span.edit-icon {
    padding: 6%;
}
</style>