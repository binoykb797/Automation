package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Search {
    public WebDriver driver;
    public String product;
    private By Searchbox=By.xpath("//input[@autocomplete='off']");
    private By searchbtn=By.className("ic-search");
    private By searchResult=By.xpath("//div[@class='length']");

    public Search(WebDriver driver) {

        this.driver=driver;
    }


    public void Search(String product) {
        this.product=product;
        driver.findElement(Searchbox).sendKeys(product);
        driver.findElement(searchbtn).click();
    }

    public boolean CheckProductPresent(){
        boolean flag=false;
        if(driver.findElements(By.xpath("//*[contains(text(),'"+product+"')]")).size()>0)
            flag=true;
        return flag;


    }

}

