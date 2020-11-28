package com.essai.Caluclateur;

public class CalculatorTest {
    int tab[]={2,3,8,-2};
    @Test
    public void testMultiply()
    {

        Assert.assertEquals(12, calculator.multiply(3, 4));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivideWillThrowExceptionWhenDivideOnZero() {

        calculator.divide(6, 0);
    }

    @Test
    public void testMaxElement()
    {

        Assert.assertEquals(8,calculator.maxElement(tab));
    }

    @Test
    public void testMinElement()
    {
        Assert.assertEquals(-2,calculator.minElement(tab));
    }

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
}
