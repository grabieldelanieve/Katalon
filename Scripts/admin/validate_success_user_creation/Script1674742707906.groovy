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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


//Imports...
import commons.Util as Util
//Import para los objetos xpath
import constants.Enum.ElementosOrange
// import para los casos de prueba
import constants.TestCasesConstants as TestCase



//Como precondicion para ejecutar mi caso de prueba debe de llamar el caso de prueba Login
WebUI.callTestCase(findTestCase('login/validate_success_user_login'), [:], FailureHandling.STOP_ON_FAILURE)
//WebUI.callTestCase(TestCase.VALIDATE_SUCCESS_USER_LOGIN, [:], FailureHandling.STOP_ON_FAILURE)

//Completando formulario
Util.getInstance().clickElement(ElementosOrange.GLOBAL_MENU_ADMIN.getObject) //Util.getInstance().clickElement(ElementosOrange.GLOBAL_MENU_ADMIN.getObject)

Util.getInstance().clickElement(ElementosOrange.BUTTON_ADMIN_ADD.getObject)

Util.getInstance().clickElement(ElementosOrange.DROPDOWN_USER_ROLE.getObject)

Util.getInstance().clickElement(ElementosOrange.DROPDOWN_USER_ROLE_ADMIN.getObject)

Util.getInstance().clickElement(ElementosOrange.DROPDOWN_USER_STATUS.getObject)

Util.getInstance().clickElement(ElementosOrange.DROPDOWN_USER_STATUS_ENABLED.getObject)

Util.getInstance().setTextElement(ElementosOrange.INPUT_EMPLOYEE_NAME.getObject, "Odis Adalwin") //Odis Adalwin

Util.getInstance().clickElement(ElementosOrange.INPUT_EMPLOYEE_NAME_SELECTED.getObject)

Util.getInstance().setTextElement(ElementosOrange.INPUT_USER_NAME.getObject, 'ramonruiz')

Util.getInstance().setTextElement(ElementosOrange.INPUT_PASSWORD.getObject, 'Delanieve7!')

Util.getInstance().setTextElement(ElementosOrange.INPUT_CONFIRM_PASSWORD.getObject, 'Delanieve7!')

WebUI.scrollToElement(ElementosOrange.BUTTON_EDIT_SAVE.getObject, 1, FailureHandling.STOP_ON_FAILURE)

//Guardando informacion
Util.getInstance().clickElement(ElementosOrange.BUTTON_EDIT_SAVE.getObject)

WebUI.delay(4)

