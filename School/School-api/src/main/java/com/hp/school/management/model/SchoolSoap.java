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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SchoolSoap implements Serializable {

	public static SchoolSoap toSoapModel(School model) {
		SchoolSoap soapModel = new SchoolSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setSchoolId(model.getSchoolId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setName(model.getName());
		soapModel.setType(model.getType());
		soapModel.setCity(model.getCity());
		soapModel.setNoOfstudent(model.getNoOfstudent());
		soapModel.setCreatedBy(model.getCreatedBy());
		soapModel.setUpdatedBy(model.getUpdatedBy());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setIsActive(model.isIsActive());
		soapModel.setStatus(model.getStatus());

		return soapModel;
	}

	public static SchoolSoap[] toSoapModels(School[] models) {
		SchoolSoap[] soapModels = new SchoolSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static SchoolSoap[][] toSoapModels(School[][] models) {
		SchoolSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new SchoolSoap[models.length][models[0].length];
		}
		else {
			soapModels = new SchoolSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static SchoolSoap[] toSoapModels(List<School> models) {
		List<SchoolSoap> soapModels = new ArrayList<SchoolSoap>(models.size());

		for (School model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new SchoolSoap[soapModels.size()]);
	}

	public SchoolSoap() {
	}

	public long getPrimaryKey() {
		return _schoolId;
	}

	public void setPrimaryKey(long pk) {
		setSchoolId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getSchoolId() {
		return _schoolId;
	}

	public void setSchoolId(long schoolId) {
		_schoolId = schoolId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getType() {
		return _type;
	}

	public void setType(String type) {
		_type = type;
	}

	public String getCity() {
		return _city;
	}

	public void setCity(String city) {
		_city = city;
	}

	public int getNoOfstudent() {
		return _noOfstudent;
	}

	public void setNoOfstudent(int noOfstudent) {
		_noOfstudent = noOfstudent;
	}

	public long getCreatedBy() {
		return _createdBy;
	}

	public void setCreatedBy(long createdBy) {
		_createdBy = createdBy;
	}

	public long getUpdatedBy() {
		return _updatedBy;
	}

	public void setUpdatedBy(long updatedBy) {
		_updatedBy = updatedBy;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public boolean getIsActive() {
		return _isActive;
	}

	public boolean isIsActive() {
		return _isActive;
	}

	public void setIsActive(boolean isActive) {
		_isActive = isActive;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	private String _uuid;
	private long _schoolId;
	private long _groupId;
	private String _name;
	private String _type;
	private String _city;
	private int _noOfstudent;
	private long _createdBy;
	private long _updatedBy;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _isActive;
	private int _status;

}