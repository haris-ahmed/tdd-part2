package com.tdd.xunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuit {

	List<TestCase> tests;
	
	public TestSuit() {
		tests = new ArrayList<TestCase>();
	}
	
	public void add(TestCase test) {
		tests.add(test);
	}
	
	public TestResult run(TestResult result) {
		for(TestCase test : tests) {
			test.run(result);
		}
		return result;
	}
}
