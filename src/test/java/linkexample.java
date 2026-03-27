import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class linkexample {

    WebDriver driver;

    @BeforeMethod
    public void openlinktestpage() {
        driver = new ChromeDriver();
        driver.manage().window().minimize();
        driver.get("https://www.leafground.com/link.xhtml");
    }

    @Test
    public void linktest() {

        // take me to dashboard
        WebElement homelink = driver.findElement(By.linkText("Go to Dashboard"));
        homelink.click();
        driver.navigate().back();

        // find the URL without clicking me
        WebElement wheretogo = driver.findElement(By.partialLinkText("Find the URL"));
        String path = wheretogo.getAttribute("href");
        System.out.println("URL is: " + path);

        // check broken link
        WebElement brokenlink = driver.findElement(By.linkText("Broken?"));
        brokenlink.click();

        String title = driver.getTitle();
        if (title.contains("404")) {
            System.out.println("link is broken");
        } else {
            System.out.println("link not broken");
        }

        driver.navigate().back();

        // find duplicate links
        WebElement homelinkAgain = driver.findElement(By.linkText("Go to Dashboard"));
        homelinkAgain.click();
        driver.navigate().back();

        // count all links in page
        List<WebElement> countfullpageelements = driver.findElements(By.tagName("a"));
        int links = countfullpageelements.size();
        System.out.println("count of links = " + links);

        // count links in layout section
        WebElement counts = driver.findElement(By.className("layout-main-content"));
        List<WebElement> countlayoutlinks = counts.findElements(By.tagName("a"));
        System.out.println("layout link count = " + countlayoutlinks.size());
    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}