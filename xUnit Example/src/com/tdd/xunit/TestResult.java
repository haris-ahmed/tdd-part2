package com.tdd.xunit;

public class TestResult {
	
	int runCount = 1;
	
	public void testStarted() {
		runCount = runCount + 1;
	}

	public String summary() {
		return runCount + " run, 0 failed";
	}
}
