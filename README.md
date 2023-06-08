### README: Test Framework

This is BDD framework with Maven Build automation tool.
Test variables are stored in .properties file to avoid hardcoding in
source code. I have used **Selenium**, **JUnit** and **Cucumber** to create and automate
given scenarios. I have also used **JavaFaker** for generating random data.

I have used **Singleton design pattern** to get the same instance of WebDriver every time
I call it; and **Page Object Model Pattern** to store all page's WebElements in separate
Java class. I have created **TestRunner** class to run all features and scenarios.

I use **Maven Cucumber Reporting** plugin along with **Json** plugin to generate readable and
organized HTML reports. These reports are generated when running tests with Maven lifecycle
commands. To be able to do that, I have added **Maven Surefire** plugin as well.

To trigger tests run : **mvn clean test** or **mvn clean verify**. To run specific scenarios with tag run
**mvn clean test -D tags="regression"**