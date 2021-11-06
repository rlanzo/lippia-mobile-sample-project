package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CrearActividadService;
import cucumber.api.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class CrearActividadSteps extends PageSteps {

    @When("el usuario hace click en el boton de Time Tracker")
    public void clickTimeTracker() {
        CrearActividadService.clickbuttonTimeTracker();
    }

    @When("el usuario hace click en Agregar Tarea")
    public void buttonAgregarTareaGuardar() {
        CrearActividadService.buttonAgregarTareaGuardar();
    }

    @And("el usuario completa el Add Entry (.*),(.*),(.*),(.*)")
    public void seleccionarProyect(String horas, String minutos, String horas1, String minutos1) {
        CrearActividadService.completarTodosCamposAddEntry(horas, minutos, horas1, minutos1);

    }

    @And("el usuario selecciona el project a donde se van agregar las horas")
    public void deshabilitaHabilitaBillable() {
        CrearActividadService.seleccionarProject();

    }

    @And("el usuario completa el nombre de las horas (.*)")
    public void completarNombreHoras(String texto) {
        CrearActividadService.completarNombreHoras(texto);
    }

    @Then("el usuario observa la tarea creada (.*)")
    public void horasCreadas(String texto) {
        CrearActividadService.horasCreadas(texto);
    }
}
