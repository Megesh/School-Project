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

package com.hp.school.management.model.impl;

import com.hp.school.management.model.School;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing School in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class SchoolCacheModel implements CacheModel<School>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof SchoolCacheModel)) {
			return false;
		}

		SchoolCacheModel schoolCacheModel = (SchoolCacheModel)object;

		if (schoolId == schoolCacheModel.schoolId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, schoolId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", schoolId=");
		sb.append(schoolId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", name=");
		sb.append(name);
		sb.append(", type=");
		sb.append(type);
		sb.append(", city=");
		sb.append(city);
		sb.append(", noOfstudent=");
		sb.append(noOfstudent);
		sb.append(", createdBy=");
		sb.append(createdBy);
		sb.append(", updatedBy=");
		sb.append(updatedBy);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", isActive=");
		sb.append(isActive);
		sb.append(", status=");
		sb.append(status);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public School toEntityModel() {
		SchoolImpl schoolImpl = new SchoolImpl();

		if (uuid == null) {
			schoolImpl.setUuid("");
		}
		else {
			schoolImpl.setUuid(uuid);
		}

		schoolImpl.setSchoolId(schoolId);
		schoolImpl.setGroupId(groupId);

		if (name == null) {
			schoolImpl.setName("");
		}
		else {
			schoolImpl.setName(name);
		}

		if (type == null) {
			schoolImpl.setType("");
		}
		else {
			schoolImpl.setType(type);
		}

		if (city == null) {
			schoolImpl.setCity("");
		}
		else {
			schoolImpl.setCity(city);
		}

		schoolImpl.setNoOfstudent(noOfstudent);
		schoolImpl.setCreatedBy(createdBy);
		schoolImpl.setUpdatedBy(updatedBy);

		if (createDate == Long.MIN_VALUE) {
			schoolImpl.setCreateDate(null);
		}
		else {
			schoolImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			schoolImpl.setModifiedDate(null);
		}
		else {
			schoolImpl.setModifiedDate(new Date(modifiedDate));
		}

		schoolImpl.setIsActive(isActive);
		schoolImpl.setStatus(status);

		schoolImpl.resetOriginalValues();

		return schoolImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		schoolId = objectInput.readLong();

		groupId = objectInput.readLong();
		name = objectInput.readUTF();
		type = objectInput.readUTF();
		city = objectInput.readUTF();

		noOfstudent = objectInput.readInt();

		createdBy = objectInput.readLong();

		updatedBy = objectInput.readLong();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();

		isActive = objectInput.readBoolean();

		status = objectInput.readInt();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(schoolId);

		objectOutput.writeLong(groupId);

		if (name == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(name);
		}

		if (type == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(type);
		}

		if (city == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(city);
		}

		objectOutput.writeInt(noOfstudent);

		objectOutput.writeLong(createdBy);

		objectOutput.writeLong(updatedBy);
		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		objectOutput.writeBoolean(isActive);

		objectOutput.writeInt(status);
	}

	public String uuid;
	public long schoolId;
	public long groupId;
	public String name;
	public String type;
	public String city;
	public int noOfstudent;
	public long createdBy;
	public long updatedBy;
	public long createDate;
	public long modifiedDate;
	public boolean isActive;
	public int status;

}