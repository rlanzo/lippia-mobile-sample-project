package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.HomeService;
import com.crowdar.examples.services.LoginService;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;

public class HomeSteps extends PageSteps {

    @When("el usuario hace click en el Menu Hamburguesa")
    public void clickMenuHamburguesa(){
        HomeService.clickMenuHamburguesa();
    }

    @When("el usuario hace click en Proyect")
    public void clickProyect(){
        HomeService.clickProyect();
    }
    @And("el usuario hace click en seleccionar Proyect")
    public void seleccionarProyect(){
        HomeService.seleccionarProyect();

    }
    @When("el usuario hace click en deshabilitaHabilita Billable")
    public void deshabilitaHabilitaBillable(){
        HomeService.deshabilitaHabilitaBillable();

    }
    @Then ("el usuario deshabilita Habilita y vuelve al menu del proyecto, visualiza nuevamente su nombre (.*)")
        public void buttonSaveMenuProject(String texto){
        HomeService.buttonSaveMenuProject(texto);
    }
}
