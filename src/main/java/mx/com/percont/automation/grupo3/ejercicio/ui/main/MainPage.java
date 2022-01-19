package mx.com.percont.automation.grupo3.ejercicio.ui.main;

import mx.com.percont.automation.grupo3.ejercicio.common.components.AbstractPage;
import mx.com.percont.automation.grupo3.ejercicio.ui.signup.SignUpModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {

    @FindBy(id = "signin2")
    private WebElement signupNavLink;

    @FindBy(id = "signInModal")
    private SignUpModal signUpModal;

    public MainPage(WebDriver driver){
        super(driver);
        this.signUpModal = new SignUpModal(driver.findElement(By.id("signInModal")));
    }

    public SignUpModal getSignUpModal(){
        return signUpModal;
    }

    public void clickOnSignUp(){
        signupNavLink.click();
    }

}
