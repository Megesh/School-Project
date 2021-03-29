create index IX_AB49190F on sch_School (groupId, status);
create index IX_98EE5487 on sch_School (status);
create unique index IX_A3B7DA17 on sch_School (uuid_[$COLUMN_LENGTH:75$], groupId);