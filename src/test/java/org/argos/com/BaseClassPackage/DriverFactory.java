package org.argos.com.BaseClassPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class DriverFactory {
    public static WebDriver driver;

    public DriverFactory() {

        PageFactory.initElements(driver, this);
    }

    public void openbrowser() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.argos.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }

    public void closebrowser() {

        driver.quit();
    }

}
