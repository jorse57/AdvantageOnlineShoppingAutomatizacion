package Step;

import PageObjects.registroPageObjects;
import Utils.Datos;
import Utils.EsperaExplicita;
import Utils.listasDesplegables;
import net.thucydides.core.annotations.Step;


import java.io.IOException;

public class registroSteps {

    registroPageObjects registroPageObjects = new registroPageObjects();
    EsperaExplicita esperaExplicita = new EsperaExplicita();
    listasDesplegables listasDesplegables = new listasDesplegables();
    Datos datos = new Datos();

    @Step
    public void abrirNavegador() {
        registroPageObjects.open();
    }

    @Step
    public void clicbtnSignin() {
        esperaExplicita.esperaElementoVisible(registroPageObjects.getDriver(), registroPageObjects.getLnkbtnSignin());
        registroPageObjects.getDriver().findElement(registroPageObjects.getLnkbtnSignin()).click();

    }
    @Step
    public void clicbtnCreateNewAccount() {
        registroPageObjects.getDriver().findElement(registroPageObjects.getLnkbtnCreateNewAccount()).click();
    }
    @Step
    public void registerNewUser() throws IOException {
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputUserName()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 0));
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputEmail()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 1));
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputPassword()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 2));
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputConfirmPass()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 3));
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputFirstName()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 4));
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputLastName()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 5));
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputPhoneNumber()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 6));
        listasDesplegables.seleccionarValorSelect(registroPageObjects.getDriver(), registroPageObjects.getLstCountry(), datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 7));
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputCity()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 8));
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputAddress()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 9));
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputState()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 10));
        registroPageObjects.getDriver().findElement(registroPageObjects.getInputPostalCode()).sendKeys(datos.obtenerDatos("Informacion", "Datos.xlsx", 1, 11));
        registroPageObjects.getDriver().findElement(registroPageObjects.getCheckAgreeConditions()).click();
    }
    @Step
    public void clicbtnRegister() {
        registroPageObjects.getDriver().findElement(registroPageObjects.getBtnRegister()).click();
    }
}
