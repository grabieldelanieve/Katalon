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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

//Imports...
import commons.Util as Util

//WebUI.openBrowser("")

boolean ticket = null;

//Validar pantalla de admin

//Completando formulario
WebUI.click(findTestObject('Object Repository/main_floating_menu_options/button_menu_admin_option'))

WebUI.click(findTestObject('Object Repository/admin/add_user/button_add'))

//ticket = (WebUI.verifyElementPresent(findTestObject('Object Repository/admin/add_user/h6_agregar_usuario'), 1) == true ) ? true : false;
//
//if(ticket != true) {
//	KeywordUtil.markFailed("Error al intentar ingresar a la pantalla de (Add User)");
//}

WebUI.click(findTestObject('Object Repository/admin/add_user/select_user_role'), FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/admin/add_user/select_option_user_role_admin'))

WebUI.click(findTestObject('Object Repository/admin/add_user/select_user_status'))
WebUI.click(findTestObject('Object Repository/admin/add_user/select_user_status_habilitado_option'))

WebUI.setText(findTestObject('Object Repository/admin/add_user/input_employe_name'), "Paul Collings")
//WebUI.waitForElementPresent(findTestObject('Object Repository/admin/add_user/span_paul _collings_option'), 2)
Util.clickElement(findTestObject('Object Repository/admin/add_user/span_paul _collings_option'))

WebUI.setText(findTestObject('Object Repository/admin/add_user/input_username'), "ramonruiz")
WebUI.setText(findTestObject('Object Repository/admin/add_user/input_password'), "Delanieve7!")
WebUI.setText(findTestObject('Object Repository/admin/add_user/input_confirm_password'), "Delanieve7!")

//Guardando informacion
WebUI.scrollToElement(findTestObject('Object Repository/admin/add_user/button_save'), 1, FailureHandling.STOP_ON_FAILURE)
WebUI.click(findTestObject('Object Repository/admin/add_user/button_save'))


