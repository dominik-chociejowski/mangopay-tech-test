package com.mangopay;

import com.mangopay.pages.GoogleConsentPage;
import com.mangopay.pages.GoogleMapsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public final static String URL = "https://www.google.com/maps";
    public static WebDriver driver;
    public GoogleMapsPage googleMapsPage;

    public void startChrome(String language) {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        System.setProperty("file.encoding", "UTF-8");
        System.setProperty("sun.jnu.encoding", "UTF-8");
        driver = setDriver(language);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
        driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
    }

    public WebDriver setDriver(String language){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=" + language);
        return new ChromeDriver(options);
    }

    public void startApp() {
        GoogleConsentPage googleConsentPage = new GoogleConsentPage();
        googleConsentPage.openUrl(URL);
        googleConsentPage.clickAcceptAllCookiesButton();
        googleMapsPage = new GoogleMapsPage();
    }

    @AfterMethod(alwaysRun = true)
    public void stopChrome() {
        driver.quit();
    }
}
