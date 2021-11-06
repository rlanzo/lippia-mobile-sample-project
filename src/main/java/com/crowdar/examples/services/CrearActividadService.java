package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.CrearActividadConstants;
import org.testng.Assert;


public class CrearActividadService {

    public static void clickbuttonTimeTracker() {
        MobileActionManager.waitVisibility(CrearActividadConstants.buttonTimeTracker);
        MobileActionManager.click(CrearActividadConstants.buttonTimeTracker);
    }

    public static void buttonAgregarTareaGuardar() {
        MobileActionManager.waitVisibility(CrearActividadConstants.buttonAgregarTareaGuardar);
        MobileActionManager.click(CrearActividadConstants.buttonAgregarTareaGuardar);

    }

    public static void completarTodosCamposAddEntry(String horas, String minutos,String horas1, String minutos1) {
        MobileActionManager.waitVisibility(CrearActividadConstants.buttonStart);
        MobileActionManager.click(CrearActividadConstants.buttonStart);
        MobileActionManager.click(CrearActividadConstants.primeroNoviembre);
        MobileActionManager.click(CrearActividadConstants.seleccionarStart);
        MobileActionManager.waitVisibility(CrearActividadConstants.seleccionarHora, horas);
        MobileActionManager.setInput(CrearActividadConstants.seleccionarHora, horas);
        MobileActionManager.waitVisibility(CrearActividadConstants.seleccionarMinutos, minutos);
        MobileActionManager.setInput(CrearActividadConstants.seleccionarMinutos, minutos);
        MobileActionManager.click(CrearActividadConstants.seleccionarEnd);
        MobileActionManager.waitVisibility(CrearActividadConstants.seleccionarHora, horas1);
        MobileActionManager.setInput(CrearActividadConstants.seleccionarHora, horas1);
        MobileActionManager.waitVisibility(CrearActividadConstants.seleccionarMinutos, minutos1);
        MobileActionManager.setInput(CrearActividadConstants.seleccionarMinutos, minutos1);
        MobileActionManager.click(CrearActividadConstants.buttonAgregarTareaGuardar);


    }

    public static void seleccionarProject() {
        MobileActionManager.waitVisibility(CrearActividadConstants.seleccionarProject);
        MobileActionManager.click(CrearActividadConstants.seleccionarProject);
        MobileActionManager.waitVisibility(CrearActividadConstants.elegirProject);
        MobileActionManager.click(CrearActividadConstants.elegirProject);
    }


    public static void completarNombreHoras(String texto) {
        MobileActionManager.waitVisibility(CrearActividadConstants.ingresarDescripcionProject);
        MobileActionManager.setInput(CrearActividadConstants.ingresarDescripcionProject, texto);
        MobileActionManager.click(CrearActividadConstants.buttonAgregarTareaGuardar);

    }
    public static void horasCreadas(String texto) {
        MobileActionManager.waitVisibility(CrearActividadConstants.projectCreado);
        Assert.assertTrue(MobileActionManager.isVisible(CrearActividadConstants.projectCreado, texto));

    }


}
