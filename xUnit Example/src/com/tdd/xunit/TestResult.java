package com.tdd.xunit;

public class TestResult {
	
	int runCount = 0;
	int errorCount = 0;
	
	public void testStarted() {
		runCount = runCount + 1;
	}
	
	public void testFailed() {
		errorCount = errorCount + 1;
	}

	public String summary() {
		return runCount + " run, " + errorCount + " failed";
	}
}
