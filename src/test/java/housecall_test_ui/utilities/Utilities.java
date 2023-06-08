package housecall_test_ui.utilities;

import com.github.javafaker.Faker;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Utilities {

    private static WebDriverWait wait = new WebDriverWait(Driver.getDriver(),8);
    private static Faker faker = new Faker();

    public static Faker fake(){
        return faker;
    }

    public static WebDriverWait hold(){
        return wait;
    }

    public static void clickElement(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public static void typeText(WebElement element, String text){
        try{
            element.clear();
            element.sendKeys(text);
        }
        catch (ElementNotInteractableException e){
            element.clear();
            element.sendKeys(text);
        }
    }

    public static void clearAndTypeText(WebElement element, String text){
        for (int i=0;i<=3;++i){
            element.sendKeys(Keys.BACK_SPACE);
        }
        element.sendKeys(text);
    }
}
