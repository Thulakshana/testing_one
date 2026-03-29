import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class keyboardaction {



    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {
        driver = new ChromeDriver();
        driver.manage().window().minimize();

    }
    @Test
    public void keyboard(){
        driver.get("https://www.google.com/");
        WebElement textbox=driver.findElement(By.id("APjFqb"));
        textbox.sendKeys("welcome");


        //action class ekata object ekak create karanna one
        Actions action=new Actions(driver);
        //select text
        action.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform(); //control ekath ekka a obanna , button eka obana atharinna
        //perform()= meken thama dewal wenne , meka dunne naththan "welcome" kiyala type wenawa witharai mokuth wenne na
        //keydown()= key eka press karanna
        //keyup() = key eka athrinna
        action.keyDown(Keys.SHIFT).sendKeys("writing capital sentence").keyUp(Keys.SHIFT).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("x").build().perform();

        //build()=building/creating an action
        //perform()= performing / complating an action


    }

    @Test
    public void keyboardleaf(){
        driver.get("https://www.leafground.com/list.xhtml");
        List<WebElement> selection=driver.findElements(By.xpath("//*[@id='pickList']/div[2]/ul"));
        int size=selection.size();
        System.out.println(size);

        Actions act=new Actions(driver);
        act.keyDown(Keys.CONTROL).click(selection.get(0)).click(selection.get(1)).click(selection.get(2)).build().perform();
        //control eka obagena click karana widiha (item godak)





    }
}
