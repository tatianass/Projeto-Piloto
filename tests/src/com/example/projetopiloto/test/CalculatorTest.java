package com.example.projetopiloto.test;

import junit.framework.TestCase;

import com.example.projetopiloto.Calculator;

public class CalculatorTest extends TestCase {

	protected Calculator c;
	
	@Override
	public void setUp() {
		c = new Calculator();
	}
	
	public void testAdd() {
		assertEquals(2, c.add(1, 1));
		assertEquals(0, c.add(1, -1));
	}
	
}
