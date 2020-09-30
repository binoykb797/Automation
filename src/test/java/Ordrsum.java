
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class Ordrsum {
    private WebDriver driver;

    private By Bagtotal=By.xpath("//section[@id='bagTotal']/span[2]");
    private By Bagdiscount=By.xpath("//section[@id='bagDiscount']/span[2]");
    private By ApplicableGST=By.xpath("//section[@id='estimatedGst']/span[2]");
    private By OrderTotal=By.xpath("//section[@id='orderTotal']/span[2]");
    private By Dltprd=By.xpath("//div[@class='delete-btn']");
    private By Dltbtn=By.xpath("//div[@id=\"modalId\"]/div/div/div[2]/div[2]/div[2]");
    private By afBagtotal=By.xpath("//section[@id='bagTotal']/span[2]");
    private By afBagdiscount=By.xpath("//section[@id='bagDiscount']/span[2]");
    private By afApplicableGST=By.xpath("//section[@id='estimatedGst']/span[2]");
    private By afOrderTotal=By.xpath("//section[@id='orderTotal']/span[2]");

    public Ordrsum(WebDriver driver){ this.driver=driver; }

    public void Ordrsum(){

        String bagtl= driver.findElement(Bagtotal).getText();
        System.out.println("Bag Total: "+bagtl);
        String bagdis= driver.findElement(Bagdiscount).getText();
        System.out.println("Bag Discount: "+bagdis);
        String Appgst= driver.findElement(ApplicableGST).getText();
        System.out.println("Applicable GST: "+Appgst);
        String ordrTotal= driver.findElement(OrderTotal).getText();
        System.out.println("Order Total: "+ordrTotal);

        driver.navigate().refresh();

        driver.findElement(Dltprd).click();
        driver.findElement(Dltbtn).click();

        driver.navigate().refresh();

        String afbagtl= driver.findElement(afBagtotal).getText();
        System.out.println("Bag Total after delete: "+afbagtl);
        String afbagdis= driver.findElement(afBagdiscount).getText();
        System.out.println("Bag discount after delete : "+afbagdis);
        String afAppgst= driver.findElement(afApplicableGST).getText();
        System.out.println("GST After Delete: "+afAppgst);
        String afordrTotal= driver.findElement(afOrderTotal).getText();
        System.out.println("Order Total after Delete: "+afordrTotal);


        Assert.assertNotEquals(bagtl,afbagtl);
        Assert.assertNotEquals(bagdis,afbagdis);
        Assert.assertNotEquals(Appgst,afAppgst);
        Assert.assertNotEquals(ordrTotal,afordrTotal);

        if(bagtl.equals(afbagtl)&&bagdis.equals(afbagdis)&&Appgst.equals(afAppgst)&&ordrTotal.equals(afordrTotal)){
            System.out.println("Not as Expected: Values are similar");
        }
        else {
            System.out.println("Bag Total is Not Equal after and before the item number change");
        }

    }


}

