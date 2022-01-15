package mx.com.percont.automation.grupo3.ejercicio.signup;

import mx.com.percont.automation.grupo3.ejercicio.ui.main.MainPage;
import mx.com.percont.automation.grupo3.ejercicio.ui.signup.SignUpModal;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SignUpTests {

    @Test
    public void testSignupWithInvalidCredentials(){
        WebDriver driver = null;
        driver.get("http://www.demoblaze.com");

        MainPage main = new MainPage(driver);
        main.clickOnSignUp();
        SignUpModal signUpModal = main.getSignUpModal();
        assert signUpModal.isDisplayed();
        signUpModal.setUsername("invalid");
        signUpModal.setPassword("invalid");
        signUpModal.clickOnSignUpButton();

        Alert alert = driver.switchTo().alert();
        assert alert.getText() == "Sign up successful.";
        alert.accept();

        ExpectedConditions.alertIsPresent().apply(driver);

    }

}
