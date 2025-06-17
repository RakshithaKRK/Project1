package maven.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Existingmail {
public WebDriver driver;
	@FindBy(name = "name")
	WebElement Username;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	WebElement Email;
	
	@FindBy(xpath ="//button[@data-qa='signup-button']")
	WebElement logintton;

	@FindBy(xpath ="//a[text()=' Signup / Login']")
	WebElement Signin; 
	
	public Existingmail(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void email(String emailid)
	{
		Username.sendKeys(emailid);
	}
	public void Pwd(String PWD)
	{
		Email.sendKeys(PWD);
	}
	public void Login()
	{
		logintton.click();
	}
	public void Signin() {
		 Signin.click();
}
}