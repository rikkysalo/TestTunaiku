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

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pinjaman Uang Online Tanpa Agu/mat-slider_8000000'))

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pinjaman Uang Online Tanpa Agu/div_mat-slider-thumb'))

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pinjaman Uang Online Tanpa Agu/button_Ajukan Pinjaman'))

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pinjaman Uang Online Tanpa Agu/button_BELUM PERNAH'))

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pinjaman Uang Online Tanpa Agu/input_name'), 
    'Rikky Salo')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pinjaman Uang Online Tanpa Agu/input_mobilePhoneNumber'), 
    '81375844653')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pinjaman Uang Online Tanpa Agu/input_emailAddress'), 
    'salo0206@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pinjaman Uang Online Tanpa Agu/select_Pilih salah satu'), 
    'HousingLoan', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pinjaman Uang Online Tanpa Agu/select_Pilih salah satu       _1'), 
    'Internet', true)

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pinjaman Uang Online Tanpa Agu/button_Lanjut Isi Formulir Pen'))

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Data Pribadi - Form Aplikasi P/input_pin'), '8323123123912312')

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Data Pribadi - Form Aplikasi P/select_Pilih salah satu   AGRI'), 
    'AGRIS', true)

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Data Pribadi - Form Aplikasi P/input_bankAccount'), 
    '123412')

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Data Pribadi - Form Aplikasi P/select_Pilih salah satu   SD'), 
    'BachelorDegree', true)

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Data Pribadi - Form Aplikasi P/button_Ya'))

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Data Pribadi - Form Aplikasi P/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Identitas Sesuai KTP - Form Ap/select_Pilih Salah Satu   ACEH'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Identitas Sesuai KTP - Form Ap/select_Pilih Salah Satu   KAB.'), 
    '138', true)

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Identitas Sesuai KTP - Form Ap/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/input_domicileAddress_street'), 
    'sd')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/input_domicileAddress_bldNumbe'), 
    '0')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/input_domicileAddress_flatNumb'), 
    '0')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/input_domicileAddress_rt'), 
    '12')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/input_domicileAddress_rw'), 
    '12')

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   ACEH'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   KAB.'), 
    '145', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   BINT'), 
    '929', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   BINT_1'), 
    '11849', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   Isla'), 
    'Christian', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/select_Pilih Salah Satu   WNI'), 
    'Indonesian', true)

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Alamat Sesuai KTP - Form Aplik/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Tempat Tinggal - Form A/select_Pilih Salah Satu   Apar'), 
    'Apartment', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Tempat Tinggal - Form A/select_Pilih Salah Satu   Kelu'), 
    'BoardingHouse', true)

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Tempat Tinggal - Form A/input_housing_monthlyCost'), 
    '1234123123')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Tempat Tinggal - Form A/input_housing_expenseCost'), 
    '123123')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Tempat Tinggal - Form A/input_dependants'), 
    '2')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Tempat Tinggal - Form A/input_mothersName'), 
    'Resmi')

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Tempat Tinggal - Form A/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Domisli Tempat Tinggal - Form/input_contactAddress_street'), 
    'Jakarta')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Domisli Tempat Tinggal - Form/input_contactAddress_bldNumber'), 
    '0')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Domisli Tempat Tinggal - Form/input_contactAddress_flatNumbe'), 
    '0')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Domisli Tempat Tinggal - Form/input_contactAddress_rt'), 
    '12')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Domisli Tempat Tinggal - Form/input_contactAddress_rw'), 
    '12')

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Domisli Tempat Tinggal - Form/select_Pilih Salah Satu   ACEH'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Domisli Tempat Tinggal - Form/select_Pilih Salah Satu   KAB.'), 
    '520', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Domisli Tempat Tinggal - Form/select_Pilih Salah Satu   BENG'), 
    '4874', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Domisli Tempat Tinggal - Form/select_Pilih Salah Satu   BALA'), 
    '59784', true)

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Domisli Tempat Tinggal - Form/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pekerjaan - Form Aplikasi Pinj/select_Pilih Salah Satu   PNS'), 
    'PublicServant', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pekerjaan - Form Aplikasi Pinj/select_Pilih Salah Satu   Perm'), 
    'Contract', true)

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pekerjaan - Form Aplikasi Pinj/input_income_employerName'), 
    'test')

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pekerjaan - Form Aplikasi Pinj/select_Pilih Salah Satu   Kont'), 
    'Contract', true)

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pekerjaan - Form Aplikasi Pinj/input_income_monthlyIncome'), 
    '32423432')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pekerjaan - Form Aplikasi Pinj/input_income_previousIncome'), 
    '234324234')

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Pekerjaan - Form Aplikasi Pinj/button_Selanjutnya'))

WebUI.selectOptionByValue(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Pernikahan - Form Aplik/select_Pilih Salah Satu   Belu'), 
    'Married', true)

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Pernikahan - Form Aplik/input_spouse_pin'), 
    '2341231231212333')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Pernikahan - Form Aplik/input_spouse_name'), 
    'Gita')

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Pernikahan - Form Aplik/button_Tidak Campur'))

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Status Pernikahan - Form Aplik/button_Selanjutnya'))

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Data Kerabat - Form Aplikasi P/input_personalReference_name'), 
    'Amos')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Data Kerabat - Form Aplikasi P/input_personalReference_mobile'), 
    '8136573234')

WebUI.setText(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Data Kerabat - Form Aplikasi P/input_personalReference_addres'), 
    'Jakarta')

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Data Kerabat - Form Aplikasi P/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Cek Ulang Data - Form Aplikasi/input_agreedForm'))

WebUI.click(findTestObject('Object Repository/ValidAjukanPeminjaman/Page_Cek Ulang Data - Form Aplikasi/button_Kirim Formulir'))

WebUI.closeBrowser()

