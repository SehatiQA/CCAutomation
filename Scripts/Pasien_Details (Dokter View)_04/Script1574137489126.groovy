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
import org.xbill.DNS.utils.hexdump
import org.apache.commons.lang.RandomStringUtils as RandomStringUtils
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.testobject.TestObject as Int

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

WebUI.click(findTestObject('Object Repository/Page_Consultation Center/Beranda (Dokter)/namaibu_onList'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/tab_formulirKehamilan'))

WebUI.scrollToElement(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/Formulir Kehamilan/heading_formulirKehamilan'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/Formulir Kehamilan/nilai_tglHPHT'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/Formulir Kehamilan/nilai_HaidCycle'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/Formulir Kehamilan/nilai_estimatedDOB'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/Formulir Kehamilan/nilai_gravida'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/Formulir Kehamilan/nilai_para'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Details Pasien/Formulir Kehamilan/nilai_abortus'), 0)

WebUI.closeBrowser()