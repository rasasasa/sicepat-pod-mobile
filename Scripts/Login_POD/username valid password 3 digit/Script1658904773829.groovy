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

Mobile.startApplication('D:\\Aplikasi Sicepat\\new\\scan priority\\POD Staging 3.3.0.apk', true)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Object Repository/Username'), '21090025', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.setText(findTestObject('Login/Password'), '123', 0)

Mobile.delay(1, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Login/Button_Login'), 0)

Mobile.verifyElementExist(findTestObject('Login/Pop_up_button _tutup_Login_page'), 0)

Mobile.takeScreenshot("D:\\SS katalon\\passwordPolicy.png")

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()