package com.orangehrm.stepdefinitions;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class) 
@CucumberOptions(features="D:\\PROGRAMS\\wipro\\src\\test\\resources\\Feature"
,glue= {"com.orangehrm.stepdefinitions"}
,dryRun=false
,monochrome=true)


public class TestRunner {

}



