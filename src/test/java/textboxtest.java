import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class textboxtest {


    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {
        driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://www.leafground.com/input.xhtml");
    }


    @Test
    public void textbox(){
        // 01 type your name
        WebElement name=driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("thula");
        //02 append country to this city
        WebElement city=driver.findElement((By.id("j_idt88:j_idt91")));
        city.sendKeys("kurunegala");
        //verify textbox is desable
        boolean enables=driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
        System.out.println("is text box is "+enables);
        //clear the typed text
        WebElement cleartextbox=driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        cleartextbox.clear();
        //recieve typed text
        WebElement textelemet=driver.findElement(By.id("j_idt88:j_idt97"));
        String value=textelemet.getAttribute("value");
        System.out.println("typed "+value);
        //type email
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("thula@gmail.com" + Keys.TAB);




    }


}
