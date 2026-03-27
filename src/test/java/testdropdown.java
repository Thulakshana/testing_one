import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class testdropdown {

    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {
        driver = new ChromeDriver();
        driver.manage().window().minimize();

    }

    @Test
    public void dropdowntest(){
        driver.get("https://www.leafground.com/select.xhtml");
        WebElement dropdown=driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select selectt=new Select(dropdown);
        selectt.selectByIndex(1);
        //Thread.sleep(3000); apita mehema ape code eka run wena speed eka adu karanna puluwan
        selectt.selectByVisibleText("Playwright");

        //get the number of dropdown options
        List<WebElement> listofoptions=selectt.getOptions(); //<WebElement> = genarics (webelement witharai ganne
        int sizelist=listofoptions.size();
        System.out.println("number of elements in dropdown "+ sizelist);

        for(WebElement element:listofoptions){ //foreach loop eka use karanne mehemai
            System.out.println(element.getText());
        }

        //using send keys select drop down values
        dropdown.sendKeys("Puppeteer"); // apita work ekak dila e word eka drop down list eke thiyanwanam select wenwa

        //selecting values in a boostrap dropdown
        WebElement drop2=driver.findElement(By.xpath("//div[@id='j_idt87:country']"));
        drop2.click();
        List<WebElement> listofdrop=driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']/li"));
        for(WebElement element:listofdrop){ //webelement element eka : ape list eka (meka thamai mehema thiyenne (WebElement element:listofdrop))
            String values=element.getText();
            if(values.equals("USA")){
                element.click();
                break;
            }
        }


    }

    @Test
    public void testgoogle(){
        //google search -pick a value fro suggession
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("palitha");
        List<WebElement> listt=driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']"));
        System.out.println(listt.size());
        for(WebElement element:listt){
            System.out.println(element.getText());
        }
    }


}
