package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage extends  BasePage {
   private By searchProductInput = By.cssSelector("input[type=\"text\"]");
   private By searchButton = By.id("submit_search");

    public ProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void openURL() {
    }

    public WebElement getSearchProductInput(){
        return driver.findElement(searchProductInput);
    }

    public void setSearchProductInput(String productInput){
        getSearchProductInput().sendKeys();
    }

    public WebElement getSearchButton(){
        return driver.findElement(searchButton);
    }

    public void clickSearchButton(){
        getSearchButton().click();
    }
}
