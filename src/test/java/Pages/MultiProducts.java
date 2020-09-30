package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Logger;

public class MultiProducts  {

    private WebDriver driver;

    private By prd1=By.xpath("//img[@alt='LOUIS PHILIPPE Brown Derby Formal Shoes']");
    private By size1=By.xpath("div.circle.size-variant-item.size-instock.selected");
    private By cart1=By.xpath("//div[@clas='pdp-addtocart-button']");

    private By prd2=By.xpath("img[@alt='Puma Black Paneled Shoedownloads with Double Velcro Fastening']");
    private By size2=By.xpath("//div[@class='oval size-variant-item size-instock selected']");
    private By cart2=By.xpath("//div[@class='btn-gold']");

    private By prd3=By.xpath("//img [@alt='Skechers Black Matera-Holtcrest Slip-On Shoes']");
    private By size3=By.xpath("//div[@class='circle size-variant-item size-instock ']");
    private By cart3=By.xpath("//span[@class='ic-pdp-add-cart']");


    public MultiProducts (WebDriver driver){

        this.driver=driver;
    }
    public void Multiprdts(){
        driver.findElement(prd1).click();
        ArrayList<String> newTab= new
                ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));
        driver.findElement(size1).click();
        driver.findElement(cart1).click();
        driver.switchTo().window(newTab.get(0));

        driver.findElement(prd2).click();
        ArrayList<String>newTab2= new
                ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab2.get(2));
        driver.findElement(size2).click();
        driver.findElement(cart2).click();
        driver.switchTo().window(newTab.get(0));

        driver.findElement(prd3).click();
        ArrayList<String>newTab3= new
                ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTab3.get(3));
        driver.findElement(size3).click();
        driver.findElement(cart3).click();
        driver.switchTo().window(newTab.get(0));

    }
}
