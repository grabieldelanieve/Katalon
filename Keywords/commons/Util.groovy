package commons
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI


public class Util {

	public static Boolean flag = null;


	public static void clickElement(TestObject to) {

		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			//Ternary Operator
			flag = (WebUI.verifyElementPresent(to, 3)) ? true : false

			if(flag != true) KeywordUtil.markFailedAndStop("")

			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailedAndStop("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop("Fail to click on element: " + e.getMessage())
		}
	}


	public static void setTextElement(TestObject to, String str) {

		try {
			flag = (WebUI.verifyElementPresent(to, 3)) ? true : false

			if(flag != true) KeywordUtil.markFailedAndStop("")

			KeywordUtil.logInfo("Setting text")
			WebUI.setText(to, str)
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailedAndStop("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop("Fail to set text within the input: " + e.getMessage())
		}
	}


	public static void verifyNextScreen(TestObject to) {

		try {

			flag = (WebUI.verifyElementPresent(to, 3)) ? true : false

			if(flag != true) WebUI.waitForElementPresent(to, 5, FailureHandling.STOP_ON_FAILURE)

			KeywordUtil.markPassed("")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailedAndStop("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop("Fail to verify next screen: " + e.getMessage())
		}
	}


	//Getting inner text from HTML element
	public String gettingText(TestObject to) {
		try {

			String innerTextHTML = WebUI.getText(to)
			KeywordUtil.logInfo(innerTextHTML)
			return innerTextHTML.toString();

		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailedAndStop("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop("Fail to get inner text: " + e.getMessage())
		}

	}


	public void compareText(TestObject to, String str) {

		String textCaptured = gettingText(to)
		int g = null;

		try {
			if(textCaptured != null)  g = gettingText(to).compareTo(str)
			if(g.equals(0)) {
				KeywordUtil.logInfo("Text as expected")
			} else {
				KeywordUtil.markFailed("The text is not the same as expected")
			}
		} catch(WebElementNotFoundException e) {
			KeywordUtil.markFailedAndStop(e.getMessage())
		} catch(Exception e) {

		}
	}
	
	
	private static int randomNumber(int maxNumber) {
		Random random = new Random();
		int rNumber = random.nextInt(maxNumber)
		return rNumber;
	}
}