import com.codeborne.selenide.CollectionCondition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class findingElements {

    @Test
    public void googleSearchTest(){
        //Navigate to a URL
        open("https:www.google.com");

        //Find an element on the page

        //sending text to search box
        $(By.name("q")).setValue("impact");
        //click search btn
        $(By.name("btnK")).click();
        //validate google logo at the top left
        $(By.id("logo")).shouldHave(appear);
        //getting text of search result
        String impactHeader=$(By.xpath("//h3[contains(text(),'Partnership Automation')]")).getText();
        System.out.println(impactHeader);
        //finding multiple elements on the page
        int size=$$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).size();
        System.out.println(size);
        //validate number of elements
        $$(By.cssSelector(".LC20lb.MBeuO.DKV0Md")).shouldHave(CollectionCondition.size(12));



    }
}
