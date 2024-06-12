package Test_Package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.daraz.com.bd/?_mkt_tracker=g&_mkt_campaign=211036165&_mkt_adgroup=19723047325&_mkt_creative=432323449199&_mkt_src=gg&isdl=y&aff_short_key=_7agwc&gad_source=1&gclid=Cj0KCQjwhtWvBhD9ARIsAOP0GoicMosh3wHrP_Hf85N_E2RU946Dr-c2_M8KHZ8k0hcPNh-UsyntbaIaAh7QEALw_wcB");
		//ScrollDown_Operation scrollDownOperation = new ScrollDown_Operation();
        //scrollDownOperation.scrollDown(driver);
		
		
		//Thread.sleep(5000);
		//driver.close();
		//WebElement txtbx_username = driver.findElement(By.name("PhoneOrEmail"));
		//txtbx_username.sendKeys("01710254043");
		//driver.findElement(By.name("Password")).sendKeys("k.othoba");
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).click();
		//--------------
		driver.findElement(By.xpath("//*[@id=\"anonLogin\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[1]/input")).sendKeys("01710254043");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[1]/div[2]/input")).sendKeys("K.daraz1");
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/form/div/div[2]/div[1]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/div/div/div[2]/div/div[3]/div[1]/div[2]/span[2]")).click();
		
		
		
		
		//---------------
		//WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"q\"]"));
		//searchBox.sendKeys("IPhone 15 Pro max");
		//searchBox.submit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//WebElement searchBox = driver.findElement(By.id("q"));
		//searchBox.sendKeys("Iphone X");
		//searchBox.submit();
		
		
		
	}

}
