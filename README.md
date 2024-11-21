# How to Run the Tests

## Prerequisites
- Java 11 or later installed
- Maven 3.6+ installed
- IDE (IntelliJ IDEA or Eclipse) or terminal with Maven available

Ensure the following tools are installed on your machine:
- **Java Development Kit (JDK 11 or later)**  
  Verify the installation:
  ```bash
java -version
Apache Maven:
Verify the installation:
mvn -v

## Steps to Run Tests
Clone the Repository:
git clone https://github.com/KarimBamhaoued/RyanairSolution.git
cd RyanairSolution

Execute All Tests
mvn test

Run Specific Tests
mvn -Dtest=<TestClassName> test


Example:


mvn -Dtest=BookingTests test


Run Specific Feature Files (Karate)
To run a specific Karate feature file:


mvn test -Dkarate.options="src/test/resources/features/<FeatureFileName>.feature"
Example:

mvn test -Dkarate.options="src/test/resources/features/Booking.feature"




Viewing Test Results
Console Output: The summary of test results will appear in the terminal.
Detailed Test Reports: Maven Surefire Plugin generates detailed test reports in the following directory:

 
target/surefire-reports/
Look for files such as:
TEST-com.rya.tests.<ClassName>.xml
HTML Report: If configured, HTML reports are available at:
target/site/surefire-report.html




Test Framework Choices and Implementation
JUnit 5: Used for unit testing due to its wide adoption, flexibility, and compatibility with modern Java projects.
Karate: Ideal for API testing as it allows writing tests in a BDD-style syntax and supports features like data-driven testing and request-response matching out of the box.
Rest-Assured: Provides fluent syntax for writing HTTP request assertions in Java.
Reporting
The testing framework automatically generates reports with details like:

Test cases executed.
Pass/Fail results.
Errors encountered.
Reports are saved in the following directories:

target/surefire-reports/ (Detailed logs).
target/site/surefire-report.html (Formatted HTML report).



