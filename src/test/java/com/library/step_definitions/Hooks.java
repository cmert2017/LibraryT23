package com.library.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {


    @Before
    public void setup(Scenario scenario){
        System.out.println(scenario.getName());
        System.out.println(scenario.getSourceTagNames());
        System.out.println(":::Beginning of Test Execution :::");
    }


    @After
    public void tearDown() throws InterruptedException {
       // Driver.closeDriver();
        System.out.println(":::(^_^)End of test execution(*_*):::");
    }


}
