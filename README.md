# AutomatedTestingExample

﻿# AUTOMATED TESTING EXAMPLE

This is a project created to test mock website. This test will run a simple script then fail to show demonstrate the Allure report.

This test can be done by using various browsers such as below:
## Chrome Webdriver
``` java
System.setProperty("webdriver.chrome.driver","src/test/drivers/chromedriver.exe");
ChromeOptions chromeOption = new ChromeOptions();
chromeOption.addArguments("--remote-allow-origins=*");
 driver = new ChromeDriver(chromeOption);
```
## Firefox Webdriver
``` java
System.setProperty("webdriver.gecko.driver","src/test/drivers/geckodriver.exe");
System.setProperty("webdriver.firefox.bin", "C:/Program Files/Mozilla Firefox/firefox.exe/");
driver = new FirefoxDriver();
```

## Microsoft Edge Webdriver
``` java
System.setProperty("webdriver.edge.driver", "src/test/drivers/msedgedriver.exe");
driver = new EdgeDriver();
```