
## Student Management System

## TABLE OF CONTENTS
* [Introduction](#introduction)
* [Technologies](#technologies)
* [Launch](#launch)
* [Technical Documentation of the application](#technical-documentation-of-the-application)
* [Scope of functionalities](#scope-of-functionalities)
* [Sources](#sources)
* [Project status](#project-status)

## INTRODUCTION
 This project exists for the purpose of practing and extending my knowledge of Java and the Spring Framework. 

## TECHNOLOGIES
- Java 8
- Spring MVC
- Spring Security
- Spring Data JPA
- Hibernate
- Thymeleaf
- Maven
- HTML
- SQL
- MySQL Workbench

## LAUNCH
**Running the application with Eclipse IDE**
1. Download the project as a .zip file.
2. Unzip the file.
3. Open the Command Prompt (if you’re using a MAC OS, search for “Terminal”) and switch to the directory to the folder that contains the pom.xml file (cd  C:/your_project_directory/pom.xml)
4. Open Eclipse: File -> Import -> Existing Maven Project -> Navigate where you unzipped the project -> Select the project
5. Open the package “com.maddy”, right click on “SchoolManagementSystemApplication.java” and choose “Run as a Java Application”. 
6. Type http://localhost:8080/login in your local browser.

**Running the application with Maven**
1. In the Command Prompt, change the directory to the directory where your application is located (cd C:/your_project_directory).
2. Run the following command: 
``` 
$ git clone https://github.com/MaddyGre/student-management-system.git
$ cd student-management-system
$ mvn spring-boot:run
```
3. Type http://localhost:8080/login in your local browser.

## TECHNICAL DOCUMENTATION OF THE APPLICATION
Login: username is “admin” (all lowercase) and the password is the same as the username. 
![SignIn](https://user-images.githubusercontent.com/45042001/111651980-99fefd00-87fe-11eb-8538-ff592635dece.PNG)

If the password is incorrect, the application will display “Bad credentials”.
![BadCredentials](https://user-images.githubusercontent.com/45042001/111651920-8fdcfe80-87fe-11eb-8bbb-28759c545e52.PNG)

Once you enter the correct credentials and press the “Sign in” button, you will be able to see the table that displays a list of the students already present in the database.
![Student_table](https://user-images.githubusercontent.com/45042001/111652009-a08d7480-87fe-11eb-9744-754f60382fbd.PNG)

If you click on the “Add a new student” hyperlink, you can add a new student using the below form. Notice that all of the fields must be filled, otherwise the form will display error messages and it will not save into the database.
![addStudent_ErrorMessages](https://user-images.githubusercontent.com/45042001/111651905-8d7aa480-87fe-11eb-9a3f-b7983aa00dd0.PNG)

![addStudent_OneFieldBlank](https://user-images.githubusercontent.com/45042001/111651911-8eabd180-87fe-11eb-839f-692b7be969bb.PNG)

![addStudent_allFieldsEntered](https://user-images.githubusercontent.com/45042001/111651899-8c497780-87fe-11eb-8b89-94020dbb5088.PNG)

The new student “Sebastian” has been added at the end of the table.

![Student_added](https://user-images.githubusercontent.com/45042001/111651993-9c615700-87fe-11eb-9274-080c4e24ac34.PNG)

The new student has also been added to the database.
![student_addedSQL](https://user-images.githubusercontent.com/45042001/111652002-9ec3b100-87fe-11eb-8c69-d8d7534569d7.PNG)

You can also edit an existing student by clicking the “Edit” hyperlink.
As an example, you can modify the student with the ID of 1003. He is studying Business, instead of Sports.
![edit_student](https://user-images.githubusercontent.com/45042001/111651954-953a4900-87fe-11eb-9690-52879341df63.PNG)

We can see that the table has been updated.
![updated_studentTable](https://user-images.githubusercontent.com/45042001/111652030-a420fb80-87fe-11eb-97d1-7dcd79df5799.PNG)

Changes are also reflected in the database.
![updated_studentSQL](https://user-images.githubusercontent.com/45042001/111652017-a2573800-87fe-11eb-9156-cc57137d600f.PNG)

The application also allows the deletion of a student by clicking on the “Delete” hyperlink. Let’s try to delete the student with ID 1000. 
![deleted_student](https://user-images.githubusercontent.com/45042001/111651930-91a6c200-87fe-11eb-8d9e-13863eaefafb.PNG)

The table no longer displays the student with ID 1000. The student has also been deleted from the database. 
![deleted_studentSQL](https://user-images.githubusercontent.com/45042001/111651935-92d7ef00-87fe-11eb-8ad2-b573ce01182e.PNG)

Once you have completed all the desired amendments, you can log out of the system by clicking the logout button above the table.
![logout](https://user-images.githubusercontent.com/45042001/111651963-979ca300-87fe-11eb-9439-04ef6242e662.PNG)

## SCOPE OF FUNCTIONALITIES
- Login
- Logout
- Add a new student
- Edit/Update an existing student
- Delete a student
- Perform validation
## SOURCES
- [Spring Boot CRUD Example with Spring MVC – Spring Data JPA – ThymeLeaf - Hibernate - MySQL](https://www.codejava.net/frameworks/spring-boot/spring-boot-crud-example-with-spring-mvc-spring-data-jpa-thymeleaf-hibernate-mysql)
- [Spring Boot Security Form Authentication with JDBC and MySQL](https://www.codejava.net/frameworks/spring-boot/form-authentication-with-jdbc-and-mysql)
- [Spring Boot Security HTTP Basic Authentication with in-memory users](https://www.codejava.net/frameworks/spring-boot/http-basic-authentication-with-in-memory-users)
- [Spring Boot Thymeleaf Form Data Validation with Bean Validator](https://stackabuse.com/spring-boot-thymeleaf-form-data-validation-with-bean-validator/)

### PROJECT STATUS
Completed










