import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

try {
	WebUI.callTestCase(findTestCase("1_CreateUser"), [:])
} finally {
	TL.onIncident("has finished")	
}

try {
	WebUI.callTestCase(findTestCase("2_UpdateUser"), [:])
} finally {
	TL.onIncident("has finished")
}

try {
	WebUI.callTestCase(findTestCase("3_DeleteUser"), [:])
} finally {
	TL.onIncident("has finished")
}