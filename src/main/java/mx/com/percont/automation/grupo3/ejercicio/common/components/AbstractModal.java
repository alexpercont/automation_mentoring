package mx.com.percont.automation.grupo3.ejercicio.common.components;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public abstract class AbstractModal {

    public AbstractModal(WebElement modalElement) {
        PageFactory.initElements(modalElement, this);
    }

}
