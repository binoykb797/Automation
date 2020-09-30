package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MyBag {
    private WebDriver driver;

    private By cartbttn= By.cssSelector("div.ic-cart");
    private By prdcount=By.xpath("//dic[@class='mybag-section']");

    public MyBag(WebDriver driver){
        this.driver=driver;
    }
    public void MyBag(){
        driver.findElement(cartbttn).click();
        System.out.println("getting");
        driver.navigate().refresh();

        String Count=driver.findElement(prdcount).getText();
        System.out.println("products"+Count);

        Assert.assertEquals(Count,"(3 prdts)");

        if (Count.equals("(3 prdts)")){
            System.out.println("Total count and cart count is equal");

        } else{
            System.out.println("Not equal");
        }
    }


}

