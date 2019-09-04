package com.vytrack.step_definition;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hook {



    @Before(order = 2)
    public void setup(Scenario scenario){
//        System.out.println(scenario.getSourceTagNames());
//        System.out.println(scenario.getName());
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.getDriver().get(ConfigurationReader.getProperty("url"+ConfigurationReader.getProperty("environment")));


    }


    @After(order = 2)
    public void tearDown(Scenario scenario){

        if(scenario.isFailed()){
            TakesScreenshot takesScreenshot= (TakesScreenshot) Driver.getDriver();

            byte[] image=takesScreenshot.getScreenshotAs(OutputType.BYTES);

            scenario.embed(image,"image/png");


        }
        Driver.closeDriver();
    }




//    @Before(value = "@storemanager", order = 1)
//    public void setupStoreManager(Scenario scenario){
//
//        System.out.println("Before for store manager");
//    }
//
//    @After(value = "@storemanager", order = 1)
//    public void tearDownStoreManager(){
//        System.out.println("After for Store Manager");
//    }
}
