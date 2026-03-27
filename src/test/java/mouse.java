import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class mouse {

    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {
        driver = new ChromeDriver();
        driver.manage().window().minimize();

    }

//action= interface
    //actions=class

    @Test
    public void accessmouse(){
        driver.get("https://www.leafground.com/drag.xhtml");
        //move to element operation
        Actions actions=new Actions(driver); //action class eka initialize kara
        actions.moveToElement(driver.findElement(By.id("menuform:j_idt37"))).perform(); //mona element ekatada yanna one kiyala dunna
        actions.moveToElement(driver.findElement(By.id("menuform:j_idt38"))).perform();
        actions.moveToElement(driver.findElement(By.id("menuform:j_idt39"))).perform();

        //drag and drop element
        WebElement frm=driver.findElement(By.id("form:drag_content"));
        WebElement too=driver.findElement((By.id("form:drop_content")));
        actions.clickAndHold(frm).moveToElement(too).release(too).perform();
        //click karagena hold karagena innwa().element eka enna one thanata drag karanwa().mouse button eka athrinwa()
        //mewa wada karannam aniwaren perform() method ekata call karanna one (action method eka wada karanne na meka naththan)

        //slider work check
        WebElement slider1=driver.findElement(By.xpath("//*[@id='form:j_idt125']/span[1]"));
        System.out.println("location is "+slider1.getLocation());
        actions.dragAndDropBy(slider1,50,0).perform();
        System.out.println("location is after "+slider1.getLocation());




    }



    }

