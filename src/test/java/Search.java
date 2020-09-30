
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search {
    private WebDriver driver;

    private By txtsearch=By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/child::input");
    private By txtsearchbtn=By.xpath("//button[@class='rilrtl-button']/child::span");
    public Search(WebDriver driver){ this.driver=driver; }

    public void Search(String product){
        driver.findElement(txtsearch).sendKeys(product);
        driver.findElement(txtsearchbtn).click();

    }



}

