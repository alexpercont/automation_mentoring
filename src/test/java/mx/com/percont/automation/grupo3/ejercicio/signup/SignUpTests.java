package mx.com.percont.automation.grupo3.ejercicio.signup;

import io.github.bonigarcia.wdm.WebDriverManager;
import mx.com.percont.automation.grupo3.ejercicio.ui.main.MainPage;
import mx.com.percont.automation.grupo3.ejercicio.ui.signup.SignUpModal;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SignUpTests {

    private WebDriver driver;

    @Before
    public void webDriverSetup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void testSignupWithInvalidCredentials(){
        driver.get("http://www.demoblaze.com");

        MainPage main = new MainPage(driver);
        main.clickOnSignUp();
        SignUpModal signUpModal = main.getSignUpModal();
        Assert.assertTrue("SignUp modal dialog not displayed.",
                signUpModal.isDisplayed());
        signUpModal.setUsername("invalid1");
        signUpModal.setPassword("invalid");
        signUpModal.clickOnSignUpButton();

        FluentWait wait = new FluentWait(driver);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        Assert.assertEquals("Sign up successful.", alert.getText());
        alert.accept();
    }

    @After
    public void delete(){
        driver.quit();
    }

}
