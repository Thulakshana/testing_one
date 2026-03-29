import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.util.List;

public class imagesandcalender {


    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {

        ChromeOptions choption=new ChromeOptions();
        File file=new File("D:\\my documents\\My programming\\my requirements\\SelectorsHub-Chrome-Web-Store.crx");
        choption.addExtensions(file);
        driver = new ChromeDriver(choption); //automade browser ekata extension ekak daanne mehemai(uda line thuna)

        driver.manage().window().minimize();

    }

    public void findbrokenimage(){
        driver.get("https://the-internet.herokuapp.com/broken_images");


        List<WebElement> images=driver.findElements(By.xpath("//div[@class='example']/img"));
        int i=0;
        for(WebElement image:images){
            //naturalwidth=0 nam eka broken image ekak
            if(image.getAttribute("naturalWidth").equals("0")){
                System.out.println("image is broken");
            }else{
                System.out.println("image is not broken");
            }
            i++;
        }
    }

    public void calender(){
        driver.get("https://jqueryui.com/datepicker/");
        driver.switchTo().frame(driver.findElement(By.xpath("//*[@id='content']/iframe")));

       WebElement datee=driver.findElement(By.xpath("//*[@id='datepicker']"));
       datee.sendKeys("07/02/2024");



    }



}
