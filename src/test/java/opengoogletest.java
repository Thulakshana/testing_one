import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class opengoogletest {

//test cases liyanne me test kiyana java folder eka athule
@Test
public void googletest(){
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.findElement(By.name("q")).sendKeys("colombo"+ Keys.ENTER);


    //driver.quit(); //open una browser eka close karanna
}


}
