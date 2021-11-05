package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

/**
 * This class contains the business logic.
 * We can have querys, requests or steps to do certain things (how to log into the app).
 * If we need to only complete a field or click a button, we can put it in the steps.
 */
public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.waitVisibility(LoginConstants.emailInput);
        MobileActionManager.setInput(LoginConstants.emailInput, email);
        MobileActionManager.setInput(LoginConstants.passwordInput, password);
        MobileActionManager.click(LoginConstants.loginButton);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.SIGN_UP_BUTTON_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.EMAIL_INPUT_LOCATOR), LoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }
    public static void usuarioLogueado(String titulo){
        MobileActionManager.waitVisibility(LoginConstants.titulo);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.titulo,titulo));

    }

}
