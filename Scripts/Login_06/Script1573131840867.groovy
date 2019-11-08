import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://cc-staging.sehati.co/login')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Consultation Center/Login_Screen/field_email'), 'rudiadmin@mailinator.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Consultation Center/Login_Screen/field_password'), 'qwerty')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Consultation Center/Login_Screen/button_Masuk'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Login_Screen/error_tidakdapatmenemukanpengguna'), 0)

WebUI.closeBrowser()