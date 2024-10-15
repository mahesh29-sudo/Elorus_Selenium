package pages;

import org.openqa.selenium.WebDriver;

public class intializePages {

	public ElorusLoginIn_page2 Login;
	public ElorusHome_page2 Home;
	public ElorusContacts_page2 Contact;
	public elorusAddContact_Page2 AddContact;

	public intializePages(WebDriver driver) {

		this.Login = new ElorusLoginIn_page2(driver);
		this.Home = new ElorusHome_page2(driver);
		this.Contact = new ElorusContacts_page2(driver);
		this.AddContact = new elorusAddContact_Page2(driver);

	}
}
