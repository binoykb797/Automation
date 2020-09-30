package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Home {
    private WebDriver driver;
    private By Sign=By.xpath("//span [@class='login-form login-modal']");
    private By UserName=By.xpath("//input [@name='username']");
    private By cont=By.xpath("//input[@type='submit']");
    private By Password = By.id("pwdInput");

    private By Login=By.cssSelector("input.login-form-inputs.login-btn");
    public Home(WebDriver driver){

        this.driver=driver;
    }

    public void Home(String userName,String password) throws InterruptedException {
      //  driver.findElement(Sign).click();

        driver.findElement(UserName).sendKeys(userName);
        driver.findElement(cont).click();



         driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


        driver.findElement(Password).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);

        driver.findElement(Login).click();
    }
    public void Searchproduct(String product){

    }


}
