import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class navigations {

    @Test
    public void navigate() throws InterruptedException {
        open("https:www.impact.com");

        //get title
        System.out.println(title());

        open("https:www.google.com");
        System.out.println(title());
        back();
        System.out.println(title());

        Thread.sleep(5000);
        refresh();

        //quit vs close
        open("https://www.impact.com");
        $(By.xpath("//nav[@class='main menu-primary__wrapper']//a[normalize-space()='Sign in']")).click();
        Thread.sleep(5000);
        switchTo().window(1);
        System.out.println(title());
        closeWindow();
        switchTo().window(0);
        Thread.sleep(5000);
        closeWebDriver();




    }

}
