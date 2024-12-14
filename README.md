
SOLUTION OF RYANAIR API and Load Testing QA Engineer PROBLEM BEFORE THE TECHNICAL INTERVIEW (TECHNICAL REQUIREMENTS WERE NOT MET NEEDS MODIFICATION)

 including both karate and restassured tests in the same project led to some duplication, as the same positive test cases were repeated across Karate and RestAssured.
There were no negative test cases.
Hardcoded data in the create requests can limit flexibility and scalability, and dynamic data handling is generally preferred.  


# How to Run the Tests

## Prerequisites

- **Java 11 or later installed**  
  Verify the installation:  
  `java -version`

- **Apache Maven 3.6+ installed**  
  Verify the installation:  
  `mvn -v`

- **IDE (IntelliJ IDEA or Eclipse)** or a terminal with Maven configured

---

## Steps to Run Tests

### 1. Clone the Repository

To get started, clone the repository:

git clone https://github.com/KarimBamhaoued/RyanairSolution.git cd RyanairSolution




### 2. Execute All Tests

Run the following command to execute all tests:

mvn test


### 3. Run Specific Tests

To execute a specific test class:

mvn -Dtest=<TestClassName> test


**Example:**

mvn -Dtest=BookingTests test


### 4. Run Specific Feature Files (Karate)

To run a specific Karate feature file:

mvn test -Dkarate.options="src/test/resources/features/<FeatureFileName>.feature"



**Example:**

mvn test -Dkarate.options="src/test/resources/features/Booking.feature"


---

## Viewing Test Results

- **Console Output**:  
  A summary of the test results will appear in the terminal after running the tests.

- **Detailed Test Reports**:  
  Maven Surefire Plugin generates detailed test reports in the following directory:  

target/surefire-reports/


Look for files such as:
- `TEST-com.rya.tests.<ClassName>.xml`

- **HTML Report**:  
If configured, formatted HTML reports are available at:  


target/site/surefire-report.html


---

## Test Framework Choices and Implementation

### Frameworks Used:
- **JUnit 5**:  
Used for unit testing due to its wide adoption, flexibility, and compatibility with modern Java projects.
- **Karate**:  
Ideal for API testing as it allows writing tests in a BDD-style syntax and supports features like data-driven testing and request-response matching out of the box.
- **Rest-Assured**:  
Provides fluent syntax for writing HTTP request assertions in Java.

---

## Reporting

The testing framework automatically generates reports with the following details:
- Test cases executed
- Pass/Fail results
- Errors encountered

### Reports are saved in the following directories:
- `target/surefire-reports/` (Detailed logs)
- `target/site/surefire-report.html` (Formatted HTML report)








