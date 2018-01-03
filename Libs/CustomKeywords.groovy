

import java.lang.String


def static "com.helper.commonfunct.COECommonMethods.logoff"() {
    (new com.helper.commonfunct.COECommonMethods()).logoff()
}

def static "com.helper.commonfunct.COECommonMethods.woid"() {
    (new com.helper.commonfunct.COECommonMethods()).woid()
}

def static "com.helper.commonfunct.COECommonMethods.WOstatus"() {
    (new com.helper.commonfunct.COECommonMethods()).WOstatus()
}

def static "com.helper.commonfunct.COECommonMethods.closeWO"() {
    (new com.helper.commonfunct.COECommonMethods()).closeWO()
}

def static "com.helper.commonfunct.COECommonMethods.search"() {
    (new com.helper.commonfunct.COECommonMethods()).search()
}

def static "com.helper.commonfunct.COECommonMethods.serviceTeam"(
    	String PL	
     , 	String PLTL	
     , 	String RD	
     , 	String RL	) {
    (new com.helper.commonfunct.COECommonMethods()).serviceTeam(
        	PL
         , 	PLTL
         , 	RD
         , 	RL)
}

def static "com.helper.commonfunct.INV_CommonMethods.createNewInvestment"() {
    (new com.helper.commonfunct.INV_CommonMethods()).createNewInvestment()
}

def static "com.helper.commonfunct.BEP_CommonMethod.BEPImport"(
    	String filename	) {
    (new com.helper.commonfunct.BEP_CommonMethod()).BEPImport(
        	filename)
}

def static "com.helper.commonfunct.BEP_CommonMethod.EstimateNoOutput"(
    	String Filelocation	
     , 	String ORG	
     , 	String ACC	
     , 	String PL	
     , 	String RD	
     , 	String RL	
     , 	String PLTL	
     , 	String TestCaseNo	
     , 	String TestDataFile	) {
    (new com.helper.commonfunct.BEP_CommonMethod()).EstimateNoOutput(
        	Filelocation
         , 	ORG
         , 	ACC
         , 	PL
         , 	RD
         , 	RL
         , 	PLTL
         , 	TestCaseNo
         , 	TestDataFile)
}

def static "com.helper.commonfunct.BEP_CommonMethod.EstimateEmailOutput"(
    	String Filelocation	) {
    (new com.helper.commonfunct.BEP_CommonMethod()).EstimateEmailOutput(
        	Filelocation)
}

def static "com.helper.commonfunct.BEP_CommonMethod.WOstatus"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).WOstatus()
}

def static "com.helper.commonfunct.BEP_CommonMethod.searchStatus"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).searchStatus()
}

def static "com.helper.commonfunct.BEP_CommonMethod.search"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).search()
}

def static "com.helper.commonfunct.BEP_CommonMethod.woid"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).woid()
}

def static "com.helper.commonfunct.BEP_CommonMethod.RDapprove"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).RDapprove()
}

def static "com.helper.commonfunct.BEP_CommonMethod.noToRL"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).noToRL()
}

def static "com.helper.commonfunct.BEP_CommonMethod.RDReject"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).RDReject()
}

def static "com.helper.commonfunct.BEP_CommonMethod.GSOpsReview"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).GSOpsReview()
}

def static "com.helper.commonfunct.BEP_CommonMethod.RLapprove"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).RLapprove()
}

def static "com.helper.commonfunct.BEP_CommonMethod.ScheduleMeeting"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).ScheduleMeeting()
}

def static "com.helper.commonfunct.BEP_CommonMethod.Cancelmeeting"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).Cancelmeeting()
}

def static "com.helper.commonfunct.BEP_CommonMethod.RLRequestMeeting"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).RLRequestMeeting()
}

def static "com.helper.commonfunct.BEP_CommonMethod.RLreject"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).RLreject()
}

def static "com.helper.commonfunct.BEP_CommonMethod.withdraw"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).withdraw()
}

def static "com.helper.commonfunct.BEP_CommonMethod.recall"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).recall()
}

def static "com.helper.commonfunct.BEP_CommonMethod.Update"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).Update()
}

def static "com.helper.commonfunct.BEP_CommonMethod.EmailCustomer"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).EmailCustomer()
}

def static "com.helper.commonfunct.BEP_CommonMethod.SkipEmail"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).SkipEmail()
}

def static "com.helper.commonfunct.BEP_CommonMethod.UpdateAfterRecall"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).UpdateAfterRecall()
}

def static "com.helper.commonfunct.BEP_CommonMethod.RequestCancelMeeting"() {
    (new com.helper.commonfunct.BEP_CommonMethod()).RequestCancelMeeting()
}

def static "com.helper.commonfunct.BEP_CommonMethod.staleElement"(
    	String stale	
     , 	String value	
     , 	String option	) {
    (new com.helper.commonfunct.BEP_CommonMethod()).staleElement(
        	stale
         , 	value
         , 	option)
}

def static "com.helper.commonfunct.commonutilities.login"(
    	String URL	
     , 	String username	
     , 	String pwd	) {
    (new com.helper.commonfunct.commonutilities()).login(
        	URL
         , 	username
         , 	pwd)
}

def static "com.helper.commonfunct.commonutilities.Import"(
    	String Filelocation	) {
    (new com.helper.commonfunct.commonutilities()).Import(
        	Filelocation)
}

def static "com.helper.commonfunct.commonutilities.logoff"() {
    (new com.helper.commonfunct.commonutilities()).logoff()
}

def static "com.helper.commonfunct.commonutilities.woid"() {
    (new com.helper.commonfunct.commonutilities()).woid()
}

def static "com.helper.commonfunct.commonutilities.WOstatus"() {
    (new com.helper.commonfunct.commonutilities()).WOstatus()
}

def static "com.helper.commonfunct.commonutilities.closeWO"() {
    (new com.helper.commonfunct.commonutilities()).closeWO()
}

def static "com.helper.commonfunct.commonutilities.search"() {
    (new com.helper.commonfunct.commonutilities()).search()
}

def static "com.helper.commonfunct.commonutilities.approve"() {
    (new com.helper.commonfunct.commonutilities()).approve()
}

def static "com.helper.commonfunct.commonutilities.EXPReview"() {
    (new com.helper.commonfunct.commonutilities()).EXPReview()
}

def static "com.helper.commonfunct.commonutilities.gsopsApprove"() {
    (new com.helper.commonfunct.commonutilities()).gsopsApprove()
}

def static "com.helper.commonfunct.commonutilities.gsopsReject"() {
    (new com.helper.commonfunct.commonutilities()).gsopsReject()
}

def static "com.helper.commonfunct.commonutilities.reject"() {
    (new com.helper.commonfunct.commonutilities()).reject()
}

def static "com.helper.commonfunct.commonutilities.attachDocs"() {
    (new com.helper.commonfunct.commonutilities()).attachDocs()
}

def static "com.helper.commonfunct.commonutilities.ContractDisposition"() {
    (new com.helper.commonfunct.commonutilities()).ContractDisposition()
}

def static "com.helper.commonfunct.commonutilities.routeToRL"() {
    (new com.helper.commonfunct.commonutilities()).routeToRL()
}

def static "com.helper.commonfunct.commonutilities.noRL"() {
    (new com.helper.commonfunct.commonutilities()).noRL()
}

def static "com.helper.commonfunct.commonutilities.RDApprove_Meeting"() {
    (new com.helper.commonfunct.commonutilities()).RDApprove_Meeting()
}

def static "com.helper.commonfunct.commonutilities.CreateECR"(
    	String Filelocation	
     , 	String ORG	
     , 	String ACC	
     , 	String PL	
     , 	String RD	
     , 	String RL	
     , 	String PLTL	
     , 	String TestCaseNo	) {
    (new com.helper.commonfunct.commonutilities()).CreateECR(
        	Filelocation
         , 	ORG
         , 	ACC
         , 	PL
         , 	RD
         , 	RL
         , 	PLTL
         , 	TestCaseNo)
}

def static "com.helper.commonfunct.commonutilities.createECRcopy"(
    	String Filelocation	) {
    (new com.helper.commonfunct.commonutilities()).createECRcopy(
        	Filelocation)
}

def static "com.helper.commonfunct.commonutilities.MeetingDT"() {
    (new com.helper.commonfunct.commonutilities()).MeetingDT()
}

def static "com.helper.commonfunct.commonutilities.ECRMeeting"(
    	String Filelocation	
     , 	String ORG	
     , 	String ACC	
     , 	String PL	
     , 	String PLTL	
     , 	String RD	
     , 	String RL	) {
    (new com.helper.commonfunct.commonutilities()).ECRMeeting(
        	Filelocation
         , 	ORG
         , 	ACC
         , 	PL
         , 	PLTL
         , 	RD
         , 	RL)
}

def static "com.helper.commonfunct.commonutilities.docUpdate"() {
    (new com.helper.commonfunct.commonutilities()).docUpdate()
}

def static "com.helper.commonfunct.commonutilities.docUpdateMeeting"() {
    (new com.helper.commonfunct.commonutilities()).docUpdateMeeting()
}

def static "com.helper.commonfunct.commonutilities.setprop"(
    	String Flow	) {
    (new com.helper.commonfunct.commonutilities()).setprop(
        	Flow)
}

def static "com.helper.commonfunct.commonutilities.scheduleMeeting"() {
    (new com.helper.commonfunct.commonutilities()).scheduleMeeting()
}

def static "com.helper.commonfunct.commonutilities.pendingClinic"() {
    (new com.helper.commonfunct.commonutilities()).pendingClinic()
}

def static "com.helper.commonfunct.commonutilities.wirteWOID"() {
    (new com.helper.commonfunct.commonutilities()).wirteWOID()
}

def static "com.helper.commonfunct.commonutilities.writeWOID"() {
    (new com.helper.commonfunct.commonutilities()).writeWOID()
}

def static "com.helper.commonfunct.commonutilities.staleElement"(
    	String stale	
     , 	String value	
     , 	String option	) {
    (new com.helper.commonfunct.commonutilities()).staleElement(
        	stale
         , 	value
         , 	option)
}

def static "com.helper.commonfunct.commonutilities.Nag"(
    	String WOID	
     , 	String SEQ	) {
    (new com.helper.commonfunct.commonutilities()).Nag(
        	WOID
         , 	SEQ)
}

def static "com.helper.commonfunct.commonutilities.trial"(
    	int WOID	) {
    (new com.helper.commonfunct.commonutilities()).trial(
        	WOID)
}
