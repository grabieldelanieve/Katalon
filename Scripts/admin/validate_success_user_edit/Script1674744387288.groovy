import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import commons.Util as Util
import constants.Enum.ElementosOrange as ElementosOrange

WebUI.callTestCase(findTestCase('login/validate_success_user_login'), [:], FailureHandling.STOP_ON_FAILURE)

Util.getInstance().clickElement(ElementosOrange.GLOBAL_MENU_ADMIN.getObject)

WebUI.callTestCase(findTestCase('admin/validate_success_user_search'), [('KEY1') : GlobalVariable.orangeUserName], FailureHandling.STOP_ON_FAILURE)

Util.getInstance().clickElement(ElementosOrange.BUTTON_EDIT_EDIT.getObject)

Util.getInstance().clearInput(ElementosOrange.INPUT_EDIT_USER_NAME.getObject)

Util.getInstance().setTextElement(ElementosOrange.INPUT_EDIT_USER_NAME.getObject, 'ramonruiz7')

Util.getInstance().clickElement(ElementosOrange.BUTTON_EDIT_SAVE.getObject)

//Validar que estoy en la pantalla donde vere los resultados de la edicion
WebUI.delay(3)
WebUI.verifyElementPresent(ElementosOrange.DIV_ADMIN_RECORDS_FOUNDS.getObject, 2, FailureHandling.STOP_ON_FAILURE)


