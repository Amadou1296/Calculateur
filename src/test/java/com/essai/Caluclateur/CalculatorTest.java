package com.essai.Caluclateur;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	Calculator calculator;
	@Before
	public void setUp() throws Exception{
		calculator = new Calculator();
	}
	
	// test somme
	@Test
	public void testSum() {
		// Given
		
		// When
		int result = calculator.sum(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}
	
	//test soustraction 
	@Test
	public void testMinus() {
		// Given
		
		// When
		int result = calculator.minus(5, 2);
		// Then
		if (result != 3) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}
	
	// test division 
	@Test
	public void testDivide() {
		
		Assert.assertEquals(2, calculator.divide(6, 3));
	}
}
