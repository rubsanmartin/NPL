# Automation Archetype

# Java 17 Project with Cucumber, Selenium, and Maven

This is a Java 17 project that uses Cucumber, Selenium, and Maven to automate testing of a web application.

## Prerequisites

- Java 17 or higher installed on your system.
- Maven installed on your system.
- A Java-compatible IDE, such as Eclipse or IntelliJ IDEA.

## Project Setup

1. Clone this repository to your local machine.
2. Open your IDE and import the project as an existing Maven project.
3. Run the command `mvn clean install` in the root directory of the project to download Maven dependencies.

### Environment Setup

- Install [JDK 17](https://www3.ntu.edu.sg/home/ehchua/programming/howto/JDK_Howto.html)
- Install [Maven](https://maven.apache.org/install.html)
- Install [Chrome](https://www.google.com/intl/es-419/chrome/) / [firefox](https://www.mozilla.org/es-CL/firefox/new/)

### Running the tests
```
$ mvn integration-test
```

## Project Structure

- The `src/test/java/cucumber/` directory contains the source code for the tests.
- The `src/test/resources` directory contains resource files for the tests, such as Cucumber feature files.
- The `pom.xml` file contains the Maven configuration for the project.

## Technologies Used

- Java 17
- Cucumber
- Selenium
- Maven

### Resources
##### [Cucumber Docs](https://cucumber.io/docs)

##### [Cucumber School Lessons](https://cucumber.io/school#lessons)

##### [SeleniumHQ Documentation](http://www.seleniumhq.org/docs/)

##### [Junit Documentation](http://junit.org/javadoc/latest/index.html)

##### [Java Documentation](https://docs.oracle.com/javase/7/docs/api/)

##### [Stack Overflow](http://stackoverflow.com/)
* A great resource to search for issues not explicitly covered by documentation.