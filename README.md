
## Student Management system

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
