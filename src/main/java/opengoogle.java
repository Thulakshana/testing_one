//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogle {
//mokak hari logic ekak liyanwanm liyanne me main eka athule thiyn java eke
    //open google
    //goto home page
    //using system.property method

    public static void main(String[] args){
        //1.System.setProperty("webdriver.chrome.driver", "D:\\my documents\\My programming\\selenium\\driver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
        //WebDriver kiyana eka matha thamai automation ekama depend wenne
    }
}