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

WebUI.click(findTestObject('OPS/Page_Delivery Automation/button_Begin'))

WebUI.click(findTestObject('OPS/Page_Delivery Automation/label_Yellow'))

WebUI.click(findTestObject('OPS/Page_Delivery Automation/label_Yellow'))

WebUI.click(findTestObject('OPS/Page_Delivery Automation/label_Yellow'))

WebUI.setText(findTestObject('OPS/Page_Delivery Automation/textarea_PpyWorkPagepEngagemen'), 'Test Automation script')

WebUI.click(findTestObject('OPS/Page_Delivery Automation/label_Unknown'))

WebUI.selectOptionByValue(findTestObject('OPS/Page_Delivery Automation/select_PpyWorkPagepAESStatus'), 'Pega Cloud', true)

WebUI.click(findTestObject('OPS/Page_Delivery Automation/h3_Engagement profile'))

WebUI.click(findTestObject('OPS/Page_Delivery Automation/label_No'))

WebUI.click(findTestObject('OPS/Page_Delivery Automation/label_Yes'))

WebUI.selectOptionByValue(findTestObject('OPS/Page_Delivery Automation/select_PpyWorkPagepEngagementp'), 'RLS-1832', true)

WebUI.click(findTestObject('OPS/Page_Delivery Automation/h3_Weekly Health Status'))

WebUI.click(findTestObject('OPS/Page_Delivery Automation/h3_Engagement profile'))

WebUI.selectOptionByValue(findTestObject('OPS/Page_Delivery Automation/select_PpyWorkPagepEngagementp (1)'), 'Scrum', true)

WebUI.selectOptionByValue(findTestObject('OPS/Page_Delivery Automation/select_PpyWorkPagepEngagementp (2)'), 'Completed', 
    true)

WebUI.selectOptionByValue(findTestObject('OPS/Page_Delivery Automation/select_PpyWorkPagepEngagementp'), 'RLS-1071', true)

WebUI.selectOptionByValue(findTestObject('OPS/Page_Delivery Automation/select_PpyWorkPagepEngagementp (3)'), 'HEALTHCARE', 
    true)

WebUI.selectOptionByValue(findTestObject('OPS/Page_Delivery Automation/select_PpyWorkPagepEngagementp (4)'), 'Full Implementation Lifecycle', 
    true)

WebUI.click(findTestObject('OPS/Page_Delivery Automation/div_content-item content-layou'))

WebUI.setText(findTestObject('OPS/Page_Delivery Automation/input_PpyWorkPagepEngagementpE'), '34')

WebUI.click(findTestObject('OPS/Page_Delivery Automation/div_content-item content-layou'))

WebUI.click(findTestObject('OPS/Page_Delivery Automation/button_Approve and Submit'))

WebUI.closeBrowser()

