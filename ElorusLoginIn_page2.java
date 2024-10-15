package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class for signIn Page
public class ElorusLoginIn_page2 {

	// identifies the UsernameTB.
	@FindBy(id = "id_email")
	private WebElement tbUsername;

	// identifies the PasswordTB.
	@FindBy(id = "id_password")
	private WebElement tbPassword;

	// identifies the LoginButton.
	@FindBy(xpath = "//input[@value='SIGN IN']")
	private WebElement btnSignIn;

	// method to enter username
	public void getUsername(String un) {
		this.tbUsername.sendKeys(un);
	}

	// method to enter password
	public void getPassword(String pw) {
		this.tbPassword.sendKeys(pw);
	}

	// methos to click signIn button
	public void clickSignIn() {
		this.btnSignIn.click();
	}

	//method to enter username,password and click on signIn button.
	public void signIN(String un, String pw) {
		this.tbUsername.sendKeys(un);
		this.tbPassword.sendKeys(pw);
		this.btnSignIn.click();
	}

	// constructor of elorus login page
	public ElorusLoginIn_page2(WebDriver driver) {
		// initialises the elements.
		PageFactory.initElements(driver, this);
	}

}
