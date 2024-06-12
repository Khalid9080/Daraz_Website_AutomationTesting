package Test_Package;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScrollDown_Operation {

    public void scrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scroll down vertically by 250 pixels
        js.executeScript("window.scrollBy(0,500)");
    }
}