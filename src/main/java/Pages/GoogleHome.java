package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHome {

    WebDriver driver;

    public GoogleHome(WebDriver webDriver){
        driver = webDriver;
    }

    public WebElement findSearchBar(){
        WebElement searchbar = driver.findElement(By.id("APjFqb"));
        return searchbar;
    }

}
