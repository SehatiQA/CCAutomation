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
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils

WebUI.openBrowser('https://cc-staging.sehati.co/admin')

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Consultation Center/Login_Screen/field_email'), GlobalVariable.adminid)

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Consultation Center/Login_Screen/field_password'), GlobalVariable.password)

WebUI.delay(2)

WebUI.click(findTestObject('Page_Consultation Center/Login_Screen/button_Masuk'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Page_Consultation Center/Beranda (Admin)/button_buatdokter'), 0)

WebUI.scrollToElement(findTestObject('Page_Consultation Center/Beranda (Admin)/link_privacyPolicy'), 0)

WebUI.click(findTestObject('Page_Consultation Center/Beranda (Admin)/link_tnc'))

WebUI.delay(3)

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Login_Screen/heading_tnc'), 0)

WebUI.closeBrowser()