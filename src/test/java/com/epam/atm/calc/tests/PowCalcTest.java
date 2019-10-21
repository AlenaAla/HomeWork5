package com.epam.atm.calc.tests;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class PowCalcTest extends BaseTest{

    private double arg1;
    private double arg2;
    private double expected;


    @Factory (dataProvider = "valuesForPow")
    public PowCalcTest(double arg1, double arg2, double expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Test
    public void testPow() {
        double result = calculator.pow(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "valuesForPow")
    public static Object[][] valuesForPow(){
        return new Object[][]{
                {5, 0, 1},
                {6, 1, 6},
                {2, 3, 8},
        };
    }
}
