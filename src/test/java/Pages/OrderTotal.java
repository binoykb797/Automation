package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OrderTotal {

    private WebDriver driver;

    private By Bagtotal = By.xpath("//section[@id='bagTotal']");
    private By BagDiscount = By.xpath("//section[@id='bagDiscount']");
    private By ApplicableGst = By.xpath("//section[@id='estimatedGst']");
    private By prddelivery = By.xpath("//section[@id='delivery']");
    private By couponsvngs = By.xpath("/section[@id='couponDiscount']");
    private By Ordertotal = By.xpath("//section[@id='orderTotal']");

    public OrderTotal(WebDriver driver) {

        this.driver = driver;
    }

    public void OrderTotal() {

        String bagprd1 = driver.findElement(Bagtotal).getText();
        System.out.println("Bag Total:" + bagprd1);
        String bagdisc = driver.findElement(BagDiscount).getText();
        System.out.println("Bag Discountl:" + bagdisc);
        String gst = driver.findElement(ApplicableGst).getText();
        System.out.println("Applicable Gst:" + gst);
        String delivery = driver.findElement(prddelivery).getText();
        System.out.println("prddelivery:" + delivery);
        String savings = driver.findElement(couponsvngs).getText();
        System.out.println("couponsavings:" + delivery);
        String ordrtotal = driver.findElement(Ordertotal).getText();
        System.out.println("Order Total:" + ordrtotal);

        Assert.assertNotEquals(ordrtotal, bagprd1);
        Assert.assertEquals(ordrtotal, bagdisc);
        Assert.assertEquals(ordrtotal, gst);
        Assert.assertEquals(ordrtotal, couponsvngs);


        if (bagprd1.equals(ordrtotal) && bagdisc.equals(ordrtotal) && gst.equals(ordrtotal) && couponsvngs.equals(ordrtotal)) {
            System.out.println("Not Equal");
        } else {
            System.out.println("Sum is equal as order Total");
        }


    }
}