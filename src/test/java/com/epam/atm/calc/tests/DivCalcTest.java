package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;


import java.time.LocalDateTime;

import static com.epam.tat.module4.Timeout.sleep;

public class DivCalcTest extends BaseTest {
    private long arg1;
    private long arg2;
    private long expected;

    public DivCalcTest(long arg1, long arg2, long expected) {
        this.arg1 = arg1;
        this.arg2 = arg2;
        this.expected = expected;
    }

    @Test
    public void testDiv(){


        long result = calculator.div(arg1, arg2);
        Assert.assertEquals(result, expected);

        }
    }


