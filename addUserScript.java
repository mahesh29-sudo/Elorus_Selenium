package scripts;

import org.testng.annotations.Test;

import dataProviders.elorusdataProvider;
import generic.baseTest;
import pages.intializePages;

public class addUserScript extends baseTest {

	@Test(dataProviderClass=elorusdataProvider.class, dataProvider="elorusData")
	public void elorusAddUserScript(String UN, String PW, String FN, String LN, String Comp, String Proff)
	{
		intializePages pages = new intializePages(driver);
		pages.Login.getUsername(UN);
		pages.Login.getPassword(PW);
		pages.Login.clickSignIn();
		pages.Home.clickContacts();
		pages.Contact.clickAddContact();
		pages.AddContact.tbFirstName.sendKeys(FN);
		pages.AddContact.tbLastName.sendKeys(LN);
		pages.AddContact.tbCompanyName.sendKeys(Comp);
		pages.AddContact.tbProfessionName.sendKeys(Proff);
		pages.AddContact.clickSave();
		pages.Home.clickUserProfile();
		pages.Home.clickLogout();
	}
}
