package test.practice_form;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class TestPracticeForm {
    @Test
    public void practiceFormTest(){
        open("https://demoqa.com/automation-practice-form");
    }
}
