import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
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
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.startApplication('D:\\Aplikasi Sicepat\\new\\app-staging-pod-1100.apk', false)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar Antar/Menu daftar antar'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\SS katalon\\Daftar Antar.png')

Mobile.tap(findTestObject('Daftar Antar/Nomor Resi'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(40, 1200, 590, 1279)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.doubleTap(findTestObject('Daftar Antar/POD BERHASIL'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar Antar/Pilih Status Penerima'), 0)

Mobile.tap(findTestObject('Daftar Antar/Status penerima (KEL) Keluarga Serumah'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Daftar Antar/Nama Penerima'), 'Riyan', 0)

Mobile.scrollToText('TTD', FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Daftar Antar/Catatan'), 'Automation Mobile', 0)

Mobile.tap(findTestObject('Daftar Antar/Tombol TTD'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.swipe(130, 633, 548, 642)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar Antar/SIMPAN TTD'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar Antar/FOTO'), 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Daftar Antar/AMBIL GAMBAR'), 0)

Mobile.tap(findTestObject('Daftar Antar/SIMPAN foto'), 0)

Mobile.tap(findTestObject('Daftar Antar/SELESAI'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.tap(findTestObject('Riwayat POD/Menu Riwayat POD'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Riwayat POD/No resi'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\SS katalon\\Detail DLV.png')

Mobile.tap(findTestObject('Riwayat POD/Lihat Foto'), 0)

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.takeScreenshot('D:\\SS katalon\\Fotot penerima.png')

Mobile.verifyElementExist(findTestObject('Riwayat POD/foto penerima'), 0)

Mobile.closeApplication()

