import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

try {
	WebUI.callTestCase(findTestCase("1_CreateUser"), [:])
} catch (StepFailedException e) {
	TL.onIncident("Failure in 1_CreateUser")	
}

try {
	WebUI.callTestCase(findTestCase("2_UpdateUser"), [:])
} catch (StepFailedException e) {
	TL.onIncident("Failure in 2_UpdateUser")
}

try {
	WebUI.callTestCase(findTestCase("3_DeleteUser"), [:])
} catch (StepFailedException e) {
	TL.onIncident("Failure in 3_DeleteUser")
}