package com.tdd.xunit;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String name) {
		super(name);
	}

	WasRun test;
	TestResult result;
	
	public static void main(String[] args) {
		TestSuit suit = new TestSuit();
		TestResult result = new TestResult();
		suit.add(new TestCaseTest("testTemplateMethod"));
		suit.add(new TestCaseTest("testResult"));
		suit.add(new TestCaseTest("testFailedResult"));
		suit.add(new TestCaseTest("testFailedResultFormatting"));
		suit.add(new TestCaseTest("testSuit"));
		suit.run(result);
		System.out.println(result.summary());
	}
	
	public void setUp() {
		test = new WasRun("testMethod");
		result = new TestResult();
	}
	
	public void testWasRun() {
		System.out.println(!test.wasRun);
		test.run(result);
		System.out.println(test.wasRun);
	}
	
	public void testSetUp() {
		test.run(result);
		System.out.println("setUp testMethod ".equals(test.log));
	}
	
	public void testRunning() {
		test.run(result);
		System.out.println(test.wasRun);
	}
	
	public void testTemplateMethod() {
		test.run(result);
		System.out.print("setUp testMethod tearDown ".equals(test.log));
	}
	
	public void testResut() {
		test.run(result);
		System.out.println("1 run, 0 failed".equals(result.summary()));
	}
	
	public void testResultFormatting() {
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		System.out.println("1 run, 1 failed".equals(result.summary()));
	}
	
	public void testSuit() {
		TestSuit suit = new TestSuit();
		suit.add(new WasRun("testMethod"));
		suit.add(new WasRun("testBrokenMethod"));
		suit.run(result);
		System.out.println("2 run, 1 failed".equals(result.summary()));
	}
}
