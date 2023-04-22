package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DemoSite {

    WebDriver driver;

    public DemoSite(WebDriver webDriver){
        driver = webDriver;
    }

    public WebElement formscard(){
//        WebElement forms = driver.findElement(By.xpath("//div[@class='category-cards']//div[1]//div[1]//div[2]"));
        WebElement forms = driver.findElement(By.xpath("//*[contains(text(),'Forms')]"));
        return forms;
    }

    public void enterForms(){
        driver.navigate().to("https://demoqa.com/forms");
    }
}
