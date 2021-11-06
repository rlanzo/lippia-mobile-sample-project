package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.HomeConstants;
import org.testng.Assert;


public class HomeService {

    public static void clickMenuHamburguesa() {
        MobileActionManager.waitVisibility(HomeConstants.buttonMenuHamburguesa);
        MobileActionManager.click(HomeConstants.buttonMenuHamburguesa);
    }

    public static void clickProyect() {
        MobileActionManager.waitVisibility(HomeConstants.buttonProyect);
        MobileActionManager.click(HomeConstants.buttonProyect);

    }

    public static void seleccionarProyect() {
        MobileActionManager.waitVisibility(HomeConstants.buttonNombreProyecto);
        MobileActionManager.click(HomeConstants.buttonNombreProyecto);

    }

    public static void deshabilitaHabilitaBillable() {
        Assert.assertEquals(MobileActionManager.getAttribute(HomeConstants.deshabilitahabilitaBillable, "text"), "ON");
        MobileActionManager.click(HomeConstants.deshabilitahabilitaBillable);
    }


    public static void buttonSaveMenuProject(String texto) {
        MobileActionManager.waitVisibility(HomeConstants.buttonSave);
        MobileActionManager.click(HomeConstants.buttonSave);
        MobileActionManager.waitVisibility(HomeConstants.buttonNombreProyecto);
        Assert.assertTrue(MobileActionManager.isVisible(HomeConstants.buttonNombreProyecto, texto));

    }


}
