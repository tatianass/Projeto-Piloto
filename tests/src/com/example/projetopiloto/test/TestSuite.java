package com.example.projetopiloto.test;

import junit.framework.TestCase;

public class TestSuite extends TestCase {
 
	public static void main(String[] args) {
		TestCase calculator = new CalculatorTest() {
			@Override
			public void runTest() {
				testAdd();
			}
		};
		calculator.run();
	}
	
}
