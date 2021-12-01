package com.jacoco.test;

import org.testng.annotations.Test;

import com.jacoco.CompareString;

public class TestCode {
	
	@Test
	public void test1() {
		CompareString comString = new CompareString();
		comString.containsOrNot("Slelenium is Test Automation Tool");
	}
	
	@Test
	public void negativeTest() {
		CompareString comString = new CompareString();
		comString.containsOrNot("Manual testing");
	}

}
