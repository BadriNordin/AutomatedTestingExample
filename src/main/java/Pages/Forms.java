package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class Forms {

    WebDriver driver;

    public Forms(WebDriver webDriver){
        driver = webDriver;
    }

    public WebElement findPracticeForms(){
//        WebElement p1 = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/span[1]/div[1]"));
//        p1.click();
        WebElement practice = driver.findElement(By.xpath("//span[normalize-space()='Practice Form']"));
        return practice;
    }

    public WebElement findfirstname(){
        WebElement first = driver.findElement(By.id("firstName"));
        return first;
    }

    public WebElement findlastname(){
        WebElement last = driver.findElement(By.id("lastName"));
        return last;
    }

    public WebElement findemail(){
        WebElement email = driver.findElement(By.id("userEmail"));
        return email;
    }

    public WebElement findmale(){
        WebElement male = driver.findElement(By.xpath("//label[normalize-space()='Male']"));
        return male;
    }

    public WebElement findNum(){
        WebElement num = driver.findElement(By.id("userNumber"));
        return num;
    }

    public WebElement findDate(){
        WebElement date = driver.findElement(By.id("dateOfBirthInput"));
        return date;
    }

    public WebElement pickDate(){
        WebElement pick = driver.findElement(By.xpath("//div[@aria-label='Choose Saturday, May 13th, 2023']"));
        return pick;
    }

    public WebElement findSubject(){
        WebElement sub = driver.findElement(By.cssSelector(".subjects-auto-complete__value-container.subjects-auto-complete__value-container--is-multi.css-1hwfws3"));
        return sub;
    }

    public WebElement findHobbySports(){
        WebElement hobby = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        return hobby;
    }

    public void findaddimg() throws AWTException, InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        driver.findElement(By.id("uploadPicture")).click();
//        TimeUnit.SECONDS.sleep(5);
        //Use of Robot class to uplaod file
        Robot robot=new Robot();
//        TimeUnit.SECONDS.sleep(5);

        // Create a file object
        File f = new File("src\\images\\teddy.jpg");

        // Get the absolute path of file f
        String absolute = f.getAbsolutePath();

        //Store the path of the file to be uploaded using StringSelection class object
        StringSelection filepath =new StringSelection (""+ absolute);
//        TimeUnit.SECONDS.sleep(5);

        //Copy above path to clipboard
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents( filepath,null);
//        TimeUnit.SECONDS.sleep(5);

        //Now press CTRL
        robot.keyPress (KeyEvent.VK_CONTROL);
        TimeUnit.SECONDS.sleep(5);

        //Press V
        robot.keyPress(KeyEvent.VK_V);

        //Release V
        robot.keyRelease (KeyEvent.VK_V);
        TimeUnit.SECONDS.sleep(5);

        //Release CTRL
        robot.keyRelease (KeyEvent.VK_CONTROL);
        TimeUnit.SECONDS.sleep(5);

        //Press ENTER
        robot.keyPress (KeyEvent.VK_ENTER);
//        TimeUnit.SECONDS.sleep(5);

        //Release ENTER
        robot.keyRelease (KeyEvent.VK_ENTER);
    }

    public WebElement findAddr(){
        WebElement add = driver.findElement(By.id("currentAddress"));
        return add;
    }

    public WebElement findState(){
        WebElement state = driver.findElement(By.id("state"));
        return state;
    }

    public WebElement findHaryana(){
        WebElement haryana = driver.findElement(By.xpath("//*[contains(text(),'Haryana')]"));
        return haryana;
    }
}
