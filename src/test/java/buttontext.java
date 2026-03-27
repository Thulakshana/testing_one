import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class buttontext {

    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {
        driver = new ChromeDriver();
        //Dimension newsize=new Dimension(800,600); // apit one ganata window eka open wenna one size eka denwa
       // driver.manage().window().setSize(newsize); // api udinn window eka open wenna one size eka dunnahama methana api eka call karanna one setsize dila
        driver.manage().window().maximize(); // meken ape window eka screen eke size ekatama open wenwa
        driver.get("https://www.leafground.com/button.xhtml");
    }

    @Test
    public void buttontest()
    {
        // 1. click and confirm title
        driver.findElement(By.id("j_idt88:j_idt90")).click();
        String expectedtitle="Dashboard";
        String actualtitle=driver.getTitle();
        if(expectedtitle.equals(actualtitle)){
            System.out.println("title is correct");
        }else{
            System.out.println("title is not correct");
        }

        driver.navigate().back();

        //position get
        WebElement getposition=driver.findElement(By.id("j_idt88:j_idt92"));
        Point xypoint=getposition.getLocation();
        int x=xypoint.getX();
        int y=xypoint.getY();

        System.out.println(x);
        System.out.println(y);

        //find the save button color
        WebElement buttoncolor = driver.findElement(By.id("j_idt88:j_idt96"));
        String color=buttoncolor.getCssValue("background");
        System.out.println(color);

        //find the hight and width
        WebElement sizee=driver.findElement(By.id("j_idt88:j_idt98"));
        int height=sizee.getSize().getHeight();
        int width=sizee.getSize().getWidth();
        System.out.println(height);
        System.out.println(width);







    }





}
