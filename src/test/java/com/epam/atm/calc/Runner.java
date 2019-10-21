package com.epam.atm.calc;

import com.epam.atm.calc.listeners.TestListeners;
import org.testng.TestNG;
import org.testng.xml.XmlSuite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        TestNG testNg = new  TestNG();
        testNg.addListener(new TestListeners());

        XmlSuite suite = new XmlSuite();
        suite.setSuiteFiles(Arrays.asList("./src/test/resources/tests.xml"));
        List<XmlSuite> suites = new ArrayList<XmlSuite>();
        suites.add(suite);

        testNg.setXmlSuites(suites);
        testNg.run();
    }
}
