/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.hp.school.management.service.impl;

import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

import com.hp.school.management.model.School;
import com.hp.school.management.service.SchoolLocalServiceUtil;
import com.hp.school.management.service.base.SchoolLocalServiceBaseImpl;
import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.asset.kernel.model.AssetLinkConstants;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.petra.string.StringPool;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.dao.orm.Disjunction;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionList;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.util.Validator;

/**
 * The implementation of the school local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>com.hp.school.management.service.SchoolLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SchoolLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=com.hp.school.management.model.School",
	service = AopService.class
)
public class SchoolLocalServiceImpl extends SchoolLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>com.hp.school.management.service.SchoolLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>com.hp.school.management.service.SchoolLocalServiceUtil</code>.
	 */
	 
	 public School addSchool(String name, String type, int noOfStudents, String city, long userId, long groupId ) throws PortalException
	 {
		 
		 	School school= SchoolLocalServiceUtil.createSchool(CounterLocalServiceUtil.increment(School.class.getName()));
		 	school.setName(name);
			school.setType(type);
			school.setNoOfstudent(noOfStudents);
			school.setCity(city);
			school.setIsActive(true);
			school.setGroupId(groupId);
			school.setCreatedBy(userId);
			school.setUpdatedBy(userId);
			school.setCreateDate(new Date());
			school.setModifiedDate(new Date());
			school.setIsActive(true);
			SchoolLocalServiceUtil.addSchool(school);
			 
			long[] assetCategoryIds = new long[0];
			String[] assetTagNames= com.liferay.petra.string.StringPool.EMPTY_ARRAY;
			
		 
			
				AssetEntry assetEntry=	assetEntryLocalService.updateEntry(userId,
	                  groupId, school.getCreateDate(),
	                  school.getModifiedDate(), School.class.getName(),
	                  school.getSchoolId(), school.getUuid(), 0,
	                  assetCategoryIds,
	                  assetTagNames, true, true, null, null, null, null,
	                  ContentTypes.TEXT_HTML, school.getName(), null, null, null,
	                  null, 0, 0, null);
				
				assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(),
						assetCategoryIds,
		                  AssetLinkConstants.TYPE_RELATED);
		 
		 	
		 return school;
	 }
	 
	 public School updateSchool(long schoolId, String name, String type, int noOfStudents, String city, long userId, long groupId ) throws PortalException
	 {
		 	School school= SchoolLocalServiceUtil.getSchool(schoolId);
			school.setName(name);
			school.setType(type);
			school.setNoOfstudent(noOfStudents);
			school.setCity(city);
			school.setIsActive(true);
			school.setGroupId(groupId);
			school.setUpdatedBy(userId);
			school.setIsActive(true);
			SchoolLocalServiceUtil.updateSchool(school);
			
			long[] assetCategoryIds = new long[0];
			String[] assetTagNames= com.liferay.petra.string.StringPool.EMPTY_ARRAY;
			
			AssetEntry assetEntry = assetEntryLocalService.updateEntry(
				    userId, school.getGroupId(), school.getCreateDate(),
				    school.getModifiedDate(), School.class.getName(),
				    school.getSchoolId(),school.getUuid(), 0,
				    assetCategoryIds, assetTagNames, true, true, null, null,
				    school.getCreateDate(), null, ContentTypes.TEXT_HTML,
				    school.getName(),null, null, null, null, 0, 0, null);
			assetLinkLocalService.updateLinks(userId, assetEntry.getEntryId(),
					assetCategoryIds,
	                  AssetLinkConstants.TYPE_RELATED);
			
		 return school;
	 }

	 public School removeSchool(School school) throws PortalException
	 {
			 SchoolLocalServiceUtil.deleteSchool(school);
			 AssetEntry assetEntry=assetEntryLocalService.fetchEntry(School.class.getName(), school.getSchoolId());
			 assetEntryLocalService.deleteEntry(assetEntry);
			 assetLinkLocalService.deleteLinks(assetEntry.getEntryId());
			 
			return school;
			
	 }
	 public long removeSchool(long schoolId) throws PortalException
	 {
			 SchoolLocalServiceUtil.deleteSchool(schoolId);
			 AssetEntry assetEntry=assetEntryLocalService.fetchEntry(School.class.getName(), schoolId);
			 assetEntryLocalService.deleteEntry(assetEntry);
			 assetLinkLocalService.deleteLinks(assetEntry.getEntryId());
			 return schoolId;
	 }
	 public List<School> searchSchools(long groupId, String searchKeyword,int start , int end )
	 {		try
			 {
				 DynamicQuery dynamicQuery= SchoolLocalServiceUtil.dynamicQuery();
				 if(Validator.isNotNull(searchKeyword))
				 {
					 Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
					 if(Validator.isNumber(searchKeyword))
					 {
						 disjunction.add(RestrictionsFactoryUtil.eq("schoolId",Long.valueOf(searchKeyword)));
						 disjunction.add(RestrictionsFactoryUtil.eq("noOfstudent",Integer.valueOf(searchKeyword)));
					 }
					 disjunction.add(RestrictionsFactoryUtil.like("name", StringPool.PERCENT+searchKeyword+StringPool.PERCENT));
					 disjunction.add(RestrictionsFactoryUtil.like("type", StringPool.PERCENT+searchKeyword+StringPool.PERCENT));
					 disjunction.add(RestrictionsFactoryUtil.like("city", StringPool.PERCENT+searchKeyword+StringPool.PERCENT));
					 dynamicQuery.add(disjunction);
					 

				 }
				 if(Validator.isNotNull(groupId) && (groupId > 0 ))
				 {
					 dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
				 }
				 dynamicQuery.add(PropertyFactoryUtil.forName("isActive").eq(true));
				 dynamicQuery.setLimit(start, end);
				 
				 return SchoolLocalServiceUtil.dynamicQuery(dynamicQuery);
				 
				 }catch(Exception  exception)
				 {
					 exception.printStackTrace();
				 }
	 		return Collections.EMPTY_LIST;
				 
	 
	 }
	 
	 public int searchSchoolsCount(long groupId, String searchKeyword )
	 {		try
			 {
				 DynamicQuery dynamicQuery= SchoolLocalServiceUtil.dynamicQuery();
				 if(Validator.isNotNull(searchKeyword))
				 {
					 Disjunction disjunction = RestrictionsFactoryUtil.disjunction();
					 if(Validator.isNumber(searchKeyword))
					 {
						 disjunction.add(RestrictionsFactoryUtil.eq("schoolId",Long.valueOf(searchKeyword)));
						 disjunction.add(RestrictionsFactoryUtil.eq("noOfstudent",Integer.valueOf(searchKeyword)));
					 }
					 disjunction.add(RestrictionsFactoryUtil.like("name", StringPool.PERCENT+searchKeyword+StringPool.PERCENT));
					 disjunction.add(RestrictionsFactoryUtil.like("type", StringPool.PERCENT+searchKeyword+StringPool.PERCENT));
					 disjunction.add(RestrictionsFactoryUtil.like("city", StringPool.PERCENT+searchKeyword+StringPool.PERCENT));
					 dynamicQuery.add(disjunction);

				 }
				 if(Validator.isNotNull(groupId) && (groupId > 0 ))
				 {
					 dynamicQuery.add(PropertyFactoryUtil.forName("groupId").eq(groupId));
				 }
				 dynamicQuery.add(PropertyFactoryUtil.forName("isActive").eq(true));
				 dynamicQuery.setProjection(ProjectionFactoryUtil.rowCount());
				 return  (int) SchoolLocalServiceUtil.dynamicQueryCount(dynamicQuery);
				 
			 }catch(Exception  exception)
				 {
					 exception.printStackTrace();
				 }
	 		return -1;
	 
	 }
	
}