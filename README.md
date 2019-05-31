# AutomationBddFramework
Author : Mohammad Parvez

This Repo is for BDD automation framework using java , selenium and cucumber

Summary:
This Test Automation Framework serves the purpose of automating the test cases and getting the tests results. Please refer the below mentioned guidelines/prerequisites for the same.

System Requirement:
-  JDK 1.8 or above
-  Maven 3.1 or above
-  Any cucumber version (Latest is preferable)
-  Eclipse or IDE of choice in case there is need to update the script. (optional)
-  Netbeans : Preferred for additional features like auto-code indentation, dependency error detection & many more.

Test Execution:
-  For Execution of tests Use RunnerClass in "MashreqbankFramework\src\main\java\com\masherqbank\runner"
-  In tags option of runner class put the Tag of one or more feature file you want to execute
-  USer Or for executing multiple feature all together
- tags = {"@Homepage or @ContactUs"}

Guidelines for code review:
-  Use camelCase coding conventions for writing test scripts literals (method names , keywords , variable Names & locators in spec files)
-  Action files contain locator for all the pages . If test cases fails due to NoSuchElementException , change the locator values.
-  Plugins to be managed via POM only. Please don't add any external jars/exe in project.
-  Assign specific names for the variables
-  Remove dead/obsolete code/warnings if any
-  Don't use system.out.print() to print the logs. use Reporter class methods
-  Write JavaDoc for each method


Result Files:
The Test Execution Results will be stored in the following directory once the test has completed


Html Reports
.target\site\cucumber-pretty\index.html


Cucumber Reports :
-  Once Test execution got completed Please run "mvn install" and cucumber reports will be availble in 
.target\site\cucumber-reports\cucumber-html-reports\overview-features.html
