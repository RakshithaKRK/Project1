package maven.project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class SearchProduct1 {
	SearchProduct Search;
	public WebDriver driver;
		@BeforeTest
		@Parameters({"url"})
		public void search(String url ) {
			driver=  new ChromeDriver();
			driver.get(url);
		Search=	new SearchProduct(driver);
		}
		
		@Test
		public void product() {
			Assert.assertTrue(driver.findElement(By.xpath("//i[@class='fa fa-home']")).isDisplayed(),"yes Home page displayed");
			Search.clickProduct();
			Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='All Products']")).isDisplayed(),"no all products are displayed");
			Search.ProductSearch();
			Search.Clickicon();
			Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Searched Products']")).isDisplayed(),"yes searched products are displayed");
		}
}
