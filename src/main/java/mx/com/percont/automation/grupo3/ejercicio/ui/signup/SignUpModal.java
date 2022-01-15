package mx.com.percont.automation.grupo3.ejercicio.ui.signup;

import mx.com.percont.automation.grupo3.ejercicio.common.components.AbstractModal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpModal extends AbstractModal {

    @FindBy(id = "sign-username")
    private WebElement usernameInput;

    @FindBy(id = "sign-password")
    private WebElement passwordInput;

    @FindBy(className = "btn-primary")
    private WebElement signUpButton;

    public SignUpModal(WebElement wrapperElement){
        super(wrapperElement);
    }

    public void setUsername(String username){
        usernameInput.sendKeys(username);
    }

    public void setPassword(String password){
        passwordInput.sendKeys(password);
    }

    public void clickOnSignUpButton(){
        signUpButton.click();
    }

    public boolean isDisplayed() {
        return true;
    }
}
