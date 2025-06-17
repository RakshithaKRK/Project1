package maven.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Registerpage {
	public WebDriver driver;
	Reg‪isterPage loginPage;
	@BeforeTest
	// launch browser
	@Parameters({"url"})
	public void setUp(String url) {
		 driver = new ChromeDriver();
		driver.get(url);
		loginPage=new Reg‪isterPage(driver);
	}
	@Test
	@Parameters({ "EmailID", "Password" })
	public void login(String Email, String Pwd) {
		loginPage.Signin();
		loginPage.enterEmail(Email);
		loginPage.enterPassword(Pwd);
		loginPage.clickLogin();
	}

	@AfterTest()
	public void close() {
		driver.close();
	}
}
