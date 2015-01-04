package com.tdd.xunit;

public class WasRun extends TestCase {

	boolean wasRun;
	boolean wasSetUp = true;
	
	WasRun(String name) {
		super(name);
	}
	
	public void testMethod() {
		wasRun = true;
	}
	
	public void setUp() {
		wasRun = false;
		wasSetUp = true;
	}
}
