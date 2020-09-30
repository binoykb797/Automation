package Pages;

import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.w3c.dom.ls.LSOutput;

public class Order_Summ {

    private WebDriver driver;

    private By Bagtotal= By.xpath("//section[@id='bagTotal']");
    private By BagDiscount= By.xpath("//section[@id='bagDiscount']");
    private By ApplicableGst= By.xpath("//section[@id='estimatedGst']");
    private By Ordertotal= By.xpath("//section[@id='orderTotal']");

    private By Delprdct=By.xpath("//div[@class='delete-btn']");
    private By Delbutn=By.xpath("//div[@class='delete-product']");


    private By afBagtotal= By.xpath("//section[@id='bagTotal']");
    private By afBagDiscount= By.xpath("//section[@id='bagDiscount']");
    private By afApplicableGst= By.xpath("//section[@id='estimatedGst']");
    private By afOrdertotal= By.xpath("//section[@id='orderTotal']");


    public Order_Summ(WebDriver driver){
        this.driver=driver;
    }
    public void Order_Summ(){

        String bagprd1=driver.findElement(Bagtotal).getText();
        System.out.println("Bag Total:"+bagprd1);
        String bagdisc=driver.findElement(BagDiscount).getText();
        System.out.println("Bag Discountl:"+bagdisc);
        String gst=driver.findElement(ApplicableGst).getText();
        System.out.println("Applicable Gst:"+gst);
        String ordrtotal=driver.findElement(Ordertotal).getText();
        System.out.println("Order Total:"+ordrtotal);

        driver.navigate().refresh();

        driver.findElement(Delprdct).click();
        driver.findElement(Delbutn).click();

        driver.navigate().refresh();

        String aftbagprd1=driver.findElement(Bagtotal).getText();
        System.out.println("Bag Total:"+aftbagprd1);
        String aftbagdisc=driver.findElement(BagDiscount).getText();
        System.out.println("Bag Discountl:"+aftbagdisc);
        String aftgst=driver.findElement(ApplicableGst).getText();
        System.out.println("Applicable Gst:"+aftgst);
        String aftordrtotal=driver.findElement(Ordertotal).getText();
        System.out.println("Order Total:"+aftordrtotal);

        Assert.assertNotEquals(bagprd1,aftbagprd1);
        Assert.assertNotEquals(bagdisc,aftbagdisc);
        Assert.assertNotEquals(gst,aftgst);
        Assert.assertNotEquals(ordrtotal,aftordrtotal);

        if (bagprd1.equals(aftbagprd1)&&bagdisc.equals(aftbagdisc)&&gst.equals(aftgst)&&ordrtotal.equals(aftordrtotal)){
            System.out.println("Not Expected Outcome: values have similarity" );
        }else{
            System.out.println("Bag Total is not equal even after and before the change in items");
        }







    }



}
