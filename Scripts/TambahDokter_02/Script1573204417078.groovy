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

WebUI.setText(findTestObject('Page_Consultation Center/Login_Screen/field_email'), 'rudiadmin@mailinator.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Page_Consultation Center/Login_Screen/field_password'), 'qwerty')

WebUI.delay(2)

WebUI.click(findTestObject('Page_Consultation Center/Login_Screen/button_Masuk'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Consultation Center/beranda(dokter)/button_buatdokter'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/title_buatdokterbaru'), 0)

WebUI.click(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/dropdown_jenisdokter'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/dropdown_jenisdokter'), 'doctor', false)

String charset = ('a'..'z').join()
Integer length = 6
String randomString = RandomStringUtils.random(length, charset.toCharArray())

WebUI.setText(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/field_namadokter'), 'dr. auto ' + randomString)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/field_emaildokter'), randomString + '@mailinator.com')

WebUI.delay(2)

String charsets = ('1'..'9').join()
Integer lengths = 9
String randomStrings = RandomStringUtils.random(lengths, charsets.toCharArray())

WebUI.setText(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/field_nohpdokter'), '081' + randomStrings)

WebUI.scrollToElement(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/radio_perempuan'), 0)

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/radio_perempuan'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/field_namakonsulen'), 'konsulen ' + randomString)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/field_password'), 'qwerty')

WebUI.click(findTestObject('Object Repository/Page_Consultation Center/Tambah Dokter/button_Simpan'))

WebUI.delay(6)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Consultation Center/beranda(dokter)/button_buatdokter'), 0)

WebUI.closeBrowser()