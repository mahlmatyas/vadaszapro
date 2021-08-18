package Pages.Login;

import General.CM;
import General.Meth;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Login {

    //properties
    private WebDriver driver;

    //constructor
    public Login(WebDriver driver){
        this.driver = driver;
    }

    //methodes
    public void belepes(String Email, String Jelszo){

        Meth.goWait(CM.LOGIN_BUTTON, driver);

        driver.findElement(CM.LOGIN_EMAIL).sendKeys(Email);
        driver.findElement(CM.LOGIN_PASSWORD).sendKeys(Jelszo);
        driver.findElement(CM.LOGIN_BUTTON).click();
    }
}