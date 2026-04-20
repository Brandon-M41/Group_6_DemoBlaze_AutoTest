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

WebUI.navigateToUrl('https://www.demoblaze.com')

WebUI.click(findTestObject('Page_STORE/img_card-img-top img-fluid'))

WebUI.click(findTestObject('Page_STORE/img_img'))

WebUI.click(findTestObject('Page_STORE/h2_Samsung galaxy s6'))

WebUI.click(findTestObject('Page_STORE/h3_360 _includes tax'))

WebUI.click(findTestObject('Page_STORE/div_more-information'))

WebUI.click(findTestObject('Page_STORE/strong_Product description'))

WebUI.click(findTestObject('Page_STORE/p_The Samsung Galaxy S6 is powered by 1.5GHz oct'))

WebUI.click(findTestObject('Page_STORE/div_tbodyid'))

