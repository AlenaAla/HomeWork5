package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.LocalDateTime;

import static com.epam.tat.module4.Timeout.sleep;

public class SumCalcTest extends BaseTest {

    @Test(dataProvider = "valuesForSunTest")
    public void testSum(long a , long b, long expectedValue){
        sleep(1);
        System.out.println(LocalDateTime.now() + " Sum Calc Test");
        long result = calculator.sum(a,b);
        Assert.assertEquals(result,expectedValue,"Invalid result of sum operation!");
    }
@DataProvider(name = "valuesForSunTest")
    public Object[][] valuesForSum(){
        return new Object[][] {
                {10, 13, 23 },
                {10, -1, 9},
                {0,0,0},
          //      {-1, 10, 9}
        };
    }


    }

