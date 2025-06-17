package maven.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchProduct {
	public WebDriver driver;
	@FindBy(xpath = "//a[@href='/products']")
	WebElement product;
	@FindBy(id = "search_product")
	WebElement Search;
	@FindBy(id = "submit_search")
	WebElement Clicksearch;

	public SearchProduct(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickProduct() {
		product.click();
	}

public void ProductSearch() {
	Search.sendKeys("Tops");
}
	public void Clickicon()
	{
		Clicksearch.click();
	}
}
