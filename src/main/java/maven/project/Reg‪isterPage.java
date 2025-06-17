package maven.project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reg‪isterPage {
	public WebDriver driver;
	@FindBy(name = "email")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(css ="button[data-qa='login-button']")
	WebElement logintton;
	@FindBy(xpath ="//a[text()=' Signup / Login']")
	WebElement Signin; 
	
	public Reg‪isterPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
        // Actions
        public void enterEmail(String email1)
        {
        	email.sendKeys(email1);
        }

        public void enterPassword(String password1) {
        	password.sendKeys(password1);
        }

        public void clickLogin() {
        	logintton.click();}
        	 public void Signin() {
        		 Signin.click();
             }
        }
    
