import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class waits {

    @Test
    public void waitsTest() throws InterruptedException {
        open("https://google.com");

        SelenideElement search = $(By.name("q"));
        search.should(visible, Duration.ofSeconds(5)).sendKeys("impact");


    }
}
