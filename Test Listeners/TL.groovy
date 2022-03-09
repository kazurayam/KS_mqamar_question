import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext

class TL {
	
	private static Stack<TestCaseContext> tccStack = new Stack<>()
	
	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {
		tccStack.push(testCaseContext)
	}

	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {
		if (!tccStack.empty()) {
			TestCaseContext tcc = tccStack.pop()
			onIncident("@AfterTestCase for " + tcc.getTestCaseId())
		} 
	}
	
	static def void onIncident(String message) {
		// you can do anything you like here
		if (!tccStack.empty()) {
			TestCaseContext tcc = tccStack.peek()
			println "[" + tcc.getTestCaseId() + "] " + message
		}
	}
}