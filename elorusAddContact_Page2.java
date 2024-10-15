package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class elorusAddContact_Page2 {

	// identifies FirstName TB.
	@FindBy(xpath = "//input[@name='first_name']")
	public WebElement tbFirstName;

	// identifies LastName TB.
	@FindBy(xpath = "//input[@name='last_name']")
	public WebElement tbLastName;

	// identifies CompanyName TB.
	@FindBy(xpath = "//input[@name='company']")
	public WebElement tbCompanyName;

	// identifies ProfessionName TB.
	@FindBy(xpath = "//input[@name='profession']")
	public WebElement tbProfessionName;

	// identifies SaveButton.
	@FindBy(xpath = "//span[text()='Save']/parent::a")
	public WebElement btnSave;

	// method to enter firstName
	public void getFirstName(String fn) {
		this.tbFirstName.sendKeys(fn);
	}

	// method to enetr secondName
	public void getLastName(String ln) {
		this.tbFirstName.sendKeys(ln);
	}

	// method to enter companyName.
	public void getCompanyName(String com) {
		this.tbCompanyName.sendKeys(com);
	}

	// method to enter professionName
	public void getProfesionName(String prof) {
		this.tbProfessionName.sendKeys(prof);
	}

	// method to click Save button.
	public void clickSave() {
		this.btnSave.click();
	}

	public elorusAddContact_Page2(WebDriver driver) {
		// initialises the elements.
		PageFactory.initElements(driver, this);
	}
}
