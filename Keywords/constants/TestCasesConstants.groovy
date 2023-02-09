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
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class TestCasesConstants {

	/** LOGIN **/
	static final VALIDATE_SUCCESS_USER_LOGIN								= findTestCase('login/validate_success_user_login')

	/** ADMIN **/
	static final VALIDATE_SUCCESS_USER_CREATION    							= findTestCase('admin/validate_success_user_creation')
	static final VALIDATE_SUCCESS_USER_EDIT 								= findTestCase('admin/validate_success_user_edit')
	static final VALIDATE_SUCCESS_USER_DELETE								= findTestCase('admin/validate_success_user_delete')
	static final VALIDATE_SUCCESS_USER_SEARCH								= findTestCase('admin/validate_success_user_search')
}
