package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ToolsQAMain {

    WebDriver driver;

    public ToolsQAMain(WebDriver webDriver){
        driver = webDriver;
    }

    public WebElement findlogo(){
        WebElement logo = driver.findElement(By.xpath("//img[@alt='Tools QA']"));
        return logo;
    }

    public WebElement findDemoSite(){
        WebElement demosite = driver.findElement(By.xpath("//ul[@class='navbar__links d-none d-lg-flex']//a[normalize-space()='Demo Site']"));
        return demosite;
    }
}
