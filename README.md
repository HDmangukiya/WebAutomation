Introduction
======

Following instructions are for setup of test automation framework.

Framework: Java, Cucumber, Selenium



\
Prerequisites
======
    
1. Minimum Windows 10 or macOS 

2. Chrome browser (tested with version 86)

3. Git (https://git-scm.com/download/win)

    \
    32-bit: https://github.com/git-for-windows/git/releases/download/v2.28.0.windows.1/Git-2.28.0-32-bit.exe
    
    \
    64-bit: https://github.com/git-for-windows/git/releases/download/v2.28.0.windows.1/Git-2.28.0-64-bit.exe

    
4. Java installed on the system
    \
    https://www.oracle.com/java/technologies/javase-downloads.html

5. Maven installed on the system
    \
    https://maven.apache.org/index.html


\
Installation
======

1. Confirm Java on System by typing the following command in terminal:

    ```console
    java -version
    ```
    \
    Expected output similar to:

    ```console
    openjdk version "1.8.0_212"
    ```

2. Confirm Maven via the following command:
    ```console
    mvn -version
    ```
    \
    You should get an output similar to:

    ```console
    Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
    ```

3. Clone project in a working folder via the following command:
    ```console
    git clone https://github.com/blueflamer/westpac-kiwisaver-java.git
    ```

4. After successful clone, change to project directory:
    ```console
    cd westpac-kiwisaver-java
    ```

5. Download chrome Webdriver from: https://chromedriver.chromium.org/downloads

    Chrome Version 86: https://chromedriver.storage.googleapis.com/index.html?path=86.0.4240.22/

    Extract the executable file and make note of the path

6. In the project folder, locate "src\test\java\kiwisaver\WebDriverFactory.java", change the WEBDRIVER_PATH String value to the path at Step 5 and save the file.



\
Running Tests
======

\
Type the following to run **_Test User Story 1_**
```console
    mvn test
```



