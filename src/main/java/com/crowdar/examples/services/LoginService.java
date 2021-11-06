package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;


public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.waitVisibility(LoginConstants.emailInput);
        MobileActionManager.setInput(LoginConstants.emailInput, email);
        MobileActionManager.setInput(LoginConstants.passwordInput, password);
        MobileActionManager.click(LoginConstants.loginButton);
    }
    public static void usuarioLogueado(String titulo){
        MobileActionManager.waitVisibility(LoginConstants.titulo);
        Assert.assertTrue(MobileActionManager.isVisible(LoginConstants.titulo,titulo));

    }

}
