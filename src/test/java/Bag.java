
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class Bag {
    private WebDriver driver;

    private By cartbtn=By.xpath("//div[@class='ic-cart ']");
    private By itemcount=By.xpath("//div[@class='mybag-section']");
    public Bag(WebDriver driver){ this.driver=driver; }

    public void Bag(){
        driver.findElement(cartbtn).click();
        System.out.println("working");
        driver.navigate().refresh();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS) ;

        String Count= driver.findElement(itemcount).getText();
        System.out.println("content "+Count);

        Assert.assertEquals(Count,"(3 items)");

        if(Count.equals("(3 items)")){
            System.out.println("Total Number and Cart Number is Equal");
        }
        else {
            System.out.println("Not Equal");
        }






    }



}

