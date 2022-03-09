import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.context.TestCaseContext

class TL {
	/**
	 * Executes after every test case ends.
	 * @param testCaseContext related information of the executed test case.
	 */
	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {
		onIncident("@AfterTestCase for " + testCaseContext.getTestCaseId())
	}
	
	static def void onIncident(String message) {
		// you can do anything you like here
		println message
	}
}