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

WebUI.click(findTestObject('Object Repository/MitraTunaiku/Page_Pinjaman Uang Online Tanpa Agu/a_Kontak'))

WebUI.selectOptionByValue(findTestObject('Object Repository/MitraTunaiku/Page_Hubungi Kami  Tunaiku/select_Kirim pesan mengenai...'), 
    '3', true)

WebUI.setText(findTestObject('Object Repository/MitraTunaiku/Page_Hubungi Kami  Tunaiku/input_form-control'), 'sa@gmail.com')

WebUI.setText(findTestObject('Object Repository/MitraTunaiku/Page_Hubungi Kami  Tunaiku/textarea_form-control'), 'test')

WebUI.click(findTestObject('Object Repository/MitraTunaiku/Page_Hubungi Kami  Tunaiku/button_Kirim Pesan'))

WebUI.closeBrowser()

