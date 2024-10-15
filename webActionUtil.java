package generic;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class webActionUtil {

	WebDriver driver;

	public webActionUtil(WebDriver driver) {
		this.driver = driver;
	}

	public static String getData(String fileLocation, String sheetName, int rowno, int colno) {
		try {
			FileInputStream f = new FileInputStream(fileLocation);
			Workbook book = WorkbookFactory.create(f);
			String d = book.getSheet(sheetName).getRow(rowno).getCell(colno).getStringCellValue();
			return d;
		} catch (Exception e) {
			return null;
		}
	}

	public void validateTitle(String expectedTitle) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.titleIs(expectedTitle));
			System.out.println("Pass: title is matching");

		} catch (Exception e) {
			System.out.println("Fail: title is not matching");
			Assert.fail();
		}
	}

	public void validateElementVisibility(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
			wait.until(ExpectedConditions.visibilityOf(element));
			System.out.println("Pass: Element is visible");

		} catch (Exception e) {
			System.out.println("Fail: Element is not visible");
			Assert.fail();
		}
	}

	public void captureScreenshot(String failedScriptName) {
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(baseTest.userDir + "//screenshot//" + failedScriptName + ".png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (Exception e) {

		}

	}

}
