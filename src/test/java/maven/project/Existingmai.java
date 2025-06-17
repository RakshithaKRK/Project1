package maven.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Existingmai {
public WebDriver driver;
Existingmail EX;
	
	@BeforeTest
	@Parameters({"url"})
	public void setUp(String url)
	{
	driver=new ChromeDriver();
	driver.get(url);
	 EX = new Existingmail(driver);
	}
	@Test
	@Parameters({"Username","Emailaddress"})
	public void test(String email, String password)
	{	EX.Signin();
		EX.email(email);
		EX.Pwd(password);
		EX.Login();
	
		Assert.assertTrue(driver.findElement(By.xpath("//P[text()='Email Address already exist!']")).isDisplayed());
	System.out.println("yes error is displayed");
	}
}
