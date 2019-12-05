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
import com.kms.katalon.core.webui.keyword.internal.WebUIAbstractKeyword
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

import com.kms.katalon.core.exception.StepFailedException

WebUI.openBrowser('https://cc-staging.sehati.co/login')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Consultation Center/Login_Screen/field_email'), GlobalVariable.dokterid)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Consultation Center/Login_Screen/field_password'), GlobalVariable.password)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Consultation Center/Login_Screen/button_Masuk'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Beranda (Dokter)/tab_interpreted'), 0)

def namaibu = WebUI.getText(findTestObject('Object Repository/Page_Consultation Center/Beranda (Dokter)/namaibu_onList'))

WebUI.click(findTestObject('Object Repository/Page_Consultation Center/Beranda (Dokter)/namaibu_onList'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/heading_nama'), namaibu)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/tab_anc'), 0)

WebUI.click(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/button_Kirim Interpretasi'))

WebUI.delay(3)

String charsets = ('a'..'z').join()
Integer lengths = 6
String randomStrings = RandomStringUtils.random(lengths, charsets.toCharArray())

WebUI.setText(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/field_interpretasi'), 'interpretasi adalah aman '+randomStrings)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/field_instruksi'), 'instruksi adalah aman '+randomStrings)

WebUI.delay(2)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/dropdown_status'), '10', false)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/button_Kirim hasil interpretasi'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/heading_terimakasihInterpretasi'), 0)

WebUI.click(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/button_Tutupinterpretasi'))

WebUI.closeBrowser()