package StepDef;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import java.awt.*;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

import static StepDef.CommonDefinitions.driver;

public class fillform_StepDef {

GoogleHome googleHome = new GoogleHome(driver);
SearchResults searchResults = new SearchResults(driver);
ToolsQAMain toolsQAMain = new ToolsQAMain(driver);
DemoSite demoSite = new DemoSite(driver);
Forms forms = new Forms(driver);
    @Given("Automated Test opens Chrome")
    public void automated_Test_opens_Chrome() {
        googleHome.findSearchBar().isDisplayed();
    }

    @And("Searched ToolsQA")
    public void searched_ToolsQA() throws InterruptedException {
        googleHome.findSearchBar().sendKeys("ToolsQA" + Keys.ENTER);
//        TimeUnit.SECONDS.sleep(3);
    }

    @And("Click first link")
    public void click_first_link() {
        searchResults.findToolsQA().click();
        toolsQAMain.findlogo().isDisplayed();
    }

    @And("Click demo site")
    public void click_demo_site() throws InterruptedException {
        toolsQAMain.findDemoSite().click();
//        TimeUnit.SECONDS.wait(3);
    }

    @And("Navigate to newly opened tab")
    public void navigate_to_newly_opened_tab() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        TimeUnit.SECONDS.sleep(2);
    }

    @And("Click form")
    public void click_form() {
        demoSite.enterForms();
    }

    @Then("Fills up form")
    public void Fills_up_form() throws InterruptedException, AWTException {
        TimeUnit.SECONDS.sleep(3);
        forms.findPracticeForms().click();
        forms.findfirstname().sendKeys("Badri");
        TimeUnit.SECONDS.sleep(1);
        forms.findlastname().sendKeys("UpWork");
        TimeUnit.SECONDS.sleep(1);
        forms.findemail().sendKeys("hire.me@please.com");
        TimeUnit.SECONDS.sleep(1);
        forms.findNum().sendKeys("0123456789");
        TimeUnit.SECONDS.sleep(1);
        forms.findDate().click();
        TimeUnit.SECONDS.sleep(1);
        forms.pickDate().click();
        forms.findSubject().sendKeys("M" + Keys.ENTER);
//        forms.findHobbySports();
//        forms.findaddimg();


//        forms.findState().click();
//        forms.findHaryana().click();
    }

}
