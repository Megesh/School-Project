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

package com.hp.school.management.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link School}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see School
 * @generated
 */
public class SchoolWrapper
	extends BaseModelWrapper<School> implements ModelWrapper<School>, School {

	public SchoolWrapper(School school) {
		super(school);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("schoolId", getSchoolId());
		attributes.put("groupId", getGroupId());
		attributes.put("name", getName());
		attributes.put("type", getType());
		attributes.put("city", getCity());
		attributes.put("noOfstudent", getNoOfstudent());
		attributes.put("createdBy", getCreatedBy());
		attributes.put("updatedBy", getUpdatedBy());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("isActive", isIsActive());
		attributes.put("status", getStatus());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long schoolId = (Long)attributes.get("schoolId");

		if (schoolId != null) {
			setSchoolId(schoolId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String type = (String)attributes.get("type");

		if (type != null) {
			setType(type);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		Integer noOfstudent = (Integer)attributes.get("noOfstudent");

		if (noOfstudent != null) {
			setNoOfstudent(noOfstudent);
		}

		Long createdBy = (Long)attributes.get("createdBy");

		if (createdBy != null) {
			setCreatedBy(createdBy);
		}

		Long updatedBy = (Long)attributes.get("updatedBy");

		if (updatedBy != null) {
			setUpdatedBy(updatedBy);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Boolean isActive = (Boolean)attributes.get("isActive");

		if (isActive != null) {
			setIsActive(isActive);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}
	}

	/**
	 * Returns the city of this school.
	 *
	 * @return the city of this school
	 */
	@Override
	public String getCity() {
		return model.getCity();
	}

	/**
	 * Returns the create date of this school.
	 *
	 * @return the create date of this school
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the created by of this school.
	 *
	 * @return the created by of this school
	 */
	@Override
	public long getCreatedBy() {
		return model.getCreatedBy();
	}

	/**
	 * Returns the group ID of this school.
	 *
	 * @return the group ID of this school
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the is active of this school.
	 *
	 * @return the is active of this school
	 */
	@Override
	public boolean getIsActive() {
		return model.getIsActive();
	}

	/**
	 * Returns the modified date of this school.
	 *
	 * @return the modified date of this school
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this school.
	 *
	 * @return the name of this school
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the no ofstudent of this school.
	 *
	 * @return the no ofstudent of this school
	 */
	@Override
	public int getNoOfstudent() {
		return model.getNoOfstudent();
	}

	/**
	 * Returns the primary key of this school.
	 *
	 * @return the primary key of this school
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the school ID of this school.
	 *
	 * @return the school ID of this school
	 */
	@Override
	public long getSchoolId() {
		return model.getSchoolId();
	}

	/**
	 * Returns the status of this school.
	 *
	 * @return the status of this school
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the type of this school.
	 *
	 * @return the type of this school
	 */
	@Override
	public String getType() {
		return model.getType();
	}

	/**
	 * Returns the updated by of this school.
	 *
	 * @return the updated by of this school
	 */
	@Override
	public long getUpdatedBy() {
		return model.getUpdatedBy();
	}

	/**
	 * Returns the uuid of this school.
	 *
	 * @return the uuid of this school
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns <code>true</code> if this school is is active.
	 *
	 * @return <code>true</code> if this school is is active; <code>false</code> otherwise
	 */
	@Override
	public boolean isIsActive() {
		return model.isIsActive();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the city of this school.
	 *
	 * @param city the city of this school
	 */
	@Override
	public void setCity(String city) {
		model.setCity(city);
	}

	/**
	 * Sets the create date of this school.
	 *
	 * @param createDate the create date of this school
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the created by of this school.
	 *
	 * @param createdBy the created by of this school
	 */
	@Override
	public void setCreatedBy(long createdBy) {
		model.setCreatedBy(createdBy);
	}

	/**
	 * Sets the group ID of this school.
	 *
	 * @param groupId the group ID of this school
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets whether this school is is active.
	 *
	 * @param isActive the is active of this school
	 */
	@Override
	public void setIsActive(boolean isActive) {
		model.setIsActive(isActive);
	}

	/**
	 * Sets the modified date of this school.
	 *
	 * @param modifiedDate the modified date of this school
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this school.
	 *
	 * @param name the name of this school
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the no ofstudent of this school.
	 *
	 * @param noOfstudent the no ofstudent of this school
	 */
	@Override
	public void setNoOfstudent(int noOfstudent) {
		model.setNoOfstudent(noOfstudent);
	}

	/**
	 * Sets the primary key of this school.
	 *
	 * @param primaryKey the primary key of this school
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the school ID of this school.
	 *
	 * @param schoolId the school ID of this school
	 */
	@Override
	public void setSchoolId(long schoolId) {
		model.setSchoolId(schoolId);
	}

	/**
	 * Sets the status of this school.
	 *
	 * @param status the status of this school
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the type of this school.
	 *
	 * @param type the type of this school
	 */
	@Override
	public void setType(String type) {
		model.setType(type);
	}

	/**
	 * Sets the updated by of this school.
	 *
	 * @param updatedBy the updated by of this school
	 */
	@Override
	public void setUpdatedBy(long updatedBy) {
		model.setUpdatedBy(updatedBy);
	}

	/**
	 * Sets the uuid of this school.
	 *
	 * @param uuid the uuid of this school
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	protected SchoolWrapper wrap(School school) {
		return new SchoolWrapper(school);
	}

}