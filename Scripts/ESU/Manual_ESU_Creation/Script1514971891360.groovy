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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC_DALogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('ESU_Objects/Page_Delivery Automation/a_menu-item-anchor menu-item-e'))

WebUI.mouseOver(findTestObject('ESU_Objects/Page_Delivery Automation/span_Engagement Status Update'))

WebUI.click(findTestObject('ESU_Objects/Page_Delivery Automation/span_Engagement Status Update'))

WebUI.setText(findTestObject('ESU_Objects/Page_Delivery Automation/input_ORGID'), 'SEDGWICK')

WebUI.click(findTestObject('ESU_Objects/Page_Delivery Automation/span_ORGName'))

WebUI.delay(5)

WebUI.setText(findTestObject('ESU_Objects/Page_Delivery Automation/input_ACCID'), 'SEDGWK')

WebUI.click(findTestObject('ESU_Objects/Page_Delivery Automation/Span_AccName'))

WebUI.delay(5)

WebUI.setText(findTestObject('ESU_Objects/Page_Delivery Automation/input_EngID'), 'OPTION 3 DELIVERY')

WebUI.click(findTestObject('ESU_Objects/Page_Delivery Automation/Span_EngName'))

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('ESU_Objects/Page_Delivery Automation/SetSLA'), 5)

WebUI.click(findTestObject('ESU_Objects/Page_Delivery Automation/button_Submit'))

WebUI.click(findTestObject('ESU_Objects/Page_Delivery Automation/div_Adriana Pogoda'))

WebUI.click(findTestObject('ESU_Objects/Page_Delivery Automation/span_Log Out'))

WebUI.closeBrowser()

