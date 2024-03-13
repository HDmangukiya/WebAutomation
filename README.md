Overview
======

This document provides instructions for setting up the test automation framework.

Framework: Java, Cucumber, Selenium



\
Requirements
======
    
1. Minimum Windows 10 or macOS 

2. Chrome browser (tested with version 86)
    
3. Java Development Kit (JDK): Ensure Java is installed on the system. Download from here
    \
    https://www.oracle.com/java/technologies/javase-downloads.html

4. Maven: Install Maven on the system. Download from
    \
    https://maven.apache.org/index.html


\
Setup Instructions
======

1. Check Java Installation: Open terminal and type the following command:

    ```console
    java -version
    ```
    \


2. Check Maven Installation:
    ```console
    mvn -version
    ```
    \

3. Clone project in a working folder via the following command:
    ```console
       https://github.com/HDmangukiya/WebAutomation
    ```

4. Navigate to Project Directory:
    ```console
    cd westpac-kiwisaver-java
    ```

5. Download Chrome Webdriver: https://chromedriver.chromium.org/downloads

    Chrome Version 86: https://chromedriver.storage.googleapis.com/index.html?path=86.0.4240.22/

    Extract the executable file and make note of the path


\
Running Tests
======

\
Type the following to run **_Test User Story 1_**
```console
    mvn clean test
```



