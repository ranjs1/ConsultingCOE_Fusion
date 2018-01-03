package com.helper.commonfunct
import org.junit.After
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.StaleElementReferenceException

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
import org.openqa.selenium.WebElement
import internal.GlobalVariable as GlobalVariable
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.testobject.ConditionType
import org.openqa.selenium.WebDriver as WebDriver
import WebElement as WebElement
import java.text.SimpleDateFormat

CustomKeywords.'com.helper.commonfunct.utilities.login'(GlobalVariable.URL, GlobalVariable.OPS, GlobalVariable.pwd)

WebUI.click(findTestObject('Generic/a_Actions'))

WebUI.focus(findTestObject('span_New'))

WebUI.click(findTestObject('span_Bid Process'))

WebUI.switchToFrame(findTestObject('FRAME1'), 30)

WebUI.click(findTestObject('ECR/BID_TYPE'))

WebUI.verifyElementPresent(findTestObject('Object Repository/button_Import'), 2)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/button_Import'))

WebUI.uploadFile('Object Repository/input_PpyWorkPageppyFilePath', 'C:\\ECR_LITE_EXPSVC.xlsm')

WebUI.scrollToElement(findTestObject('Object Repository/button_Submit'), 0)

WebUI.click(findTestObject('Object Repository/button_Submit'))

WebUI.waitForElementVisible(findTestObject('EngInfo/COID'), 3)

WebUI.delay(5)

WebUI.delay(5)

WebUI.setText(findTestObject('Generic/ORG'), 'BOFA')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Generic/ORG'), Keys.chord(Keys.TAB))

WebUI.delay(5)

WebUI.setText(findTestObject('Generic/ACC'), 'BOFA')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Generic/ACC'), Keys.chord(Keys.TAB))

WebUI.delay(5)

WebUI.setText(findTestObject('Generic/ENG_DESC'), 'AUTOTEST1')

WebUI.delay(5)

WebUI.scrollToElement(findTestObject('Generic/SUBMIT'), 0)

WebUI.click(findTestObject('Generic/SUBMIT'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/EngInfo/COID'), 'CO-12')

WebUI.delay(7)

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Generic/gapDrivenMethodology'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Generic/RapidDelivery'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Generic/MorethanOneRLS'))

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/ECR/Licence'), '85000')

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Generic/ACC'), Keys.chord(Keys.TAB))

WebUI.waitForElementVisible(findTestObject('Object Repository/Generic/platform'), 10)

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID', 'AMPchroma'))

WebUI.delay(5)

WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion', 'N/A', 'sendKeys'))

WebUI.scrollToElement(findTestObject('NEXT_BUTTON'), 2)

WebUI.click(findTestObject('NEXT_BUTTON'))

WebUI.delay(7)

WebElement element = WebUI.getAttribute(findTestObject('Object Repository/ECR/siinginfo/endDate'))

String elementval = element.getAttribute('value')

