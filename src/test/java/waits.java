import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class waits {

    @Test
    public void waitsTest() throws InterruptedException {
        open("https://google.com");

        $(By.name("q")).setValue("impact").pressEnter();
        Thread.sleep(5000);

    }
}
