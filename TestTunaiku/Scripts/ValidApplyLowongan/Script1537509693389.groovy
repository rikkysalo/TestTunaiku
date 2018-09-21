import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test.tunaiku.com/')

WebUI.click(findTestObject('Object Repository/ValidApplyLowongan/Page_Pinjaman Uang Online Tanpa Agu/a_Karir'))

WebUI.click(findTestObject('Object Repository/ValidApplyLowongan/Page_Ayo Berkarier di Tunaiku/button_Lihat Lowongan'))

WebUI.click(findTestObject('Object Repository/ValidApplyLowongan/Page_Ayo Berkarier di Tunaiku/h5_Product Owner - B2C'))

WebUI.click(findTestObject('Object Repository/ValidApplyLowongan/Page_Ayo Berkarier di Tunaiku/button_Lamar Posisi Ini'))

WebUI.switchToWindowTitle('Drop Your Contact')

WebUI.setText(findTestObject('Object Repository/ValidApplyLowongan/Page_Drop Your Contact/input_entry.658631402'), 'RikkySalo')

WebUI.setText(findTestObject('Object Repository/ValidApplyLowongan/Page_Drop Your Contact/input_entry.1253221303'), '081375854763')

WebUI.setText(findTestObject('Object Repository/ValidApplyLowongan/Page_Drop Your Contact/input_entry.1306067785'), 'salo@gmail.com')

WebUI.click(findTestObject('Object Repository/ValidApplyLowongan/Page_Drop Your Contact/div_Jawaban Anda'))

WebUI.setText(findTestObject('Object Repository/ValidApplyLowongan/Page_Drop Your Contact/input_entry.441048626'), 'qwe')

WebUI.click(findTestObject('Object Repository/ValidApplyLowongan/Page_Drop Your Contact/div_Pilih'))

WebUI.setText(findTestObject('Object Repository/ValidApplyLowongan/Page_Drop Your Contact/input_entry.441048626'), 'qwe')

WebUI.click(findTestObject('Object Repository/ValidApplyLowongan/Page_Drop Your Contact/div_Android Engineer'))

WebUI.click(findTestObject('Object Repository/ValidApplyLowongan/Page_Drop Your Contact/span_Kirim'))

WebUI.closeBrowser()

