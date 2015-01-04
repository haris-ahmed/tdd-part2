package com.tdd.xunit;

import java.lang.reflect.Method;

public class TestCase {

	String name;
	
	public TestCase(String name) {
		this.name = name;
	}
	
	public void run() {
		try {
			Method method = this.getClass().getMethod(this.name, null);
			method.invoke(this);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
