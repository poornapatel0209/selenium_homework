package WebBrowserPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class fireFox {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","C:\\software\\driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.close();
    }
}
