package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DeleteFromCart {

    private WebDriver driver;

    private By gotocart=By.xpath("//*[@id=\"appContainer\"]/div[1]/div/header/div[3]/div[2]/div[2]");
    private By del=By.xpath("//div[@class='delete-btn']");

    public DeleteFromCart(WebDriver driver) {

        this.driver=driver;
    }

    public void deletefromcart(){
        driver.findElement(gotocart).click();
        driver.findElement(del).click();

    }


}
