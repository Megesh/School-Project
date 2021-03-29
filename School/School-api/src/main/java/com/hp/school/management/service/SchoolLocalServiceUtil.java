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

package com.hp.school.management.service;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for School. This utility wraps
 * <code>com.hp.school.management.service.impl.SchoolLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see SchoolLocalService
 * @generated
 */
public class SchoolLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.hp.school.management.service.impl.SchoolLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the school to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SchoolLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param school the school
	 * @return the school that was added
	 */
	public static com.hp.school.management.model.School addSchool(
		com.hp.school.management.model.School school) {

		return getService().addSchool(school);
	}

	public static com.hp.school.management.model.School addSchool(
			String name, String type, int noOfStudents, String city,
			long userId, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().addSchool(
			name, type, noOfStudents, city, userId, groupId);
	}

	/**
	 * Creates a new school with the primary key. Does not add the school to the database.
	 *
	 * @param schoolId the primary key for the new school
	 * @return the new school
	 */
	public static com.hp.school.management.model.School createSchool(
		long schoolId) {

		return getService().createSchool(schoolId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the school with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SchoolLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param schoolId the primary key of the school
	 * @return the school that was removed
	 * @throws PortalException if a school with the primary key could not be found
	 */
	public static com.hp.school.management.model.School deleteSchool(
			long schoolId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteSchool(schoolId);
	}

	/**
	 * Deletes the school from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SchoolLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param school the school
	 * @return the school that was removed
	 */
	public static com.hp.school.management.model.School deleteSchool(
		com.hp.school.management.model.School school) {

		return getService().deleteSchool(school);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.hp.school.management.model.impl.SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.hp.school.management.model.impl.SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static com.hp.school.management.model.School fetchSchool(
		long schoolId) {

		return getService().fetchSchool(schoolId);
	}

	/**
	 * Returns the school matching the UUID and group.
	 *
	 * @param uuid the school's UUID
	 * @param groupId the primary key of the group
	 * @return the matching school, or <code>null</code> if a matching school could not be found
	 */
	public static com.hp.school.management.model.School
		fetchSchoolByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchSchoolByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the school with the primary key.
	 *
	 * @param schoolId the primary key of the school
	 * @return the school
	 * @throws PortalException if a school with the primary key could not be found
	 */
	public static com.hp.school.management.model.School getSchool(long schoolId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSchool(schoolId);
	}

	/**
	 * Returns the school matching the UUID and group.
	 *
	 * @param uuid the school's UUID
	 * @param groupId the primary key of the group
	 * @return the matching school
	 * @throws PortalException if a matching school could not be found
	 */
	public static com.hp.school.management.model.School
			getSchoolByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getSchoolByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the schools.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.hp.school.management.model.impl.SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @return the range of schools
	 */
	public static java.util.List<com.hp.school.management.model.School>
		getSchools(int start, int end) {

		return getService().getSchools(start, end);
	}

	/**
	 * Returns the number of schools.
	 *
	 * @return the number of schools
	 */
	public static int getSchoolsCount() {
		return getService().getSchoolsCount();
	}

	public static long removeSchool(long schoolId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().removeSchool(schoolId);
	}

	public static com.hp.school.management.model.School removeSchool(
			com.hp.school.management.model.School school)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().removeSchool(school);
	}

	public static java.util.List<com.hp.school.management.model.School>
		searchSchools(long groupId, String searchKeyword, int start, int end) {

		return getService().searchSchools(groupId, searchKeyword, start, end);
	}

	public static int searchSchoolsCount(long groupId, String searchKeyword) {
		return getService().searchSchoolsCount(groupId, searchKeyword);
	}

	public static com.hp.school.management.model.School updateSchool(
			long schoolId, String name, String type, int noOfStudents,
			String city, long userId, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateSchool(
			schoolId, name, type, noOfStudents, city, userId, groupId);
	}

	/**
	 * Updates the school in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect SchoolLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param school the school
	 * @return the school that was updated
	 */
	public static com.hp.school.management.model.School updateSchool(
		com.hp.school.management.model.School school) {

		return getService().updateSchool(school);
	}

	public static SchoolLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SchoolLocalService, SchoolLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SchoolLocalService.class);

		ServiceTracker<SchoolLocalService, SchoolLocalService> serviceTracker =
			new ServiceTracker<SchoolLocalService, SchoolLocalService>(
				bundle.getBundleContext(), SchoolLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}