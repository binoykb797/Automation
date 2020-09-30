
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Choose {
    private WebDriver driver;

    private By txtselect=By.xpath("//img[@alt='CARRERA Yellow UV-Protected Square Sunglasses with Top Bar']");
    private By txtaddcart=By.xpath("//div[@class='pdp-addtocart-button']");

    public Choose(WebDriver driver){
        this.driver=driver;
    }

    public void Choose(){
        driver.findElement(txtselect).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        driver.findElement(txtaddcart).click();
        driver.close();
        driver.switchTo().window(newTab.get(0));

    }



}
