import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class HomeWork_SK_1 {
    WebDriver wd;
    @BeforeClass
    public void setUp() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");
    }
    @Test
    public void cssLocators(){
//by tag name
      WebElement btn1 = wd.findElement(By.tagName("div"));
      WebElement btn2 = wd.findElement(By.cssSelector("div"));
      WebElement btn5 = wd.findElement(By.tagName("button"));
      WebElement btn6 = wd.findElement(By.cssSelector("button"));
      WebElement btn7 = wd.findElement(By.xpath("//button"));
      WebElement btn8 = wd.findElement(By.tagName("h1"));
      WebElement btn9 = wd.findElement(By.cssSelector("h1"));
      List<WebElement> list = Collections.singletonList(wd.findElement(By.tagName("a")));
      List<WebElement> list1 = wd.findElements(By.cssSelector("a"));
      List<WebElement> list2 = Collections.singletonList(wd.findElement(By.tagName("input")));
      List<WebElement> list3 = wd.findElements(By.cssSelector("input"));
      List<WebElement> list4 = Collections.singletonList(wd.findElement(By.tagName("button")));
      List<WebElement> list5 = wd.findElements(By.cssSelector("button"));
//by class
      WebElement bc1 = wd.findElement(By.className("container"));
      WebElement bc2 = wd.findElement(By.cssSelector(".container"));
      WebElement bc3 = wd.findElement(By.xpath("//*[@class='container']"))
      WebElement bc4 = wd.findElement(By.className("navbar-component_nav__1X_4mr"));
      WebElement bc5 = wd.findElement(By.cssSelector(".navbar-component_nav__1X_4m"));
      WebElement bc6 = wd.findElement(By.className("active"));
      WebElement bc7 = wd.findElement(By.cssSelector(".active"));
      WebElement bc8 = wd.findElement(By.className("login_login__3EHKB"));
      WebElement bc9 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
//By ID
      WebElement bid1 = wd.findElement(By.id("root"));
      WebElement bid2 = wd.findElement(By.cssSelector("#root"));
// by atribute
      WebElement ba1 = wd.findElement(By.cssSelector("[id='root']"));
      WebElement ba2 = wd.findElement(By.cssSelector("[class='container']"));
      WebElement ba3 = wd.findElement(By.cssSelector("[class='navbar-component_nav__1X_4mr']"));
      WebElement ba4 = wd.findElement(By.cssSelector("[placeholder=\"Email\"]"));
      WebElement ba5 = wd.findElement(By.cssSelector("[placeholder='Email']"));
      WebElement ba6 = wd.findElement(By.cssSelector("[placeholder=\"Password\"]"));

      WebElement ba8 = wd.findElement(By.cssSelector("[href='/home']"));
      WebElement ba9 = wd.findElement(By.cssSelector("[href='/about']"));
      WebElement ba10 = wd.findElement(By.cssSelector("[href='/login']"));
      WebElement ba11 = wd.findElement(By.cssSelector("[name='email']"));
      WebElement ba12 = wd.findElement(By.cssSelector("[name='password']"));

      WebElement ba7 = wd.findElement(By.cssSelector("[placeholder='Password']"));
        //start from ...
      wd.findElement(By.cssSelector("[placeholder ^='Pas']"));
      WebElement ba13 = wd.findElement(By.xpath("//input[starts-with(@placeholder, 'En')]"));
        //end on ...
      wd.findElement(By.cssSelector("[placeholder $='ord']"));
        //contains
      wd.findElement(By.cssSelector("[placeholder *='ssw']"));
      WebElement ba14 = wd.findElement(By.xpath())
    }

    }

