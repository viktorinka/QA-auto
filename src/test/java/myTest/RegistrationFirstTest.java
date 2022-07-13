package myTest;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.RegistrationFormPages;

public class RegistrationFirstTest {
    @BeforeAll
    static void setUp() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
    
    RegistrationFormPages registrationFormPages = new RegistrationFormPages();

    @Test
    void Test(){

        String firstName = "TestName";
        String lastName = "TestLastName";

        registrationFormPages.openPage();
        registrationFormPages.setFirstName(firstName);
        registrationFormPages.setLastName(lastName);
        registrationFormPages.setEmail();
        registrationFormPages.setGender();
        registrationFormPages.setNumber();
        registrationFormPages.setDateOfBirth("30","July" , "2008");
        registrationFormPages.setSubject();
        registrationFormPages.setHobies();
        registrationFormPages.setPicture();
        registrationFormPages.setCurrentAddress();
        registrationFormPages.setState();
        registrationFormPages.setCity();
        registrationFormPages.pressSubmit();
        registrationFormPages.checkResult();




    }
}
