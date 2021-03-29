<%@page import="com.liferay.portal.kernel.util.StringPool"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.hp.school.management.model.School"%>
<%@page import="com.liferay.portal.kernel.util.Constants"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<%@ taglib uri="http://liferay.com/tld/aui" prefix="aui" %><%@
taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet" %><%@
taglib uri="http://liferay.com/tld/theme" prefix="liferay-theme" %><%@
taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>

<liferay-theme:defineObjects />

<portlet:defineObjects />
<%@ include file="/init.jsp" %>


<portlet:renderURL var="mainPageURL">
</portlet:renderURL>

<%
School school=(School)renderRequest.getAttribute("school");
%>

<portlet:actionURL name="/add/school/action/url" var="addOrUpdateEntryURL" >
	<portlet:param name="redirect" value="<%=defaultPage%>"/>
 </portlet:actionURL>
<aui:form action="<%= addOrUpdateEntryURL %>" method="post" name="myForm" >
 <aui:input  name="<%=Constants.CMD%>" value="<%= Validator.isNull(school) ? Constants.ADD : Constants.UPDATE %>" type="hidden"  />
<c:if test="<%=Validator.isNotNull(school)  %>">
	<aui:input  name="schoolId" value="<%=school.getSchoolId() %>" type="hidden"  />
</c:if>

<aui:row>
	<aui:col md="6">
        <aui:input label="Schoo Name" name="name" type="text"  value="<%= Validator.isNotNull(school) ? school.getName() : StringPool.BLANK %>" >
        	 <aui:validator name="required" />
        </aui:input>
	</aui:col>
	<aui:col md="6">
         <aui:input label="Type Of School" name="type" type="text" value="<%= Validator.isNotNull(school) ? school.getType() : StringPool.BLANK %>"  >
        	 <aui:validator name="required" />
         </aui:input>
	</aui:col>
</aui:row>
<aui:row>
	<aui:col md="6">
         <aui:input label="City" name="city" type="text"  value="<%= Validator.isNotNull(school) ? school.getCity() : StringPool.BLANK %>" >
        	 <aui:validator name="required" />
        </aui:input>
	</aui:col>
	<aui:col md="6">
         <aui:input label="No Of Student" name="noOfStudent" type="text"  value="<%= Validator.isNotNull(school) ? school.getNoOfstudent() : StringPool.BLANK %>" >
        	 <aui:validator name="required" />
        	 <aui:validator name="number" />
        </aui:input>
	</aui:col>
</aui:row>
<aui:col md="3" cssClass="offset-md-9">
          <aui:button-row cssClass="add-cal-v-b-row">
	          <aui:button value="Cancel"  cssClass="can-btn" href="<%=mainPageURL %>" />
	          <aui:button type="submit"  cssClass="sub-btn" primary="true"/>
        	</aui:button-row>
</aui:col>
        
</aui:form>
