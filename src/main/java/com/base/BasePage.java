package com.base;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BasePage {

    @Getter
    public String env = null;

    public void setenv(String env) {
        this.env = env;

    }

    public WebElement find(By locator) {
        return BrowserDriverFactory.getDriver().findElement(locator);
    }

    public void navigateTOUrl(String url) {
        BrowserDriverFactory.getDriver().navigate().to(url);

    }

    public List<WebElement> findAll(By locator) {
        return BrowserDriverFactory.getDriver().findElements(locator);
    }

    public WebDriverWait wait(int timeInSeconds) {
        return new WebDriverWait(BrowserDriverFactory.getDriver(), Duration.ofSeconds(timeInSeconds));
    }

    public void waitForVisibility(By locator, int timeInSeconds) {
        wait(timeInSeconds).until(ExpectedConditions.visibilityOfElementLocated(locator));

    }

    public void waitForClick(By locator, int timeInSeconds) {
        try {
            wait(timeInSeconds).until(ExpectedConditions.elementToBeClickable(locator));
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public boolean isElementPresentWithNoException(By locator, int timeInSeconds) {
        boolean flag = false;
        implicitlyWait(timeInSeconds);
        if (!findAll(locator).isEmpty()) {
            flag = true;
        }
        implicitlyWait(30);
        return flag;

    }


    public void implicitlyWait(int timeInSeconds) {
        BrowserDriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
    }

    public void getURL(String url) {
        BrowserDriverFactory.getDriver().get(url);
    }

    public BasePage type(By locator, String text) {
        waitForVisibility(locator, 30);
        find(locator).sendKeys(Keys.CONTROL, "a", Keys.BACK_SPACE);
        find(locator).sendKeys(text);
        return this;

    }

    public String getText(By locator) {
        waitForVisibility(locator, 30);
        return find(locator).getText();


    }


    public BasePage staticWait(long timeINSeconds) {
        try {
            Thread.sleep(1000 * timeINSeconds);
        } catch (Exception ignored) {

        }
        return this;
    }

    public BasePage click(By locator) {
        waitForClick(locator, 30);
        find(locator).click();
        return this;
    }


}



