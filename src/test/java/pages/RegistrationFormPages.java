package pages;

import pages.components.Calendar;
import pages.components.CheckResult;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;

public class RegistrationFormPages {

    Calendar calendar = new Calendar();
    CheckResult checkResult = new CheckResult();
    public void openPage(){
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");
    }
    public RegistrationFormPages setFirstName(String value){
        $("#firstName").setValue(value);

        return this;
    }

    public RegistrationFormPages setLastName(String value){
        $("#lastName").setValue(value);

        return this;
    }

    public RegistrationFormPages setEmail(){
        $("#userEmail").setValue("Test@mail.ru");

        return this;
    }

    public RegistrationFormPages setGender(){
        $("#gender-radio-1").parent().click();

        return this;
    }

    public RegistrationFormPages setNumber(){
        $("#userNumber").setValue("1234567890");

        return this;
    }

    public RegistrationFormPages setDateOfBirth(String day, String month, String year){
        $("#dateOfBirthInput").click();

        calendar.setDate(day, month, year);

        return this;
    }

    public RegistrationFormPages setSubject(){
        $("#subjectsInput").setValue("Maths").pressEnter();

        return this;
    }

    public RegistrationFormPages setHobies(){
        $("#hobbiesWrapper").$(byText("Sports")).click();

        return this;
    }

    public RegistrationFormPages setPicture(){
        $("#uploadPicture").uploadFile(new File("src/test/java/resources/sddefault.jpeg"));

        return this;
    }

    public RegistrationFormPages setCurrentAddress() {
        $("#currentAddress").setValue("TestCurrentAddress");

        return this;
    }

    public RegistrationFormPages setState(){
        $("#state").click();$(byText("Haryana")).click();

        return this;
    }

    public RegistrationFormPages setCity(){
        $("#city").click();$(byText("Panipat")).click();

        return this;
    }

    public RegistrationFormPages pressSubmit(){
        $("#submit").click();

        return this;
    }

    public RegistrationFormPages checkResult(){
        //Проверка формы
        checkResult.checkResultForm();
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("TestName " + "TestLastName"), text("Test@mail.ru"),
                text("1234567890"), text("sddefault.jpeg"));

        return this;
    }
}
