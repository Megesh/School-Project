# School-Project

Liferay Basic setup for  School Project

1. Java – (Install Java from 8 to higher version )

2. Maven , ANT -- latest version.
Set your Java, maven, ant home

3. Liferay 7.2.1 GA2 bundled with tomcat
Download link-- https://sourceforge.net/projects/lportal/files/Liferay%20Portal/7.2.1%20GA2/liferay-ce-portal-tomcat-7.2.1-ga2-20191111141448326.tar.gz/download

4. Database:
Can be any database compatible with Liferay 7.2CE. Please check the below link for comptability
https://www.liferay.com/documents/10182/246659966/Liferay+DXP+7.2+Compatibility+Matrix.pdf/ed234765-db47-c4ad-7c82-2acb4c73b0f9
( I Used Database : Mysql 5.7 )

5. Start your server and connect to Database.
  
6) Create Site Role as given in requirement 
        a) School Admin
        b) Principal
7) Assign Permissions to Role like below

	School Admin :-
	a)Add School Details
	b)Update School Details
	c)Delete School Details

        Principal :-    
	a)Update School Details

7) Create some sample user and assign users to site and assign site role to users which we created.

	For ex. 
	demouser1@gmail.com  test  School Admin
	demouser2@gmail.com   test  Principal 
	demouser3@gmail.com  test  (no need  assign any role)

8) Login With the Super Admin and create page and drop SchoolManagement portlet on the page 
9) Login With Created Users to check functionalities of School Management.
