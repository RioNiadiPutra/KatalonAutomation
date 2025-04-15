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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.tokopedia.com/')

//WebUI.click(findTestObject('Object Repository/Tokped_Daftar/Daftar_Positif/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/svg'))
WebUI.click(findTestObject('Object Repository/Tokped_Daftar/Daftar_Positif/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/button_Daftar'))

TestObject inputField = findTestObject('Object Repository/Tokped_Daftar/Daftar_Positif/Page_Daftar  Tokopedia/input_Nomor HP atau E-mail_register')

String inputText = 'qatesting@gmail.com'

int delayMs = 200

for (int i = 0; i < inputText.length(); i++) {
    WebUI.sendKeys(inputField, inputText.charAt(i).toString())

    WebUI.delay(delayMs / 1000)
}

WebUI.click(findTestObject('Object Repository/Tokped_Daftar/Daftar_Positif/Page_Daftar  Tokopedia/span_Daftar'))

WebUI.click(findTestObject('Object Repository/Tokped_Daftar/Daftar_Positif/Page_Daftar  Tokopedia/span_Ya, Benar'))

WebUI.waitForElementVisible(findTestObject('Tokped_Daftar/Daftar_Positif/Page_Daftar  Tokopedia/div_E-mail ke qatestinggmail.com'), 
    300)

WebUI.click(findTestObject('Object Repository/Tokped_Daftar/Daftar_Positif/Page_Daftar  Tokopedia/div_E-mail ke qatestinggmail.com'))

WebUI.delay(5)

WebUI.closeBrowser()

