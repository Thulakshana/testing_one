import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class frames {


    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {
        driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://www.leafground.com/frame.xhtml");
    }

    //iframe = html page eka athule thwa html page ekak danna use karanawa
    @Test

    public void frametests(){

        //method used in selenium webdriver to switch between different frames within a webpage
        //driver.switchto().frame(index)
        //frame(name)
        //frame(id)
        //frame(webelement)
        //defaultcontent()
        //parentframe()



        //apita iframe ekak athule thiyana element kelinm access karanna ba
        //ekata api switch wenna one
        driver.switchTo().frame(0);
        WebElement btn1=driver.findElement(By.xpath("//button[@id='Click']"));
        btn1.click();
        String after=btn1.getText();
        System.out.println("text = "+after );



        //click me (inside nested frame)
        // issrla eke eka parai apita switch wenna wenne
        // nested iframe thiynwkota kipasarayak switch wenna wenwa hari html page ekata enkn ekai wenasa


        driver.switchTo().defaultContent(); //main html page ekata yanwa
        driver.switchTo().frame(2);
        driver.switchTo().frame("frame2");

        WebElement btn3=driver.findElement(By.id("Click"));
        btn3.click();

        //how many frames in this page
        driver.switchTo().defaultContent();
        List<WebElement> getcount=driver.findElements(By.tagName("iframe"));
        int size=getcount.size();
        System.out.println("counts of  iframe "+size);









    }


}
