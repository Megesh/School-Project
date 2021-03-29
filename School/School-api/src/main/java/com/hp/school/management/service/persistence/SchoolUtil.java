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

package com.hp.school.management.service.persistence;

import com.hp.school.management.model.School;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the school service. This utility wraps <code>com.hp.school.management.service.persistence.impl.SchoolPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SchoolPersistence
 * @generated
 */
public class SchoolUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(School school) {
		getPersistence().clearCache(school);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, School> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<School> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<School> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<School> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<School> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static School update(School school) {
		return getPersistence().update(school);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static School update(School school, ServiceContext serviceContext) {
		return getPersistence().update(school, serviceContext);
	}

	/**
	 * Returns all the schools where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching schools
	 */
	public static List<School> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the schools where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @return the range of matching schools
	 */
	public static List<School> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the schools where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching schools
	 */
	public static List<School> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<School> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the schools where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching schools
	 */
	public static List<School> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<School> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first school in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public static School findByUuid_First(
			String uuid, OrderByComparator<School> orderByComparator)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first school in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school, or <code>null</code> if a matching school could not be found
	 */
	public static School fetchByUuid_First(
		String uuid, OrderByComparator<School> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last school in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public static School findByUuid_Last(
			String uuid, OrderByComparator<School> orderByComparator)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last school in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school, or <code>null</code> if a matching school could not be found
	 */
	public static School fetchByUuid_Last(
		String uuid, OrderByComparator<School> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the schools before and after the current school in the ordered set where uuid = &#63;.
	 *
	 * @param schoolId the primary key of the current school
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next school
	 * @throws NoSuchSchoolException if a school with the primary key could not be found
	 */
	public static School[] findByUuid_PrevAndNext(
			long schoolId, String uuid,
			OrderByComparator<School> orderByComparator)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByUuid_PrevAndNext(
			schoolId, uuid, orderByComparator);
	}

	/**
	 * Removes all the schools where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of schools where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching schools
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the school where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchSchoolException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public static School findByUUID_G(String uuid, long groupId)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the school where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching school, or <code>null</code> if a matching school could not be found
	 */
	public static School fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the school where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching school, or <code>null</code> if a matching school could not be found
	 */
	public static School fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the school where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the school that was removed
	 */
	public static School removeByUUID_G(String uuid, long groupId)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of schools where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching schools
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the schools where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching schools
	 */
	public static List<School> findByStatus(int status) {
		return getPersistence().findByStatus(status);
	}

	/**
	 * Returns a range of all the schools where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @return the range of matching schools
	 */
	public static List<School> findByStatus(int status, int start, int end) {
		return getPersistence().findByStatus(status, start, end);
	}

	/**
	 * Returns an ordered range of all the schools where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching schools
	 */
	public static List<School> findByStatus(
		int status, int start, int end,
		OrderByComparator<School> orderByComparator) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the schools where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching schools
	 */
	public static List<School> findByStatus(
		int status, int start, int end,
		OrderByComparator<School> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByStatus(
			status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first school in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public static School findByStatus_First(
			int status, OrderByComparator<School> orderByComparator)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the first school in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school, or <code>null</code> if a matching school could not be found
	 */
	public static School fetchByStatus_First(
		int status, OrderByComparator<School> orderByComparator) {

		return getPersistence().fetchByStatus_First(status, orderByComparator);
	}

	/**
	 * Returns the last school in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public static School findByStatus_Last(
			int status, OrderByComparator<School> orderByComparator)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the last school in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school, or <code>null</code> if a matching school could not be found
	 */
	public static School fetchByStatus_Last(
		int status, OrderByComparator<School> orderByComparator) {

		return getPersistence().fetchByStatus_Last(status, orderByComparator);
	}

	/**
	 * Returns the schools before and after the current school in the ordered set where status = &#63;.
	 *
	 * @param schoolId the primary key of the current school
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next school
	 * @throws NoSuchSchoolException if a school with the primary key could not be found
	 */
	public static School[] findByStatus_PrevAndNext(
			long schoolId, int status,
			OrderByComparator<School> orderByComparator)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByStatus_PrevAndNext(
			schoolId, status, orderByComparator);
	}

	/**
	 * Removes all the schools where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	public static void removeByStatus(int status) {
		getPersistence().removeByStatus(status);
	}

	/**
	 * Returns the number of schools where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching schools
	 */
	public static int countByStatus(int status) {
		return getPersistence().countByStatus(status);
	}

	/**
	 * Returns all the schools where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching schools
	 */
	public static List<School> findByG_S(long groupId, int status) {
		return getPersistence().findByG_S(groupId, status);
	}

	/**
	 * Returns a range of all the schools where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @return the range of matching schools
	 */
	public static List<School> findByG_S(
		long groupId, int status, int start, int end) {

		return getPersistence().findByG_S(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the schools where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching schools
	 */
	public static List<School> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<School> orderByComparator) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the schools where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching schools
	 */
	public static List<School> findByG_S(
		long groupId, int status, int start, int end,
		OrderByComparator<School> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_S(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first school in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public static School findByG_S_First(
			long groupId, int status,
			OrderByComparator<School> orderByComparator)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first school in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching school, or <code>null</code> if a matching school could not be found
	 */
	public static School fetchByG_S_First(
		long groupId, int status, OrderByComparator<School> orderByComparator) {

		return getPersistence().fetchByG_S_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last school in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school
	 * @throws NoSuchSchoolException if a matching school could not be found
	 */
	public static School findByG_S_Last(
			long groupId, int status,
			OrderByComparator<School> orderByComparator)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last school in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching school, or <code>null</code> if a matching school could not be found
	 */
	public static School fetchByG_S_Last(
		long groupId, int status, OrderByComparator<School> orderByComparator) {

		return getPersistence().fetchByG_S_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the schools before and after the current school in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param schoolId the primary key of the current school
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next school
	 * @throws NoSuchSchoolException if a school with the primary key could not be found
	 */
	public static School[] findByG_S_PrevAndNext(
			long schoolId, long groupId, int status,
			OrderByComparator<School> orderByComparator)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByG_S_PrevAndNext(
			schoolId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the schools where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeByG_S(long groupId, int status) {
		getPersistence().removeByG_S(groupId, status);
	}

	/**
	 * Returns the number of schools where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching schools
	 */
	public static int countByG_S(long groupId, int status) {
		return getPersistence().countByG_S(groupId, status);
	}

	/**
	 * Caches the school in the entity cache if it is enabled.
	 *
	 * @param school the school
	 */
	public static void cacheResult(School school) {
		getPersistence().cacheResult(school);
	}

	/**
	 * Caches the schools in the entity cache if it is enabled.
	 *
	 * @param schools the schools
	 */
	public static void cacheResult(List<School> schools) {
		getPersistence().cacheResult(schools);
	}

	/**
	 * Creates a new school with the primary key. Does not add the school to the database.
	 *
	 * @param schoolId the primary key for the new school
	 * @return the new school
	 */
	public static School create(long schoolId) {
		return getPersistence().create(schoolId);
	}

	/**
	 * Removes the school with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param schoolId the primary key of the school
	 * @return the school that was removed
	 * @throws NoSuchSchoolException if a school with the primary key could not be found
	 */
	public static School remove(long schoolId)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().remove(schoolId);
	}

	public static School updateImpl(School school) {
		return getPersistence().updateImpl(school);
	}

	/**
	 * Returns the school with the primary key or throws a <code>NoSuchSchoolException</code> if it could not be found.
	 *
	 * @param schoolId the primary key of the school
	 * @return the school
	 * @throws NoSuchSchoolException if a school with the primary key could not be found
	 */
	public static School findByPrimaryKey(long schoolId)
		throws com.hp.school.management.exception.NoSuchSchoolException {

		return getPersistence().findByPrimaryKey(schoolId);
	}

	/**
	 * Returns the school with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param schoolId the primary key of the school
	 * @return the school, or <code>null</code> if a school with the primary key could not be found
	 */
	public static School fetchByPrimaryKey(long schoolId) {
		return getPersistence().fetchByPrimaryKey(schoolId);
	}

	/**
	 * Returns all the schools.
	 *
	 * @return the schools
	 */
	public static List<School> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the schools.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @return the range of schools
	 */
	public static List<School> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the schools.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of schools
	 */
	public static List<School> findAll(
		int start, int end, OrderByComparator<School> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the schools.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SchoolModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of schools
	 * @param end the upper bound of the range of schools (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of schools
	 */
	public static List<School> findAll(
		int start, int end, OrderByComparator<School> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the schools from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of schools.
	 *
	 * @return the number of schools
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static SchoolPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<SchoolPersistence, SchoolPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(SchoolPersistence.class);

		ServiceTracker<SchoolPersistence, SchoolPersistence> serviceTracker =
			new ServiceTracker<SchoolPersistence, SchoolPersistence>(
				bundle.getBundleContext(), SchoolPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}