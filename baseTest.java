package generic;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class baseTest {

	// constant values
	public static final String userDir = System.getProperty("user.dir");
	public static final String chromeKey = "webdriver.chrome.driver";
	public static final String geckoKey = "webdriver.gecko.driver";
	public static final String edgeKey = "webdriver.edge.driver";
	public static final String chromeValue = userDir + "\\drivers\\chromedriver.exe";
	public static final String geckoValue = userDir + "\\drivers\\geckodriver.exe";
	public static final String edgeValue = userDir + "\\drivers\\msedgedriver.exe";
	public static final String excelPath = userDir + "\\data\\Demo.xlsx";
	public static final String propertylPath = userDir + "\\data\\Demo.properties";

	public WebDriver driver;
	public static Properties p;
	public static webActionUtil actionUtil;

	// sets the path for driver executables
	@BeforeClass
	public void setPath() {

		try {
			FileInputStream f = new FileInputStream(propertylPath);
			p = new Properties();
			p.load(f);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.setProperty(chromeKey, chromeValue);
		System.setProperty(geckoKey, geckoValue);
		System.setProperty(edgeKey, edgeValue);
	}

	// launches the browser
	@Parameters("BrowserName")
	@BeforeMethod
	public void launchBrowser(String BN) {

		if (BN.equals("chrome"))
			driver = new ChromeDriver();
		else if (BN.equals("firefox"))
			driver = new FirefoxDriver();
		else if (BN.equals("edge"))
			driver = new EdgeDriver();

		actionUtil = new webActionUtil(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get(p.getProperty("url"));
	}

	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

	@AfterSuite
	public void killDrivers() {
		try {
			Runtime.getRuntime().exec("taskkill /IM chromedriver.exe / F");
			Runtime.getRuntime().exec("taskkill /IM geckodriver.exe / F");
			Runtime.getRuntime().exec("taskkill /IM msedgedriver.exe / F");

		} catch (Exception e) {

		}
	}

}
