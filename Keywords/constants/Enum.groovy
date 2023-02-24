package constants

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class Enum {

	private static TestObject to;

	public enum ElementosOrange {
		BUTTON_EDIT_SAVE("//button[(contains(@class, 'orangehrm')) and contains(., 'Save')]"),
		BUTTON_EDIT_EDIT("(//button[contains(@class,'oxd-icon-button oxd-table-cell-action-space')])[2]"),
		BUTTON_TABLE_DELETE("(//button[contains(@class,'oxd-icon-button oxd-table-cell-action-space')])[1]"),
		BUTTON_DELETE_DELETE("//button[contains(@class,'oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin')]"),
		BUTTON_ADMIN_SEARCH("//*[@type='submit'][contains(.,'Search')]"),
		INPUT_ADMIN_SEARCH("//div[@id='app']/div/div[2]/div[2]/div/div/div[2]/form/div/div/div/div/div[2]/input[@class='oxd-input oxd-input--active']"),
		DIV_ADMIN_RECORDS_FOUNDS('//span[@class="oxd-text oxd-text--span"][contains(.,"Records Found")]'),
		// Creation elements
		GLOBAL_MENU_ADMIN("//div[@id='app']/div/div/aside/nav/div[2]/ul/li/a/span"),
		BUTTON_ADMIN_ADD("//div[@id='app']/div/div[2]/div[2]/div/div[2]/div/button"),
		DROPDOWN_USER_ROLE("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div/div/div[2]/div/div/div[2]/i"),
		DROPDOWN_USER_ROLE_ADMIN("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div/div/div[2]/div/div[2]/div[2]"),
		DROPDOWN_USER_STATUS("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div[3]/div/div[2]/div/div/div[2]/i"),
		DROPDOWN_USER_STATUS_ENABLED("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div[3]/div/div[2]/div/div[2]/div[2]"),
		INPUT_EMPLOYEE_NAME("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div[2]/div/div[2]/div/div/input"),
		INPUT_EMPLOYEE_NAME_SELECTED("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div[2]/div/div[2]/div/div[2]/div/span"),
		INPUT_USER_NAME("//div[@id='app']/div/div[2]/div[2]/div/div/form/div/div/div[4]/div/div[2]/input"),
		INPUT_PASSWORD("//input[@type='password']"),
		INPUT_CONFIRM_PASSWORD("(//input[@type='password'])[2]"),
		// Edit elements
		INPUT_EDIT_USER_NAME("//*[@id='app']/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
		;


		// Declarando variable "xpath" de tipo texto
		private String xpath;
		// Declarando la variable "getObject" de tipo "TestObject" donde podremos acceder a obtener el objeto creado con el xpath como valor
		public TestObject getObject;


		//Este sera el metodo utilizado para crear el objeto y pasarle el xpath al mismo a utilzar, el mismo recibe un Strin que seria el xpath real.
		public TestObject crearObjeto (String str) {
			//Creando nueva instancia de la clase TestObject (Creando el objeto) y almacenando en la variable "to"
			to = new TestObject();
			//Agregandole al objeto un atributo de tipo xpath con el valor del xpath
			to.addProperty("xpath", ConditionType.EQUALS, str)

			//Retornando el objeto ya con el xpath dentro
			return to;
		}
		// Constructor
		public ElementosOrange (String str) {
			xpath = str;
			// Inicializando la variable getObject con el valor Objeto que contiene nuestra ruta de xpath
			getObject = crearObjeto(str)
		}
	}

}
