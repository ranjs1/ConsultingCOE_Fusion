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
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.sun.org.apache.xalan.internal.xsltc.compiler.Number
import org.apache.commons.lang.RandomStringUtils


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
import java.text.NumberFormat
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.InputStream;
import java.util.Iterator;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;




public class commonutilities
{
	
@Keyword
def login(String URL, String username, String pwd)
		{
		WebUI.openBrowser('')
		WebUI.navigateToUrl(URL)
		WebUI.setText(findTestObject('Generic/input_UserIdentifier'), username)
		WebUI.setText(findTestObject('Generic/input_Password'), pwd)
		WebUI.sendKeys(findTestObject('Generic/input_Password'), Keys.chord(Keys.ENTER))
		}
		
@Keyword		
def Import(String Filelocation)

		{
		WebUI.verifyElementPresent(findTestObject('Generic/button_Import'),2)
		WebUI.delay(5)
		WebUI.click(findTestObject('Generic/button_Import'))
		WebUI.uploadFile(findTestObject('Generic/FilePath'), Filelocation)
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/button_Submit'), 0)
		WebUI.click(findTestObject('Generic/button_Submit'))
		WebUI.waitForElementVisible(findTestObject('EngInfo/COID'), 3)
		WebUI.delay(5)
		}
		
		
@Keyword
def logoff()
		{
		WebUI.click(findTestObject('Object Repository/operator1'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Generic/logoffbutton'))
		}
@Keyword
def woid()
		{
		GlobalVariable.WOID=WebUI.getText(findTestObject('Generic/WO'))
		print(GlobalVariable.WOID)
		}
	
@Keyword
def WOstatus()
		{
			WebUI.click(findTestObject('Object Repository/Generic/viewAll'))
			WebUI.delay(5)
			GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('Generic/AssignmentStatus'), 10)
			println GlobalVariable.AssignmentList.size()
			GlobalVariable.WOSTATUS=WebUI.getText(findTestObject('Object Repository/ECR/WOSTATUS'))
			print(GlobalVariable.WOSTATUS)
		
		}
		
		
@Keyword
def closeWO()
		{
		WebUI.click(findTestObject('Object Repository/Generic/CLOSE_WORK_OBJECT'))
		}
		
@Keyword
def search()
		{
		WebUI.maximizeWindow()
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/EngInfo/search'), GlobalVariable.WOID)
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/search'), Keys.chord(Keys.ENTER))
		WebUI.delay(5)
		println GlobalVariable.WOID
		}
		
@Keyword
def approve()
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/link_assignment'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		}
		
		
@Keyword
		
		
def EXPReview(){
	WebUI.delay(5)
	WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
	WebUI.click(findTestObject('Object Repository/Approve-Reject/Reviewquote'))
	WebUI.delay(5)
	WebUI.scrollToElement(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'),0)
	WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
	WebUI.delay(5)
	WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
	WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
	WebUI.delay(5)
			
		}
@Keyword
def gsopsApprove(){
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('Object Repository/Approve-Reject/link_assignment'), 1)
		println GlobalVariable.AssignmentList.size()
		if(GlobalVariable.AssignmentList.size()>1)
		{
		GlobalVariable.AssignmentList[1].click()
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		}
		else {
		GlobalVariable.AssignmentList[0].click()
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		}
		}
		
		
	
@Keyword
	def gsopsReject(){
		
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('Object Repository/Approve-Reject/link_assignment'), 1)
		println GlobalVariable.AssignmentList.size()
		if(GlobalVariable.AssignmentList.size() == 2)
		{
		GlobalVariable.AssignmentList[1].click()
		}
		
		else
		{
		GlobalVariable.AssignmentList[0].click()
		}
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/ReturnToRequestor'),0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/ReturnToRequestor'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		if (GlobalVariable.Meeting==true)
		{
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
		WebUI.delay(5)
		WebUI.click(findTestObject('EngInfo/Continue'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/BSW_TEXT'), 'testing')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/ESTIMATE_TEXT'), 'testing')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/OTHER_TEXT'), 'testing')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/PRIAGE_TEXT'), 'testing')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/SIZING_TEXT'), 'testing')
		WebUI.delay(5)
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		}
		else  
		{
		println "no meeting"
		
		WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
		WebUI.delay(5)
		}
		
		woid()
		WOstatus()
	}
			
@Keyword
def reject()
			{
				WebUI.delay(5)
				WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
				WebUI.click(findTestObject('Object Repository/Approve-Reject/link_assignment'))
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/ReturnToRequestor'),0)
				WebUI.click(findTestObject('Object Repository/Approve-Reject/ReturnToRequestor'))
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
				WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
				WebUI.delay(5)
			}

	
@Keyword
def attachDocs(){
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/Approve-Reject/attachdoc'))
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/BSW_TEXT'), 'testing')
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/ESTIMATE_TEXT'), 'testing')
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/OTHER_TEXT'), 'testing')
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/PRIAGE_TEXT'), 'testing')
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/SIZING_TEXT'), 'testing')
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
			WebUI.delay(5)
			WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
			WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
			WebUI.delay(5)
			GlobalVariable.Meeting=1
			
			}
		
			

@Keyword
def ContractDisposition()
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/contractlink'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/cretaeContract'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/Approve-Reject/contractNotes'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(4)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/dispositionLink'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/dispositionOption'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/Approve-Reject/disposition_comments'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		}

@Keyword

def routeToRL()
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/link_assignment'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		if (GlobalVariable.Meeting==false)
		{
		WebUI.click(findTestObject('Object Repository/Approve-Reject/routetoRL'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(4)
		}
		else {
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		}
		}


@Keyword

def noRL()
		{
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/link_assignment'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/routetoRLNO'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(4)
		}

@Keyword
		
def RDApprove_Meeting()
				{
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/link_assignment'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'),0)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/APPROVE_BUTTON'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(4)
		}
				
		
		
@Keyword
def CreateECR(String Filelocation, String ORG, String ACC,String PL, String RD, String RL, String PLTL, String TestCaseNo)
		{
		WebUI.click(findTestObject('Generic/a_Actions'))
		WebUI.focus(findTestObject('Generic/span_New'))
		WebUI.click(findTestObject('Generic/span_Bid Process'))
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 30)
		WebUI.click(findTestObject('ECR/BID_TYPE'))
		Import(Filelocation)
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ORG'), ORG)
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Generic/ORG'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ACC'), ACC)
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
		WebUI.waitForElementVisible(findTestObject('Object Repository/Generic/platform'), 10)
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID'),'AMPchroma')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion'),'N/A')
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Generic/PlatformTrue'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PL'),PL)
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PLTL'),PLTL)
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/RL'),RL)
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/RD'),RD)
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'),2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.waitForPageLoad(3)
		WebUI.delay(7)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'),2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(7)
		WebUI.waitForPageLoad(3)
		WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'),2)
		WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
		WebUI.waitForPageLoad(3)
		WebUI.delay(5)
		woid()
		println GlobalVariable.Status
		println GlobalVariable.WOID
		WOstatus()
		}
		
		
		
		
		@Keyword
		
		def createECRcopy(String Filelocation)
				{
				WebUI.click(findTestObject('Generic/a_Actions'))
				WebUI.focus(findTestObject('Generic/span_New'))
				WebUI.click(findTestObject('Generic/span_Bid Process'))
				WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 30)
				WebUI.click(findTestObject('ECR/BID_TYPE'))
				Import(Filelocation)
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
				WebUI.waitForElementVisible(findTestObject('Object Repository/Generic/platform'), 10)
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID'),'AMPchroma')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion'),'N/A')
				WebUI.delay(5)
				WebUI.click(findTestObject('Object Repository/Generic/PlatformTrue'))
				WebUI.delay(5)
				
				WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'),2)
				WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
				WebUI.delay(7)
				
				WebUI.waitForPageLoad(3)
				
				WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'),2)
				WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
				WebUI.delay(7)
				WebUI.waitForPageLoad(3)
				
				WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'),2)
				WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
				WebUI.delay(7)
				WebUI.waitForPageLoad(3)
				WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'),2)
				WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
				WebUI.waitForPageLoad(3)
				WebUI.delay(5)
				woid()
				println GlobalVariable.Status
				println GlobalVariable.WOID
				WOstatus()
				}
		
		
		
		
		
	@Keyword
	def static String MeetingDT()
	
	{
		def MeetingDate = new Date()
		MeetingDate=MeetingDate+2
		return  MeetingDate.format("MM/dd/YYYY")
	
	}
		
@Keyword
		
def 	ECRMeeting(
		String Filelocation,
		String ORG,
		String ACC,
		String PL,
		String PLTL,
		String RD,
		String RL)		
			{		
			WebUI.click(findTestObject('Generic/a_Actions'))
			WebUI.focus(findTestObject('Generic/span_New'))
			WebUI.click(findTestObject('Generic/span_Bid Process'))
			WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 30)
			WebUI.click(findTestObject('ECR/BID_TYPE'))
			Import(Filelocation)
			WebUI.delay(5)
			
			/*Identify Engagement*/
			WebUI.setText(findTestObject('Generic/ORG'), ORG)
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Generic/ORG'), Keys.chord(Keys.TAB))
			WebUI.delay(5)
			WebUI.setText(findTestObject('Generic/ACC'), ACC)
			WebUI.sendKeys(findTestObject('Generic/ACC'), Keys.chord(Keys.TAB))
			WebUI.delay(5)
			WebUI.setText(findTestObject('Generic/ENG_DESC'), 'AUTOTEST1')
			WebUI.delay(5)
			WebUI.scrollToElement(findTestObject('Generic/SUBMIT'), 2)
			WebUI.click(findTestObject('Generic/SUBMIT'))
			WebUI.waitForPageLoad(3)
			WebUI.delay(5)
			WebUI.setText(findTestObject('EngInfo/COID'), 'CO-123')
			WebUI.waitForPageLoad(5)
			
			
			/*Identify Service Team */
			WebUI.delay(5)
			
			WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PL'),PL)
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PLTL'),PLTL)
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Object Repository/EngInfo/RL'),RL)
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Object Repository/EngInfo/RD'),RD)
			WebUI.delay(5)
			
			
			/*Identify Licene */
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/Generic/MorethanOneRLS'))
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/Generic/RapidDelivery'))
			WebUI.delay(5)
			WebUI.click(findTestObject('Generic/methodology'))
			WebUI.delay(5)
			WebUI.setText(findTestObject('Object Repository/ECR/Licence'), '85000')
			WebUI.delay(5)
			staleElement('Object Repository/Generic/PlatformID','AMPchroma','sendKeys')
			WebUI.delay(5)
			staleElement('Object Repository/Generic/PlatformVersion','N/A','sendKeys' )
			WebUI.delay(5)
			
			/*Identify Product Details  */
		
			//WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID'),'AMPchroma')
			//WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion'),'N/A')
			
			/*WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID'), 'AMPchroma')
			WebUI.delay(5)
			WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion'), 'N/A')
			WebUI.delay(5)*/
			WebUI.click(findTestObject('Object Repository/Generic/PlatformTrue'))
			WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
			WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
			WebUI.delay(5)
						
			/*Clinic Details  */
			
			WebUI.setText(findTestObject('EngInfo/MeetingDate'), MeetingDT())
			WebUI.delay(5)
			WebUI.setText(findTestObject('EngInfo/instruction'), 'TEsting')
			WebUI.delay(5)
			staleElement('EngInfo/AE','','setText')
			staleElement('EngInfo/AE','Nagaveni Nipinale','setText')
			WebUI.delay(5)
			WebUI.click(findTestObject('EngInfo/isCloudInitiativeYes'))
			WebUI.delay(5)
			WebUI.click(findTestObject('EngInfo/IsPegaMarketingYes'))
			WebUI.delay(5)
			WebUI.click(findTestObject('EngInfo/IsPegaMobileYes'))
			WebUI.delay(5)
			
			/*Services & Sales Team*/
			
			WebUI.delay(5)
			WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
			WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
			WebUI.delay(5)
			WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
			WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
			WebUI.delay(5)
			WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'), 2)
			WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
			WebUI.delay(5)
			WebUI.click(findTestObject('EngInfo/Continue'))
			WebUI.delay(5)
			attachDocs()
			woid()
			WOstatus()
			GlobalVariable.Meeting=true
			println GlobalVariable.Status
			println GlobalVariable.WOID
		}
		
		
@Keyword

def docUpdate()
		{
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Approve-Reject/linktoupdateEngData'))
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'),0)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'),0)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(4)
		WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'),0)
		WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(4)
		}
		
		
@Keyword
		
def docUpdateMeeting()
				{
				WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
				WebUI.delay(5)
				WebUI.click(findTestObject('Object Repository/Approve-Reject/linktoupdateEngData'))
				WebUI.waitForPageLoad(4)
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'),0)
				WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
				WebUI.waitForPageLoad(4)
				WebUI.delay(5)
	
				WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'),0)
				WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
				WebUI.delay(5)
				
				WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'),0)
				WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
				WebUI.delay(5)
				WebUI.waitForPageLoad(4)
				WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'),0)
				WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
				WebUI.delay(5)
				WebUI.click(findTestObject('EngInfo/Continue'))
				WebUI.waitForPageLoad(3)
				WebUI.delay(5)
				/*WebUI.click(findTestObject('Object Repository/Approve-Reject/attachdoc'))*/
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/BSW_TEXT'), 'testing')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/ESTIMATE_TEXT'), 'testing')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/OTHER_TEXT'), 'testing')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/PRIAGE_TEXT'), 'testing')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Object Repository/ECR_MEETING/SIZING_TEXT'), 'testing')
				WebUI.delay(5)
				WebUI.sendKeys(findTestObject('Approve-Reject/APPROVE_REJECT_NOTES'), 'testing')
				WebUI.delay(5)
				WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
				WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
				WebUI.delay(5)
				
				woid()
				WOstatus()
				GlobalVariable.Meeting=true
				println GlobalVariable.Status
				println GlobalVariable.WOID
				
				}
		
				


@Keyword

def setprop(String Flow){
		
if (Flow =='Approve')


		{
		GlobalVariable.RLReject=false
		GlobalVariable.RDReject=false
		GlobalVariable.OpsReject=false
		GlobalVariable.RouteToRL=true
		GlobalVariable.RDD_Reject=false
		GlobalVariable.EXP_SVC_Reject=false
		}

		else if(Flow =='Reject')

		{
			GlobalVariable.RLReject=true
			GlobalVariable.RDReject=true
			GlobalVariable.OpsReject=true
			GlobalVariable.RouteToRL=true
			GlobalVariable.RDD_Reject=true
			GlobalVariable.EXP_SVC_Reject=true
			}
		
		else
		
		{
			GlobalVariable.RLRecall=true
			GlobalVariable.RDRecall=true
			GlobalVariable.OpsRecall=true
			GlobalVariable.RouteToRL=true
			GlobalVariable.EXP_SVC_Recall=true
			}
}

@Keyword
		def scheduleMeeting(){
			WebUI.delay(5)
			WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/ECR_MEETING/meetinglink'))
			WebUI.delay(5)
			WebUI.setText(findTestObject('Object Repository/ECR_MEETING/location'), 'Testing')
			WebUI.delay(5)
			WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
			WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
			WebUI.delay(5)
			WebUI.verifyTextPresent('This proposal clinic meeting has been scheduled. You may request to reschedule the meeting by using the Actions', false)
			
		}
				

		

@Keyword

		def pendingClinic()
		{
			WebUI.delay(5)
			WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/ECR_MEETING/HoldClinicMeeting'))
			WebUI.delay(5)
			WebUI.click(findTestObject('Object Repository/ECR_MEETING/CLINIC_OUTCOME'))
			WebUI.delay(5)
			WebUI.setText(findTestObject('Object Repository/ECR_MEETING/OUTCOME_NOTES'), 'testing')
			WebUI.delay(5)
			WebUI.scrollToElement(findTestObject('Object Repository/Generic/SUBMIT'),0)
			WebUI.click(findTestObject('Object Repository/Generic/SUBMIT'))
			WebUI.delay(5)
		}

		
		
		
		
@Keyword


def wirteWOID()
{
	InputStream ExcelFileToRead = new FileInputStream("C:\\Users\\nipin\\Desktop\\TestDataLatest.xlsx");
	XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead)
	XSSFSheet  sheet=wb.getSheetAt(0)
	int rowcount =	sheet.getLastRowNum()
	System.out.println("total number of rown present in the sheet : " +rowcount);
	int colcount = sheet.getRow(1).getLastCellNum()
	
	System.out.println("total number of columns present in the sheet : " +colcount);
	
	for (int i=1;i<=rowcount;i++)
	
		{
			XSSFCell cell =sheet.getRow(i).getCell(1)	
			String celltext
			
			System.out.println("cell : " +cell);
			if(cell.getCellType()==cell.CELL_TYPE_NUMERIC)
				{
					celltext=String.valueOf(cell.getNumericCellValue())
					System.out.println("celltext : " +celltext);
			
				}
			
			else if(cell.getCellType()==cell.CELL_TYPE_STRING)
				{
				celltext=String.valueOf(cell.getStringCellValue())
				}
			
			else if(cell.getCellType()==cell.CELL_TYPE_BLANK)
				{
				celltext=""
				
				}
			
			
			if(Double.parseDouble(celltext)>1)
			
				{
				sheet.getRow(i).getCell(1).setCellValue("test")
				}
			
			else
			
				{
				sheet.getRow(i).getCell(1).setCellValue("minor")
				}
		}
		
		
		ExcelFileToRead.close()
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\nipin\\Desktop\\TestDataLatest.xlsx")
		
		wb.write(fos)
	
	
	
}
		



@Keyword
def writeWOID()
{
	InputStream ExcelFileToRead = new FileInputStream("C:\\Users\\nipin\\Desktop\\TestDataLatest.xlsx");
	XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead)
	XSSFSheet  sheet=wb.getSheetAt(0)

	XSSFCell cell =sheet.getRow(1).getCell(1)
    cell.setCellValue("ECR-21Dec2017-1");
	ExcelFileToRead.close()
		
	FileOutputStream fos = new FileOutputStream("C:\\Users\\nipin\\Desktop\\TestDataLatest.xlsx")
		
	wb.write(fos)

	
}
	
@Keyword
		def staleElement(String stale,String value, String option)
		{
				
				for(int i=0;i<2;i++)
				{
					if(option=='sendKeys')
					try {
							WebUI.sendKeys(findTestObject(stale),value)
							println "first try block"
							break
					}
					catch (StaleElementReferenceException)
						
					{
						println  i
					}
					
									
					else (option=='setText')
					try {
							WebUI.setText(findTestObject(stale),value)
							println "first try block"
							break
					}
					catch (StaleElementReferenceException)
						
					{
						println  i
					}
					
		
				}
		}
		
			
		
@Keyword

def Nag(String WOID, String SEQ){
	
	
		
	println SEQ
	
	java.lang.Integer seqNum = Integer.parseInt(SEQ)
	//java.lang.Long seqNum=NumberFormat.getInstance().parse(SEQ);
	println seqNum
	InputStream ExcelFileToRead = new FileInputStream("C:\\trial.xlsx");
	XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead)
	XSSFSheet  sheet=wb.getSheetAt(0)	
	 
	Row row = sheet.getRow(seqNum);
	Cell cell = row.getCell(1);
	if (cell == null) {
		cell = row.createCell(1);
	}
	cell.setCellType(Cell.CELL_TYPE_STRING);
	cell.setCellValue("test");
			
	ExcelFileToRead.close()
			
	FileOutputStream fos = new FileOutputStream("C:\\trial.xlsx")
			
	wb.write(fos)
}

@Keyword

def trial(int WOID)
{
	InputStream ExcelFileToRead = new FileInputStream("C:\\trial.xlsx");
	XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead)
	XSSFSheet  sheet=wb.getSheetAt(0)
	HSSFRow row = sheet.getRow(0);
	HSSFCell cell = row.getCell(colIx);
	short minColIx = row.getFirstCellNum();
		
	/*XSSFCell cell =sheet.getRow(WOID).getCell(1)*/
	
	int rowcount =	sheet.getLastRowNum()
	System.out.println("total number of rown present in the sheet : " +rowcount);
	int colcount = sheet.getRow(1).getLastCellNum()
	
	System.out.println("total number of columns present in the sheet : " +colcount);
	
	for (int i=1;i<=rowcount;i++)
	
		{
			/*XSSFCell cell =sheet.getRow(i).getCell(1)
			
			Row row=sheet.getRow(i)
			Cell cell=row.createCell(1)
			cell.setCellValue("Test")*/
			

		}
		ExcelFileToRead.close()
		FileOutputStream fos = new FileOutputStream("C:\\trial.xlsx")
		wb.write(fos)
}		
		
		
		
}		
		
		

				
		

// end of class
		


