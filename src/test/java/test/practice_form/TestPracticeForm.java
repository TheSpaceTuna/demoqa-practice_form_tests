package test.practice_form;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class TestPracticeForm {
    @Test
    public void practiceFormTest(){

        open("https://demoqa.com/automation-practice-form");
        $x("//input[@id='firstName']").sendKeys("Test");
        $x("//input[@id='lastName']").sendKeys("Test");
        $x("//input[@id='userEmail']").sendKeys("Test@test.com");
        $x("//input[@id='gender-radio-1']").doubleClick();
        $x("//input[@id='userNumber']").sendKeys("1234567890");
        $x("//input[@id='dateOfBirthInput']").click();
        $x("//select[@class='react-datepicker__month-select']").click();
        $x("//option[@value='1']").click();
        $x("//select[@class='react-datepicker__year-select']").click();
        $x("//option[@value='1997']").click();
        $x("//div[@aria-label='Choose Tuesday, February 4th, 1997']").click();
        $x("//input[@id='dateOfBirthInput']").shouldHave(Condition.value("04 Feb 1997"));
        $x("//input[@id='subjectsInput']").sendKeys("Computer Science");
        $x("//div[@id='react-select-2-option-0']").click();
        $x("//div[@class='custom-control custom-checkbox custom-control-inline'][1]").click();
        $x("//div[@class='custom-control custom-checkbox custom-control-inline'][2]").click();
        $x("//div[@class='custom-control custom-checkbox custom-control-inline'][3]").click();
        $x("//input[@id='uploadPicture']").uploadFile(new File("src/files/test.jpg"));
        $x("//textarea[@id='currentAddress']").sendKeys("Test city, Test str. 8");
        $x("//div[@class=' css-1wy0on6']").scrollIntoView(true).click();
        $x("//div[@id='react-select-3-option-0']").click();
        $x("//div[@class=' css-1wa3eu0-placeholder']").click();
        $x("//div[@id='react-select-4-option-0']").click();
        $x("//input[@id='subjectsInput']").pressEnter();
        sleep(5000);
    }
}
