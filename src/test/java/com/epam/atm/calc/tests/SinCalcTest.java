package com.epam.atm.calc.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

//import static java.lang.Math.round;

import static java.lang.Math.round;
import static java.lang.Math.scalb;
import static java.lang.Math.sin;


public class SinCalcTest extends BaseTest{
    @Test(groups = "b")
    public void sin0(){
        System.out.println("sin0");
        double result = calculator.sin(0);
       System.out.println(result);
       Assert.assertEquals(result, 0.0);
    }

    @Test(groups = "a")
    public void sin30(){
        System.out.println("sin30");
        double result = round(calculator.sin((Math.PI/ 6)));
        System.out.println(result);
        Assert.assertEquals(result, 0.5);
    }

    @Test(groups = "c")
    public void sin45(){
        System.out.println("sin45");
        double result = calculator.sin(Math.PI/ 4);
        Assert.assertEquals(result,0.85 );
    }

}
