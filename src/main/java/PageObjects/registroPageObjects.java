package PageObjects;

import Step.registroSteps;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.advantageonlineshopping.com/#/")

public class registroPageObjects extends PageObject{
    registroSteps registroSteps = new registroSteps();
    By lnkbtnSignin = By.xpath("//a[@aria-label='UserMenu' and @ id='menuUserLink']");
    By lnkbtnCreateNewAccount = By.xpath("//a[contains(.,'CREATE NEW ACCOUNT')]");
    By inputUserName = By.xpath("//input[@name='usernameRegisterPage']");
    By inputEmail = By.xpath("//input[@name='emailRegisterPage']");
    By inputPassword = By.xpath("//input[@name='passwordRegisterPage']");
    By inputConfirmPass = By.xpath("//input[@name='confirm_passwordRegisterPage']");
    By inputFirstName = By.xpath("//input[@name='first_nameRegisterPage']");
    By inputLastName = By.xpath("//input[@name='last_nameRegisterPage']");
    By inputPhoneNumber = By.xpath("//input[@name='phone_numberRegisterPage']");
    By lstCountry = By.xpath("//select[@name='countryListboxRegisterPage']");
    By inputCity = By.xpath("//input[@name='cityRegisterPage']");
    By inputAddress = By.xpath("//input[@name='addressRegisterPage']");
    By inputState = By.xpath("//input[@name='state_/_province_/_regionRegisterPage']");
    By inputPostalCode = By.xpath("//input[@name='postal_codeRegisterPage']");
    By checkAgreeConditions = By.xpath("//input[@name='i_agree']");
    By btnRegister = By.xpath("//button[@id='register_btnundefined']");
    By msjUser  = By.xpath("//*[@id='menuUserLink']/span");

    public By getMsjUser() {
        return msjUser;
    }

    public By getInputEmail() {
        return inputEmail;
    }

    public By getInputPassword() {
        return inputPassword;
    }

    public By getInputConfirmPass() {
        return inputConfirmPass;
    }

    public By getInputFirstName() {
        return inputFirstName;
    }

    public By getInputLastName() {
        return inputLastName;
    }

    public By getInputPhoneNumber() {
        return inputPhoneNumber;
    }

    public By getLstCountry() {
        return lstCountry;
    }

    public By getInputCity() {
        return inputCity;
    }

    public By getInputAddress() {
        return inputAddress;
    }

    public By getInputState() {
        return inputState;
    }

    public By getInputPostalCode() {
        return inputPostalCode;
    }

    public By getCheckAgreeConditions() {
        return checkAgreeConditions;
    }

    public By getBtnRegister() {
        return btnRegister;
    }

    public By getInputUserName() {
        return inputUserName;
    }

    public By getLnkbtnCreateNewAccount() {
        return lnkbtnCreateNewAccount;
    }

    public By getLnkbtnSignin() {
        return lnkbtnSignin;
    }
}
