package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElorusContacts_page2 {

	// identifies AddContact.
	@FindBy(xpath = "//a[@class='allow-click btn-default btn']")
	public WebElement btnAddContact;

	// identifies import Contact.
	@FindBy(xpath = "//div[@class='btn btn-default']")
	public WebElement btnImportContact;

	// method to click on addContact
	public void clickAddContact() {
		this.btnAddContact.click();
	}

	// method to click on importContact
	public void clickImportContact() {
		this.btnImportContact.click();
	}

	public ElorusContacts_page2(WebDriver driver) {
		// initialises the elements.
		PageFactory.initElements(driver, this);
	}
}
