package com.epam.atm.calc.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;

public class BaseTest {
    protected Calculator calculator;

    @BeforeClass(groups = "b")
    public void setUp() {
        System.out.println("Before class preparing calculator");
        calculator = new Calculator();
    }

   /* @BeforeGroups

    public void setUp2() {
        System.out.println("Before groups preparing calculator");
        calculator = new Calculator();
    }*/
    @AfterClass
    public void tearDown() {
        calculator = null;
    }
}
