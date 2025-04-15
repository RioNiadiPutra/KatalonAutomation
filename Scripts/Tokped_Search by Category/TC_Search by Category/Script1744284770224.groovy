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

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Tokped_Search by Category/testingg/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/div_Kategori'))

WebUI.scrollToElement(findTestObject('Object Repository/Tokped_Search by Category/testingg/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/a_Kursi Pantai'), 
    0)

WebUI.click(findTestObject('Tokped_Search by Category/testingg/Page_Situs Jual Beli Online Terlengkap, Mud_c2d1e5/a_Kursi Pantai'))

WebUI.scrollToPosition(615, 1250)

//WebUI.scrollToElement(findTestObject('Tokped_Search by Category/asddsa/Page_Kursi Pantai Pilihan Terlengkap  Produk Terbaru - Harga Terbaik  Tokopedia/img_Tambah ke Wishlist_success fade'), 
//    0)
WebUI.click(findTestObject('Tokped_Search by Category/asddsa/Page_Kursi Pantai Pilihan Terlengkap  Produk Terbaru - Harga Terbaik  Tokopedia/img_Tambah ke Wishlist_success fade'))

WebUI.verifyElementVisible(findTestObject('Tokped_Search by Category/Page_Jual Decathlon Quechua Kursi Lipat Camping Armchair Outdoor - Hijau - 8852991 - Jakarta Selatan - Decathlon Indonesia  Tokopedia/p_Detail'))

WebUI.verifyTextPresent('Detail', false)

WebUI.delay(3)

WebUI.closeBrowser()

