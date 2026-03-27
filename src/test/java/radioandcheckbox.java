import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.List;

public class radioandcheckbox {

    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {
        driver = new ChromeDriver();
        driver.manage().window().minimize();

    }
//**** radio button check box wage dewal handle karanna ganne isselected() method eka
    // me isselected() method eka wada karanne input tag ekkin ganna element walata
    @Test
    public void radiobutton(){
        driver.get("https://www.leafground.com/radio.xhtml");


        //find the default select radio button
        boolean selectradio1=driver.findElement(By.id("j_idt87:console2:0")).isSelected();
        boolean selectedradio2=driver.findElement(By.id("j_idt87:console2:1")).isSelected();
        boolean selectedradio3=driver.findElement(By.id("j_idt87:console2:2")).isSelected();
        boolean selectedraio4=driver.findElement(By.id("j_idt87:console2:3")).isSelected();

        if(selectradio1){
        String chrometext= driver.findElement(By.xpath(" //label[@for='j_idt87:console2:0']")).getText();
            System.out.println("default select radio button is "+chrometext);
        }else if(selectedradio2){
            String chrometext2=driver.findElement(By.xpath("//label[@for='j_idt87:console2:1']")).getText();
            System.out.println("selected radio button is "+chrometext2);
        }else if(selectedradio3){
            String chrometext3=driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
            System.out.println("selected radio button is "+chrometext3);
        }else if(selectedraio4){
            String chrometext4=driver.findElement(By.xpath("//label[@for='j_idt87:console2:3']")).getText();
            System.out.println("selected radio button is "+chrometext4);
        }



        //select age group if not selected
        WebElement one=driver.findElement(By.id("j_idt87:age:0"));
        boolean isselect=one.isSelected();
        if(!isselect){
            //one.click(); //mehema click karanna kiwwata wada karanne na
            WebElement clickonee=driver.findElement(By.xpath("//label[@for='j_idt87:age:0']"));
            clickonee.click();
        }


    }

    public void checkboxes(){
        driver.get("https://www.leafground.com/checkbox.xhtml");
        List<WebElement> checkboxlist=driver.findElements(By.xpath("//table[@id='j_idt87:basic']//label"));
        for(WebElement element:checkboxlist){
            if(element.getText().equals("Others")){
                element.click();
            }
        }

        //click wela thiyana dewala bala ganna

        for(int i=1; i<=checkboxlist.size();i++){
            boolean cccd=driver.findElement(By.xpath("(//table[@id='j_idt87:basic']//input)["+i+"]")).isSelected();
            System.out.println("checkbox " +i+" selected status is: "+cccd);
        }
    }


}
