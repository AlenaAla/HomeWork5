package com.epam.atm.calc.tests;

import org.testng.annotations.Factory;

public class DivTestFactory {
    @Factory
    public Object [] generateDivData(){
        return new Object[]{
                new DivCalcTest(6,3,2),
                new DivCalcTest(8, -2, -4),
                new DivCalcTest(0,1,0),
        };
    }
}
