package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResults {

    WebDriver driver;

    public SearchResults(WebDriver webDriver){
        driver = webDriver;
    }

    public WebElement findToolsQA(){
        WebElement toolsqa = driver.findElement(By.xpath("//h3[normalize-space()='Tools QA']"));
        return toolsqa;
    }
}
