package com.mangopay.pages;

import com.mangopay.TestBase;
import org.openqa.selenium.*;

public class AbstractPageObjet extends TestBase {

    public void click(String xpath) {
        findElementByXpath(xpath).click();
    }

    public String getText(String xpath) {
        return findElementByXpath(xpath).getText();
    }

    public String getAttribute(String xpath) {
        return findElementByXpath(xpath).getAttribute("value");
    }

    public void input(String xpath, String text){
        findElementByXpath(xpath).sendKeys(text);
    }

    public WebElement findElementBy(By by) {
        return driver.findElement(by);
    }

    public WebElement findElementByXpath(String xpath) {
        return findElementBy(By.xpath(xpath));
    }

    public void openUrl(String url) {
        driver.get(url);
    }
}
