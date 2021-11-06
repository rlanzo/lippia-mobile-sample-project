package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps extends PageSteps {

    @When("el usuario ingresa los datos para acceder: mail(.*) y password (.*)")
    public void doLoginProcess(String email, String password) {
        LoginService.doLogin(email, password);
    }

    @Then ("el usuario se encuentra logueado y ve el titulo (.*)")
        public void usuarioLogueado(String titulo){
        LoginService.usuarioLogueado(titulo);
    }
}
