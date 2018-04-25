# README #
This Read me will explain the test analysis and test design technique followed for software testing of computer database portal. It also includes the test automation framework followed along with it's set up details. It also has different attachments which can give you more details than below.


### What is this repository for? ###
Computer database portal is a web application which will show the list of computers already stored in the system. And the portal contains the facility to Add, Edit, Filter and Delete computers. This repository contains the web automation tests which will test the computer database portal.

### Technologies used ###
* Cucumber
* Serenity 
* Selenium
* Java v1.8
* Maven 
* Junit Framework

### How to understand the test analysis and design ? ###

Test Analysis And Design:

In order to analyse different tests to be done for Computer Database Portal, we need to understand the functional requirements given for this portal. These functional flow requirements are represented in the form of activity flow. The user can take any decision during flow, System should be able to react and cope up with changing decisions of the user. Thus decision tables are derived using the activity flow. And these decision tables, gives us different possible test combinations. Using these test combinations, all the possible logical test scenarios and test cases are derived. And Thus traceability matrix has been created with test scenarios, test cases along with expected result.


Test Automation:

These scenarios, in turn has multiple different test cases where in user might give different inputs(valid or invalid). Thus the most used test scenarios are been chosen for automation so that ROI will be good enough compared to manual testing. Besides, this automation set up can also be set up in continuous integration platform, so that application healthyness can be assessed in quicker way amidst changing requirements for this portal.

References:

* For better understanding of "Test Analysis", "Test Scenarios" and "Requirements", Refer to Excel sheet "TestAnalysis_ComputerDatabaseV1.0" in the location mentioned below.
* Test Analysis Method : Decision Table Mapping, traceability matrix.
* Requirements: Activity Flow
* Location: src/test/resources/testanalysis

### Project Setup:

Project contains the below set of folders:

 `src/test/java` 
 	
     Packages
     - com.computerdatabase.webautomation.pageactions     (Package with all the actions that are performed in a page.)
	 - com.computerdatabase.webautomation.pageobjects     (Pacakge with necessary elements located for individual pages, which can be reused directly in the tests.)	
     - com.computerdatabase.webautomation.runner          (Package with the main runner file, which needs to be exeucted to run the whole test)
     - com.computerdatabase.webautomation.stepDefinitions (Package where the actual test steps are implemented)   
     
`src/test/resources`
	
	Sub-Folders
	- drivers  (Folder with ChromeDriver - it can be used to place the driver of the choice)
	- features (Feature files created with Gherkin language using cucumber)
	- testdata (File with input data like url,credentials and employee details)

 `pom.xml`
 
	- It contains external dependencies and plugins of serenity which are needed to run/build the project. 
	  Using this file, complete automation tests can be run.
	
  `serenity.properties` 
 
    - It contains all the external properties such as browser, implicit timeouts, decision about 
	  when to take screenshots, Details needed in the report.
	
Note:
  
   - "target" folder has been committed to demonstrate sample execution report with our having to run the complete test suite. 
      If you can successfully run the tests, execution report will automatically be generated.
	
### Test Reports Location after the test run completion :
	- target/site/serenity/index.html.

### Automation Test details :

This automation test suite will use Features files where test scenarios are described and will execute the tests, will generate a test report along with screenshots of the test.
Besides screenshots, test report gives other details such as "time taken to run each test", "overall test results", "features and it's corresponding tests with screenshots"..etc.
In this project, chrome browser has been used for testing the application. we can configure browser of our choice(in "serenity.properties") and corresponding driver, and thus the test can run independent of 
the platform.
	
### Required Software/tools: 
* Java 8
* Any IDE like Eclipse, IntelliJ..etc
* Maven

### How to execute this project :

Steps to be followed in order to run this test suite:
	
	Step 1: Clone this repository using SourceTree(or any other tool) and get the project setup on to your workspace.
	Step 2: Use IDE to open the project and build the project.
	Step 3: Open pom.xml file in IDE, and run as "mvn test".(or)

	Step 4: Open Terminal at project directory level, run the command “mvn verify”.
  	Step 5: At the end of test execution, execution report can be found in 'target/site/serenity/index.html'.									

Note:
Make sure to have system variable has been set for the driver in which you want the tests to be run.

### Who do I talk to? ###
Please reach out to me at prabhukiran.narava@gmail.com in case of questions and clarifications related to above set up.
