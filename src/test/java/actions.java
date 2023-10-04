import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class actions {

    @Test
    public void actions() throws InterruptedException {

        //hover over
        open("https://impact.com");
        SelenideElement publishersMenu=$(By.xpath("//a[normalize-space()='Publishers']"));
        Selenide.actions().moveToElement(publishersMenu).build().perform();
        Thread.sleep(5000);
        //click on a selection in the menu
        SelenideElement overview=$(By.xpath("//a[normalize-space()='Overview']"));
        overview.click();
        Thread.sleep(5000);



    }
}
