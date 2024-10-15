package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class for ElorusHome Page
public class ElorusHome_page2 {

	// identifies invoice.
	@FindBy(xpath = "//a[@title='Invoices']")
	private WebElement lnkInvoices;

	// identifies expenses.
	@FindBy(xpath = "//a[@title='Expenses']")
	private WebElement lnkExpenses;

	// identifies projects.
	@FindBy(xpath = "//a[@title='Projects']")
	private WebElement lnkProjects;

	// identifies Time.
	@FindBy(xpath = "//a[@title='Time']")
	private WebElement lnkTime;

	// identifies contacts.
	@FindBy(xpath = "//a[@title='Contacts']")
	private WebElement lnkContacts;

	// identifies user profile.
	@FindBy(xpath = "//div[text()='Mahesh']/ancestor::a")
	private WebElement btnUserprofile;

	// identifies Logout.
	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement btnLogout;

	//method to click on Invoices
	public void clickInvoices() {
		this.lnkInvoices.click();
	}

	//method to click on Expenses
	public void clickExpenses() {
		this.lnkExpenses.click();
	}
	
	//method to click on projects
	public void clickProjects() {
		this.lnkProjects.click();
	}

	public void clickTime() {
		this.lnkTime.click();
	}

	public void clickContacts() {
		this.lnkContacts.click();
	}

	public void clickUserProfile() {
		this.btnUserprofile.click();
	}

	public void clickLogout() {
		this.btnLogout.click();
	}

	public ElorusHome_page2(WebDriver driver) {
		// initialises the elements.
		PageFactory.initElements(driver, this);
	}

}
