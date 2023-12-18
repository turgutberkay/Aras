package util;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ElementHelper extends DriverFactory {
    WebDriverWait wait;
    Actions action;


    public ElementHelper() {
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action = new Actions(driver);
    }

    public WebElement findElement(By key) {
        try {
            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(key));
            return element;
        }catch (Exception e) {
            throw new RuntimeException("Element bulunamadi", e);
        }
    }

    public WebElement findElement(WebElement element) {
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            return element;
        }catch (Exception e) {
            throw new RuntimeException("Element bulunamadi", e);
        }
    }

    public List<WebElement> presenceElements(By key) {
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(key));
    }

    public List<WebElement> findElements(By key) {
        try {
            List<WebElement> elements = presenceElements(key);
            return elements;
        }catch (Exception e) {
            System.out.println("Elementler bulunamadı: " + e.getMessage());
            return null;
        }
    }

    public String elementGetText(By key) {
        try {
            String text = findElement(key).getText();
            return text;
        }catch (Exception e) {
            throw new RuntimeException("Element bulunamadi", e);
        }
    }

    public String elementGetText(WebElement element) {
        try {
            String text = findElement(element).getText();
            return text;
        }catch (Exception e) {
            throw new RuntimeException("Element bulunamadi", e);
        }
    }

    public void click(By key){
        findElement(key).click();
    }

    public void checkElementVisible(By key){
        try {
            wait.until(ExpectedConditions.visibilityOf(findElement(key)));
        }catch (Exception ignored) {
            Assert.fail("Element bulunamadi");
        }
    }

    public void checkElementText(By key, String text) {
        Assert.assertEquals(elementGetText(key), text);
    }


    public void goToUrl(String url){
        driver.get(url);
    }

    public void clickElementWithText(By key, String text) {
        boolean find = false;
        List<WebElement> elements = findElements(key);
        for (WebElement element : elements) {
            if (elementGetText(element).contains(text)) {
                element.click();
                find = true;
                break;
            }
        }
        Assert.assertEquals(true, find);
    }

    public void checkElementWithText(By key, String text) {
        boolean find = false;
        List<WebElement> elements = findElements(key);
        for (WebElement element : elements) {
            if (elementGetText(element).contains(text)) {
                find = true;
                break;
            }
        }
        Assert.assertEquals(true, find);
    }

    public void checkElementsWithText(By key, String text) {
        List<WebElement> elements = findElements(key);
        for (WebElement element : elements) {
            elementGetText(element).contains(text);
        }
    }

    public void moveToElement(WebElement element) {
        action.moveToElement(element).release().perform();
    }




}
