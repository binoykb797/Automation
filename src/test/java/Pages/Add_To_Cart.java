package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class Add_To_Cart {
    private WebDriver driver;
    
    private By productinfo=By.xpath("//*[@id=\'products\']/div[3]/div[1]/div/div[1]/a/div/div[1]/img");

    private By addtomybag=By.xpath("//*[@id=\'appContainer\']/div[2]/div/div/div[2]/div/div[3]/div/div[8]/div[1]/div[1]/div/span[2]");
    private By selectsize=By.xpath("//*[@id=\'appContainer\']/div[2]/div/div/div[2]/div/div[3]/div/div[5]/div[2]/div/div/div[4]/div");
    public Add_To_Cart(WebDriver driver){

        this.driver=driver;
    }
    public void Add_To_Cart(){

        driver.findElement(productinfo).click();
        ArrayList<String>newTab= new
                ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        driver.findElement(selectsize).click();
        driver.findElement(addtomybag).click();
        driver.close();
        driver.switchTo().window(newTab.get(0));
    }

}
