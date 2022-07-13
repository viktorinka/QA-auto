package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class CheckResult {
    public void checkResultForm(){
        //Проверка формы
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text("TestName " + "TestLastName"), text("Test@mail.ru"),
                text("1234567890"), text("sddefault.jpeg"));
    }
}
