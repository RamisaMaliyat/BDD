# Wikipedia Automation Testing

This project automates the search and PDF download process on the [Wikipedia website](https://www.wikipedia.org/). The test case demonstrates how to search for "Albert Einstein", navigate to the page information, and download the page as a PDF from the Tools section.

## Testing Scripts

The purpose of this project is to create an automated test suite using Selenium and Java for interacting with the Wikipedia site. The automation script performs the following steps:
1. Navigate to [Wikipedia](https://www.wikipedia.org/).
2. Search for "Albert Einstein".
3. Open the resulting page for "Albert Einstein".
4. Navigate to the "Page information" option under the Tools menu.
5. Download the page as a PDF.

## Project Overview
The tests are written in **BDD** style using **Cucumber**, and the **Aquality Framework** is used to simplify Selenium-based test automation. **Allure Reports** are used to generate detailed reports for test execution.

## Technologies Used
- **Programming Language**: Java
- **Test Automation Framework**: Aquality Framework
- **Test Style**: BDD (Cucumber)
- **Web Automation Tool**: Selenium WebDriver
- **Reporting**: Allure Reports
- **Build Tool**: Maven

## Prerequisites
Before running the tests, make sure you have the following installed:
- **Java** (JDK 8 or higher)
- **Maven** (to build the project and manage dependencies)
- **Allure** (for generating test reports)
- **Git** (to clone the repository)

## Setup Instructions
1. Clone the repository:
      ```bash
   git clone https://github.com/RamisaMaliyat/BDD.git
        
2. Install the project dependencies using Maven:
      ```bash
   mvn clean install
3. Running the Tests:
    ```bash
   mvn clean test
This command will execute the BDD test scenarios defined in the features folder and run them through the Aquality Framework with Selenium.
4. Allure Reports:
    ```bash
   allure serve target/allure-results
This will open a local server with the test report, providing insights into each test scenario, including steps, passed/failed status, screenshots, and more.

## Test Structure
The tests are written using BDD, with scenarios defined in .feature files located in the **src/test/resources/features** directory. The corresponding step definitions are implemented in the **src/test/java/steps** directory.
  
   
