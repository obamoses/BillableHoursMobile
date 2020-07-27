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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('C:\\Users\\MOba\\Katalon Studio\\BillingHours\\fileAPK\\Copy of app-armeabi-v7a-release.apk', true)

Mobile.tap(findTestObject('FileUpload_OR/android.view.View0 - Billable Hours'), 0)

Mobile.verifyElementExist(findTestObject('FileUpload_OR/android.view.View0 - Enter the file path below'), 0)

//WebUI.uploadFile(findTestObject('FileUpload_OR/android.view.View0 - Enter the file path below'), 'C:\\Users\\MOba\\Katalon Studio\\BillableHours_Mobile\\TestFile\\test')
Mobile.tap(findTestObject('FileUpload_OR/android.widget.EditText0'), 0)

Mobile.verifyElementExist(findTestObject('FileUpload_OR/android.view.View0 - Continue'), 0)

Mobile.sendKeys(findTestObject('FileUpload_OR/android.widget.EditText0 (1)'), 'C:\\\\Users\\\\MOba\\\\Katalon Studio\\\\BillableHours_Mobile\\\\TestFile\\\\test')

Mobile.tap(findTestObject('FileUpload_OR/android.view.View0 - Continue'), 0)

Mobile.closeApplication()

