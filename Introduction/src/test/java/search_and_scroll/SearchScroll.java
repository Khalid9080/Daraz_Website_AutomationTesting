package search_and_scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchScroll {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers//chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.daraz.com.bd/?_mkt_tracker=g&_mkt_campaign=211036165&_mkt_adgroup=19723047325&_mkt_creative=437369092797&_mkt_src=gg&isdl=y&aff_short_key=_7agwc&gad_source=1&gclid=Cj0KCQjwhtWvBhD9ARIsAOP0GojtWTX6dJx1pN1DOgdaRL5Gs_Qez7WB5vXxDcfmb8tTyCo3AfFQwH4aAquzEALw_wcB");

        WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"q\"]"));
        searchBox.sendKeys("airpods pro 2nd gen");
        searchBox.submit(); 

        // Create instance of JavascriptExecutor
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down the page by 1000 pixels vertical
        js.executeScript("window.scrollBy(0,1500)");
        
        driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div/div/div[1]/div[2]/div[20]/div/a/div[1]/img")).click();
        
        driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[2]/div/div[1]/div[12]/div/div/div/div/div[1]/a[1]/span/i")).click();
       
        //driver.findElement(By.xpath(" /html/body/div[4]/div/div[3]/div[2]/div/div[1]/div[14]/div/button[2]")).click();
        
        //driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("01710254043");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("K.daraz1");
		//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div[2]/form/div/div[2]/div[1]/button")).click();
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[2]/div/div[2]/div[1]/div/div/div[2]/div/div/div/div[2]/a")).click();
      
    }
}
