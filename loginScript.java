package scripts;

import org.testng.annotations.Test;

import generic.baseTest;
import pages.intializePages;

public class loginScript extends baseTest {
	@Test
	public void elorusLoginScript() {

		intializePages pages = new intializePages(driver);
		pages.Login.getUsername(p.getProperty("userName"));
		pages.Login.getPassword(p.getProperty("passWord"));
		pages.Login.clickSignIn();
		actionUtil.validateTitle("Elorus");

	}
}
