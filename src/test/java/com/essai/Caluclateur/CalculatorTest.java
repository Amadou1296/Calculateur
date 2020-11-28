package com.essai.Caluclateur;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
    int tab[]={2,3,8,-2};
    
    Calculator calculator;
	@Before
	public void setUp() throws Exception{
		calculator = new Calculator();
	}
    

    @Test
    public void testMaxElement()
    {

        Assert.assertEquals(8,calculator.maxElement(tab));
    }

    
    @Test
    public void testMinelement()
    {

        Assert.assertEquals(8,calculator.maxElement(tab));
    }

    @Test
    public void testMinElement()
    {
        Assert.assertEquals(-2,calculator.minElement(tab));
    }

    @Test
    public void testMultiply()
    {

        Assert.assertEquals(12, calculator.multiply(3, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {

        calculator.divide(6, 0);
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

	@Test
	public void testMin() {

		int result = calculator.min(30, 10);
		if (result != 10) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}

	@Test
	public void testMax() {

		int result = calculator.max(30, 10);
		if (result != 30) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}
}
