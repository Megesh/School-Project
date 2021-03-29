create table sch_School (
	uuid_ VARCHAR(75) null,
	schoolId LONG not null primary key,
	groupId LONG,
	name VARCHAR(75) null,
	type_ VARCHAR(75) null,
	city VARCHAR(75) null,
	noOfstudent INTEGER,
	createdBy LONG,
	updatedBy LONG,
	createDate DATE null,
	modifiedDate DATE null,
	isActive BOOLEAN,
	status INTEGER
);