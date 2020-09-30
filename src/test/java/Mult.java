
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Mult {
    private WebDriver driver;

    private By txtselect1=By.xpath("//img[@alt='Pepe Jeans Grey PJ7241C4 G UV-Protected Full-Rim Wayfarers']");
    private By txtselect2=By.xpath("//img[@alt='MTV Roadies Gradient Grey UV Protected Aviators']");
    private By txtselect3=By.xpath("//img[@alt='Ray Ban Black 0RB418160157 Full-Rim Square Sunglasses']");
    private By txtaddcart=By.xpath("//div[@class='pdp-addtocart-button']");

    public Mult(WebDriver driver){
        this.driver=driver;
    }

    public void Mult(){
        driver.findElement(txtselect1).click();
        ArrayList<String> newTab = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        driver.findElement(txtaddcart).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;
//        driver.close();
        driver.switchTo().window(newTab.get(0));
        driver.findElement(txtselect2).click();
        ArrayList<String> newTab2 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab2.get(2));
        driver.findElement(txtaddcart).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;
//        driver.close();
        driver.switchTo().window(newTab.get(0));
        driver.findElement(txtselect3).click();
        ArrayList<String> newTab3 = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab3.get(3));
        driver.findElement(txtaddcart).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;
//        driver.close();
        driver.switchTo().window(newTab.get(0));

 }



}
