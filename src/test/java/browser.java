import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class browser {

    @Test
    public void launchBrowser(){
        //default browser is chrome
        //select safari to run test
        Configuration.browser="safari";
        open("https:www.google.com");
        //running tests on headless mode
        Configuration.headless=false;
        open("https:www.google.com");
        //setting up baseUrl
        Configuration.baseUrl="https:www.google.com";
        open("/search?q=impact");
        //taking SS, default value is true
        Configuration.screenshots=true;
        //send keys via JS instead selenium, because it is faster
        Configuration.fastSetValue=true;
        //browser size
        Configuration.browserSize="1366x768";


    }
}
