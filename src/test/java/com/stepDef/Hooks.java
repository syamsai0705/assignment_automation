package com.stepDef;

import com.base.Util;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.testng.log4testng.Logger;
import java.io.File;
import java.io.IOException;

public class Hooks  {

	Logger log = Logger.getLogger(Hooks.class);
	//every test scenario execution before this method is executed



	//just like @beforeMethod
	@Before
	public void beforeScenario(Scenario scenario) throws InterruptedException, IOException {
		log.info("Scenario Executing Start :-"+scenario.getName());


	}

	//just like @afterMethod
	@After
	public void afterScenario(Scenario scenario)
	{
		 //validate if scenario has failed
        if(scenario.isFailed()) {
		scenario.attach(Util.takeScreenShot(), "image/png", scenario.getName());
        }
        log.info("Scenario Executing Finish :-"+scenario.getName());

	}


}
