package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

import static com.epam.tat.module4.Timeout.sleep;

public class MultCalcTest extends BaseTest {
    @Test(dataProvider = "valuesforMult")
    public void testMult(long arg1, long arg2, long expected){
        sleep(1);
        System.out.println(LocalDateTime.now() + " Mult Calc Test");
        long result = calculator.mult(arg1, arg2);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "valuesforMult")
    public static Object[][] valuesForMult(){
        return new Object[][]{
                {1, 1, 1},
                {2, 3, 6},
                {0, 4, 0},
                {-2, 7, -14},

        };
    }
}
