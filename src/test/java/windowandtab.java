import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;

public class windowandtab {

    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {
        driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://www.leafground.com/window.xhtml");
    }
    @Test
    public void win(){
        //click and confirm new window open
        String oldwindow=driver.getWindowHandle(); //ape main window eka hold karala thiyaganna
        System.out.println("parent window "+ oldwindow);

       WebElement openbtn= driver.findElement(By.id("j_idt88:new"));
       openbtn.click();

       Set<String> handles=driver.getWindowHandles(); //open una tabs gannawa
        System.out.println("handle size " +handles.size()); //tabs gaana

        //old window eken aluth tab ekata yanwa
        for(String newwindow:handles){
            System.out.println(newwindow);
            driver.switchTo().window(newwindow);
            System.out.println("page title is "+driver.getTitle());
        }

        driver.close(); //meken aluhen awa tab eka witarai close wenne (api kalin hitiya main window ekata enwa)
        //e kiyanne dan focus wela thiyna eka (wada karana eka) close karanna
        //driver.quit(); //meken okkoma tab close wenwa



        //driver eka close unhama ayeth open karanna ona
        driver.switchTo().window(oldwindow);




       WebElement openone=driver.findElement(By.id("j_idt88:new"));
       boolean openvis=openone.isDisplayed(); //me element eka dom eke thiynwada kiyala check krnw
        System.out.println("open button visibility "+openvis);









    }




}
