import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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

    }

    @Test
    public void keyboardleaf(){

    }
}
