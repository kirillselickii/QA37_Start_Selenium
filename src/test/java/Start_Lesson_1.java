import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Start_Lesson_1 {
    WebDriver wd;

    @Test
    public void start(){
        wd=new ChromeDriver();
        //wd.get("https://www.google.com/"); without history
        wd.navigate().to("https://www.google.com/"); // with history
        wd.navigate().back();
        wd.navigate().forward();
        wd.navigate().refresh();


        wd.close();//close only one tab, &close browser if tab one
        wd.quit(); //close all tabs and close browser

    }
}
