import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class laert {
    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {
        driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://www.leafground.com/alert.xhtml");
    }
    public void alart(){
        WebElement alert1=driver.findElement(By.id("j_idt88:j_idt91"));
        alert1.click();
        Alert alert11=driver.switchTo().alert();
        alert11.accept(); // alert eka accept karanna

        WebElement confirmbox=driver.findElement(By.id("j_idt88:j_idt93"));
        confirmbox.click();
        Alert confirm1=driver.switchTo().alert();
        confirm1.dismiss(); //alert eka dismiss krnawa


        WebElement prombox=driver.findElement(By.id("j_idt88:j_idt104"));
        prombox.click();
        Alert prom1=driver.switchTo().alert();
        String alerttext=prom1.getText();
        System.out.println("alert text is: "+alerttext);
        prom1.sendKeys("my name is thula");
        prom1.accept();



    }




}
