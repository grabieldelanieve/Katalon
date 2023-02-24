import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.openqa.selenium.Keys as Keys
//Imports utilizados y necesarios 
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import commons.Util as Util
import commons.Util
// Abriendo el navegador...
WebUI.openBrowser('')

// Redireccionando hacia la URL en cuestion, tomando nuestra URL desde nuestro perfil o variable global (QA)
//URL: https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
WebUI.navigateToUrl(GlobalVariable.URL)

// Maximizando ventana del navegador
WebUI.maximizeWindow()

//Validando que estamos en la pantalla correcto
if (WebUI.verifyElementPresent(findTestObject('Object Repository/login/label_login_screen'), 1, FailureHandling.STOP_ON_FAILURE)) {
    //Capturando pantalla 
    WebUI.takeScreenshot()

    //Validando que el objeto de prueba (Input User Name) esta en pantalla
    if (WebUI.verifyElementPresent(findTestObject('Object Repository/login/input_username_login_screen'), 1, FailureHandling.STOP_ON_FAILURE)) {
        //Ingresando texto al input User Name
        Util.getInstance().setTextElement(findTestObject('Object Repository/login/input_username_login_screen'), GlobalVariable.Username)

        WebUI.takeScreenshot()

        //Validando que el objeto de prueba (Input password) esta en pantalla
        if (WebUI.verifyElementPresent(findTestObject('Object Repository/login/input_password_login_screen'), 1, FailureHandling.STOP_ON_FAILURE)) {
            //Ingresando texto al input Password
            //            WebUI.setText(findTestObject('Object Repository/login/input_password_login_screen'), GlobalVariable.Password)
            Util.getInstance().setTextElement(findTestObject('Object Repository/login/input_password_login_screen'), GlobalVariable.Password)

            WebUI.takeScreenshot()

            //Validando que el objeto de prueba (Boton login) esta en pantalla
            if (WebUI.verifyElementPresent(findTestObject('Object Repository/login/button_login'), 1, FailureHandling.STOP_ON_FAILURE)) {
                WebUI.takeScreenshot()

                //Haciendo evento de clic en el objeto de prueba (Boton login)
                Util.getInstance().clickElement(findTestObject('Object Repository/login/button_login'))

                //Validando que estamos en la siguiente pantalla (Dashboard), verificando con un objeto de la misma
                if (WebUI.verifyElementPresent(findTestObject('Object Repository/dashboard/label_dashboard_screen'), 1, 
                    FailureHandling.STOP_ON_FAILURE)) {
                    WebUI.takeScreenshot()

                    //Marcando que el caso de prueba concluyo de manera exitosa
                    KeywordUtil.markPassed('Result as expected!!') //Calling the new test case
                        

                    // Llamada a caso de prueba agregar usuario. NOTA: deberia ser uno generico del dashboard, para usarlo genericamente.
//                    WebUI.callTestCase(findTestCase('admin/validate_success_user_creation'), [:], FailureHandling.STOP_ON_FAILURE)
//					WebUI.delay(4)
//                    WebUI.callTestCase(findTestCase('admin/validate_success_user_edit'), [:], FailureHandling.STOP_ON_FAILURE)
//					WebUI.delay(4)
//                    WebUI.callTestCase(findTestCase('admin/validate_success_user_delete'), [:], FailureHandling.STOP_ON_FAILURE) 
//					WebUI.delay(4)
                } //Marcando que el caso de prueba como error
                else {
                    KeywordUtil.markError('No pudo ingresar a la pantalla del (Dashboard)')
                }
            } //Marcando que el caso de prueba como error
            else {
                KeywordUtil.markError('El elemento del DOM HTML (Boton login) no esta en pantalla')
            }
        } //Marcando que el caso de prueba como error
        else {
            KeywordUtil.markError('El elemento del DOM HTML (Input Password) no esta en pantalla')
        }
    } //Marcando que el caso de prueba como error
    else {
        KeywordUtil.markError('El elemento del DOM HTML (Input User name) no esta en pantalla')
    }
} else {
    KeywordUtil.markError('El elemento del DOM HTML (Login) no esta en pantalla')
}

// Cerrando navegador
//WebUI.closeBrowser()



