package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SubCalcTest extends BaseTest {

    @Test
    @Parameters({"arg1", "arg2", "expected"})
    public void testSub(@Optional(value="8") long arg1,@Optional(value = "3") long arg2, @Optional(value = "5") long expected){
       long result = calculator.sub(arg1,arg2);
        Assert.assertEquals(result, expected);

    }


}
