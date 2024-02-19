package pages;

import io.appium.java_client.AppiumBy;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static utilities.DriverSetup.getDriver;

public class BasePage {
    public WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));
    public void wait_for_existence_of(By locator){
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    public void wait_for_existence_of_all(By locator){
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
    public void wait_for_invisibility_of(By locator){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
    public void wait_for_invisibility_of(WebElement element){
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void wait_for_clickable_of(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public WebElement getElement(By locator){
        wait_for_existence_of(locator);
        return getDriver().findElement(locator);
    }

    public List<WebElement> getElements(By locator){
        wait_for_existence_of_all(locator);
        return getDriver().findElements(locator);
    }

    public String getAttribute(By locator, String attribute){
        wait_for_existence_of(locator);
        return getDriver().findElement(locator).getAttribute(attribute);
    }

    public String getAttribute(WebElement element, String attribute){
        return element.getAttribute(attribute);
    }


    public String get_text_of(By locator){
        wait_for_existence_of(locator);
        return getDriver().findElement(locator).getText();
    }

    public String get_text_of(WebElement element){
        return element.getText();
    }

    public List<String> get_list_of_text_of(By locator){
        wait_for_existence_of_all(locator);
        List<WebElement> elements = getDriver().findElements(locator);
        List<String> textList = new ArrayList<>();
        for (WebElement element : elements) {
            textList.add(element.getText());
        }
        return textList;
    }

    public List<String> get_list_of_text_of(List<WebElement> elements){
        List<String> textList = new ArrayList<>();
        for (WebElement element : elements) {
            textList.add(element.getText());
        }
        return textList;
    }

    public void click_on(By locator){
        wait_for_clickable_of(locator);
        getDriver().findElement(locator).click();
    }
    public void click_on(WebElement element){
        element.click();
    }

    public void click_and_wait_for_invisibility_of(By locator){
        wait_for_existence_of(locator);
        getDriver().findElement(locator).click();
        wait_for_invisibility_of(locator);
    }

    public void click_and_wait_for_invisibility_of(WebElement element){
        element.click();
        wait_for_invisibility_of(element);
    }

    public void enter_text_at(By locator, String text){
        wait_for_existence_of(locator);
        getDriver().findElement(locator).clear();
        getDriver().findElement(locator).sendKeys(text);
    }

    public void enter_text_at(WebElement element, String text){
        element.clear();
        element.sendKeys(text);
    }

    public void scrollInToViewText(String text){
        getDriver().findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(text(\"" + text + "\"));"));
    }

    public void scrollInSpecificAreaByHorizontal(By scrollArea, String text){
        String scrollAreaResourceID = getAttribute(scrollArea, "resource-id");
        getDriver().findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().resourceId(\""+scrollAreaResourceID+"\")).setAsHorizontalList().scrollIntoView("
                        + "new UiSelector().text(\""+text+"\"));"));
    }

    public By get_element_locator_by_text(String text){
        return By.xpath("//*[@text=\'" + text + "\']");
    }
    public void scrollInSpecificAreaByVertical(By scrollArea, String text){
        String scrollAreaResourceID = getAttribute(scrollArea, "resource-id");
        getDriver().findElement(AppiumBy
                .androidUIAutomator("new UiScrollable(new UiSelector().resourceId(\""+scrollAreaResourceID+"\")).setAsVerticalList().scrollIntoView("
                        + "new UiSelector().text(\""+text+"\"));"));
    }
    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,-350)", "");
    }




}
