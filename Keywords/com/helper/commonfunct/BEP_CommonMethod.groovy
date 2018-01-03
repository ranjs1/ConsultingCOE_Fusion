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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import com.sun.jna.platform.win32.WinDef.WORD
import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI
import com.helper.commonfunct.commonutilities


public class BEP_CommonMethod {

	
	
@Keyword
	
def BEPImport(String filename){
	WebUI.delay(5)
	WebUI.waitForElementVisible(findTestObject('BEP/import'), 0)
	WebUI.click(findTestObject('BEP/import'))
	WebUI.delay(5)
	WebUI.uploadFile(findTestObject('Generic/FilePath'), filename)
	WebUI.delay(5)
	WebUI.click(findTestObject('Generic/button_Submit'))
	}
	
@Keyword
def EstimateNoOutput(
	String Filelocation, 
	String ORG, String ACC,
	String PL, 
	String RD, 
	String RL, 
	String PLTL, 
	String TestCaseNo, 
	String TestDataFile)
	
	{
		/*WebUI.click(findTestObject('Generic/a_Actions'))
		WebUI.focus(findTestObject('Generic/span_New'))
		WebUI.click(findTestObject('BEP/EstimateLink'))*/
		WebUI.maximizeWindow()
		WebUI.delay(2)
		WebUI.click(findTestObject('Generic/New'))
		WebUI.delay(4)
		WebUI.click(findTestObject('BEP/EstimateLink'))
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 30)
		BEPImport(Filelocation)
		WebUI.delay(10)
		WebUI.setText(findTestObject('Generic/ORG'), ORG)
		WebUI.delay(7)
		WebUI.sendKeys(findTestObject('Generic/ORG'), Keys.chord(Keys.TAB))
		WebUI.delay(7)
		WebUI.setText(findTestObject('Generic/ACC'), ACC)
		WebUI.delay(7)
		WebUI.sendKeys(findTestObject('Generic/ACC'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Generic/ENG_DESC'), 'AUTOTEST1')
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Generic/PlatformID'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID'), 'Pega Platform(PRPC)')
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Generic/PlatformVersion'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion'), '6.2')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('BEP/MorethanOneRLSNO'), 2)
		WebUI.click(findTestObject('BEP/MorethanOneRLSNO'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Generic/PlatformTrue'))
		WebUI.delay(5)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EngInfo/PL'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PL'),PL)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EngInfo/PLTL'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PLTL'),PLTL)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EngInfo/RL'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/RL'),RL)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EngInfo/RD'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/RD'),RD)
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(5)

		/*		
		WebUI.setText(findTestObject('BEP/DurationLow'), '12')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('BEP/DurationLow'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('BEP/DurationHigh'), '12')
		WebUI.delay(7)
		WebUI.sendKeys(findTestObject('BEP/DurationHigh'), Keys.chord(Keys.TAB))
		WebUI.delay(7)
		staleElement('BEP/PartnerHoursLow','12','setText')
		WebUI.delay(5)
		staleElement('BEP/PartnerHoursHigh','12','setText')
		WebUI.delay(5)
		/*
		WebUI.setText(findTestObject('BEP/DurationLow'), '12')
		WebUI.delay(7)
		WebUI.sendKeys(findTestObject('BEP/DurationLow'), Keys.chord(Keys.TAB))
		WebUI.delay(7)
		WebUI.setText(findTestObject('BEP/DurationHigh'), '12')
		WebUI.delay(7)
		WebUI.sendKeys(findTestObject('BEP/DurationHigh'), Keys.chord(Keys.TAB))
		WebUI.delay(7)
		WebUI.setText(findTestObject('BEP/PartnerHoursLow'), '12')
		WebUI.delay(7)
		WebUI.sendKeys(findTestObject('BEP/PartnerHoursLow'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('BEP/PartnerHoursHigh'), '12')
		WebUI.delay(5)
		*/
		
		WebUI.click(findTestObject('BEP/EstimationMethod'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('BEP/EstimationMethod'), 'BSW', FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		/*
		WebUI.click(findTestObject('BEP/routeToRL'))*/
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(5)
		WebUI.click(findTestObject('BEP/BEPoutput'))
		WebUI.delay(5)
		WebUI.selectOptionByValue(findTestObject('BEP/ReasonCode'), 'RFP in process', false)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
		WebUI.delay(5)
		woid()
		
		/*Function to write work object information to test data file*/	
		
		java.lang.Integer seqNum = Integer.parseInt(TestCaseNo)
		println seqNum
		InputStream ExcelFileToRead = new FileInputStream(TestDataFile);
		XSSFWorkbook  wb = new XSSFWorkbook(ExcelFileToRead)
		XSSFSheet  sheet=wb.getSheetAt(0)
		Row row = sheet.getRow(seqNum);
		Cell cell = row.getCell(1);
		if (cell == null) {
			cell = row.createCell(1);
		}
			cell.setCellType(Cell.CELL_TYPE_STRING);
			cell.setCellValue(GlobalVariable.WOID);
			ExcelFileToRead.close()
			FileOutputStream fos = new FileOutputStream(TestDataFile)
			wb.write(fos)
	}
	
@Keyword
def EstimateEmailOutput(String Filelocation){
		WebUI.maximizeWindow()
		/*WebUI.click(findTestObject('Generic/Actions'))
		WebUI.focus(findTestObject('Generic/span_New'))
		WebUI.click(findTestObject('BEP/EstimateLink'))*/
		
		WebUI.click(findTestObject('Generic/New'))
		WebUI.delay(3)
		WebUI.click(findTestObject('BEP/EstimateLink'))
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 30)
		BEPImport(Filelocation)
		WebUI.delay(10)
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
		WebUI.click(findTestObject('Object Repository/Generic/PlatformID'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformID'), 'AMPchroma')
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Generic/PlatformVersion'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/Generic/PlatformVersion'), 'N/A')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('BEP/MorethanOneRLSNO'), 2)
		WebUI.click(findTestObject('BEP/MorethanOneRLSNO'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Generic/PlatformTrue'))
		WebUI.delay(5)
		/*
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EngInfo/PL'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PL'),'Jeffrey Henderson ')
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EngInfo/PLTL'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/PLTL'),'Robert Higgins')
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EngInfo/RL'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/RL'),'Eric Panepinto')
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/EngInfo/RD'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/EngInfo/RD'),'Robert Lang')
		WebUI.delay(5)
		*/
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		/*
		
		WebUI.setText(findTestObject('BEP/DurationLow'), '12')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('BEP/DurationLow'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('BEP/DurationHigh'), '12')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('BEP/DurationHigh'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('BEP/PartnerHoursLow'), '12')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('BEP/PartnerHoursLow'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.setText(findTestObject('BEP/PartnerHoursHigh'), '12')
		WebUI.delay(5)
		*/
		WebUI.click(findTestObject('BEP/EstimationMethod'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('BEP/EstimationMethod'), 'BSW', FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		/*
		WebUI.click(findTestObject('BEP/routeToRL'))
		*/
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.click(findTestObject('BEP/BEPOutputEmail'))
		WebUI.delay(2)
		WebUI.click(findTestObject('BEP/RECEIPIENT'))
		WebUI.delay(2)
		WebUI.click(findTestObject('BEP/AddEmailID'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('BEP/MAILID_XPATH'), 'nagaveni.nipinale@in.pega.com')
		WebUI.delay(2)
		WebUI.click(findTestObject('BEP/modal_submit'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('BEP/Email_Subject'), 'Test Automation')
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/FINISH_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/FINISH_BUTTON'))
		woid()
		}
	
@Keyword	
def WOstatus()
		{
		GlobalVariable.WOSTATUS=WebUI.getText(findTestObject('Object Repository/BEP/SearchStatus'))
		WebUI.click(findTestObject('Object Repository/Generic/viewAll'))
		GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('Generic/AssignmentStatus'), 10)
		println GlobalVariable.AssignmentList.size()
		}
@Keyword
def searchStatus(){
		GlobalVariable.WOSTATUS=WebUI.getText(findTestObject('Object Repository/BEP/SearchStatus'))
		print(GlobalVariable.WOSTATUS)
		WebUI.delay(4)
		/*WebUI.click(findTestObject('Object Repository/Generic/viewAll'))*/
		WebUI.delay(4)
		GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('Generic/AssignmentStatus'), 10)
		println GlobalVariable.AssignmentList.size()
		for (int i = 0; i < GlobalVariable.AssignmentList.size(); i++)
		println GlobalVariable.AssignmentList[i].text
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
		}
@Keyword
def woid()
		{
		GlobalVariable.WOID=WebUI.getText(findTestObject('Object Repository/BEP/BEPWOID'))
		print(GlobalVariable.WOID)
		}
@Keyword
def RDapprove()
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.waitForPageLoad(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/RD_RLApprove'),0)
		WebUI.click(findTestObject('BEP/RD_RLApprove'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		}
@Keyword
def noToRL()
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/BEP/routeNoTORL'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.click(findTestObject('BEP/RD_RLApprove'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		}
@Keyword
def RDReject()
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/RD_RL_REJECT'),0)
		WebUI.click(findTestObject('BEP/RD_RL_REJECT'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		}
@Keyword
def GSOpsReview(){
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.delay(3)
		GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('Object Repository/Generic/begin'), 10)
		println GlobalVariable.AssignmentList.size()
		if(GlobalVariable.AssignmentList.size()>1)
		{
		GlobalVariable.AssignmentList[1].click()
		}
		else 
		print 'test'
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.refresh()
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		}
@Keyword
def RLapprove()
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		if (GlobalVariable.Meeting==true)
		{
		WebUI.verifyTextPresent('A meeting for this estimate has been requested/scheduled', false)
		WebUI.delay(5)
		}
		else{
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/RD_RLApprove'),0)
		WebUI.click(findTestObject('BEP/RD_RLApprove'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		WebUI.waitForPageLoad(5)
		}
		}
		
@Keyword
def ScheduleMeeting()
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
	
		GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('Object Repository/Generic/begin'), 10)
		
		/*
		for (int i = 0; i = GlobalVariable.AssignmentList.size(); i++)
		println GlobalVariable.AssignmentList[i].text
		*/
					if(GlobalVariable.AssignmentList[0].isEnabled())
						{
							GlobalVariable.AssignmentList[0].click()
							
						}
						else
							GlobalVariable.AssignmentList[1].click()
			
			
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.delay(3)
		WebUI.setText(findTestObject('Object Repository/ECR_MEETING/location'), 'Cambridge')
		WebUI.delay(3)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		}
	
@Keyword
def Cancelmeeting()
	
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		GlobalVariable.AssignmentList = WebUI.findWebElements(findTestObject('Object Repository/Generic/begin'), 10)
		if(GlobalVariable.AssignmentList[0].isEnabled())
		{
			GlobalVariable.AssignmentList[0].click()
		}
		
		
		else if(GlobalVariable.AssignmentList[1].isEnabled())
		{
			GlobalVariable.AssignmentList[1].click()
		}
		
		else
		GlobalVariable.AssignmentList[2].click()
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.scrollToElement(findTestObject('Object Repository/Generic/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/Generic/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		}
@Keyword
	
def RLRequestMeeting(){
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/RD_RLApprove'),0)
		WebUI.click(findTestObject('BEP/RD_RLApprove'))
		WebUI.delay(5)
		WebUI.click(findTestObject('BEP/Meeting_Required'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/BEP/MeetingDate'), utilities.MeetingDT())
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		}
	
	
@Keyword
	
def RLreject(){
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/RD_RL_REJECT'),0)
		WebUI.click(findTestObject('BEP/RD_RL_REJECT'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		}
@Keyword
def withdraw(){
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Generic/otherAction'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/BEP/withdraw_link'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/BEP/withdraw_notes'), 'Testing')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/BEP/withdraw_notes'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/BEP/withdraw_submit'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Generic/CLOSE_WORK_OBJECT'))
		}


@Keyword 
def recall(){
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Generic/otherAction'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/BEP/recall'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/BEP/recall_reason'), 'Testing')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/BEP/recall_reason'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/BEP/recall_submit'))
		WebUI.delay(5)
		}

@Keyword
def Update(){
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
		WebUI.delay(5)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		}

@Keyword
def EmailCustomer(){
		if (GlobalVariable.CreateECR==true)
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		/*
		WebUI.click(findTestObject('Object Repository/BEP/emailPreview'))
		WebUI.delay(5)
		WebUI.switchToWindowTitle('Preview Bid Email', FailureHandling.STOP_ON_FAILURE)
		WebUI.delay(5)
		WebUI.verifyTextPresent("This budgetary estimate", false)
		WebUI.delay(5)
		WebUI.click(findTestObject('ObjectRepository/BEP/emailModalClose'))*/
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/BEP/ECR_CHECKBOX'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/BEP/SEND_EMAIL'))
		WebUI.delay(5)
		}
	else{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/BEP/SEND_EMAIL'))
		WebUI.delay(5)
		}
	}
@Keyword
def SkipEmail(){
		if (GlobalVariable.CreateECR==true)
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/BEP/ECR_CHECKBOX'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/BEP/SKIP_EMAIL_XPATH'))
		WebUI.delay(2)
		WebUI.sendKeys(findTestObject('BEP/DispositionReason'), 'testing')
		WebUI.delay(2)	
		WebUI.selectOptionByValue(findTestObject('BEP/ReasonCode'), 'RFP in process', false)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/BEP/test'))
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/BEP/Modal_OK'))
		WebUI.delay(5)
				}
	else
		{
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.delay(2)
		WebUI.click(findTestObject('Object Repository/BEP/SKIP_EMAIL_XPATH'))
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('BEP/DispositionReason'), 'testing')
		WebUI.delay(5)
		WebUI.selectOptionByValue(findTestObject('BEP/ReasonCode'), 'RFP in process', false)
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/BEP/test'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/BEP/Modal_OK'))
		WebUI.delay(5)
			}
		}

@Keyword

def UpdateAfterRecall(){
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('Object Repository/Generic/begin'))
		WebUI.delay(5)
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/BEP/BEP_CASENOTES'), 'Testing')
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Generic/NEXT_BUTTON'), 2)
		WebUI.click(findTestObject('Generic/NEXT_BUTTON'))
		WebUI.delay(5)
		WebUI.scrollToElement(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'),0)
		WebUI.click(findTestObject('Object Repository/BEP/FINISH_ASSIGNMENT'))
		WebUI.delay(5)
		}


@Keyword
def RequestCancelMeeting(){
		WebUI.switchToFrame(findTestObject('Generic/FRAME1'), 0)
		WebUI.click(findTestObject('OtherAction'))
		WebUI.delay(5)
		WebUI.click(findTestObject('BEP/Meeting/CancelMeeting'))
		WebUI.delay(5)
		WebUI.setText(findTestObject('Object Repository/ECR/ActionMenu/Reason'), 'Testing')
		WebUI.delay(5)
		WebUI.sendKeys(findTestObject('Object Repository/ECR/ActionMenu/Reason'), Keys.chord(Keys.TAB))
		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/BEP/Meeting/Submit_otheraction'))
		WebUI.delay(5)
		WebUI.click(findTestObject('Generic/CLOSE_WORK_OBJECT'))
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

} /* End of the Program*/






