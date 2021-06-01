package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TextBoxTests {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void successfulSubmitFormTest() {
        open("https://demoqa.com/automation-practice-form");
        //open("https://www.ru");

        $("[id=firstName]").setValue("Name");
        $("[id=lastName]").setValue("lastName");
        $("[id=userEmail]").setValue("someemail@mail.ma");
        $("[for=gender-radio-2]").click();
        $("[id=userNumber]").setValue("8765489764");
        //$("[id=dateOfBirthInput]").clear
        //$("[id=dateOfBirthInput]").setValue("21 May 2021");
        //$("[id=dateOfBirthInput]").click();

        // $ ("[class=react-datepicker__month-select]").find("May").click();
        //$("[id=dateOfBirthInput]").setValue("Choose Wednesday, May 12th, 2004");
        $("[for=hobbies-checkbox-2]").click();
       // $("[id=uploadPicture]").click("");
        $("[id=currentAddress]").setValue("some user address 58");
        $("[id=state]").click();
        $(byText("Haryana")).click();
        $("[id=city]").click();
        $(byText("Karnal")).click();
        $("[id=submit]").click();

        $("tbody").shouldHave(text("Name lastName"),text("someemail@mail.ma"), text("Female"),
                text("8765489764"),text("01 June,2021"),text("Reading"),text("58"),text("Haryana Karnal"));
        //sleep(5000);
        //$(byText("Student Email")).shouldHave(text("someemail@mail.ma"));
       // $("[td=Gender]").shouldHave(text("Gender"), text("Female"));
       /* $("[td=Mobile]").shouldHave(text("Mobile"), text("8765489764"));
        $("[td=Date of Birth]").shouldHave(text("Date of Birth"), text("20 May,2021"));
        $("[td=Subjects]").shouldHave(text("Subjects"), text(" "));
        $("[td=Hobbies]").shouldHave(text("Hobbies"), text("Reading"));
        $("[td=Picture]").shouldHave(text("Picture"), text(" "));
        $("[td=Address]").shouldHave(text("Address"), text("58"));
        $("[td=State and City]").shouldHave(text("State and City"), text(" "));
        $("[id=submit]").click(); */

    }



}
