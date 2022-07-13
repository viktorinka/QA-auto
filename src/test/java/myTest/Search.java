package myTest;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Search {
   @Test
    void succesfullSearch(){
// Открыть гугл
       open("https://google.com");

       //вести в поиск
       $("[name=q]").setValue("Selenide").pressEnter();

       //Проверить результат в поиске
       $("[id=search]").shouldHave(Condition.text("selenide.org"));

    }
}
