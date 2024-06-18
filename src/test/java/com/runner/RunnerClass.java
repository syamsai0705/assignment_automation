package com.runner;

import com.base.BrowserDriverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import static com.base.BrowserDriverFactory.driver;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.stepDef"},
        dryRun =false,//Feature file compile, and it is true then step-def class is executed
//	    tags = "@Single and not @Multiple ",// specific test case @tags name are use here
        tags = "@smoke",// specific test case @tags name are use here
        monochrome = true,
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)

//implementation of cucumber and testng
public class RunnerClass extends AbstractTestNGCucumberTests {
    @BeforeSuite
    public void before_all() throws IOException {
        System.out.println("Its before all scenarios launching browser");
        FileUtils.deleteDirectory(new File(System.getProperty("user.dir") + File.separator + "Extent_reports"));
        BrowserDriverFactory.setDriver("chrome");
        BrowserDriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        BrowserDriverFactory.getDriver().manage().window().maximize();
        System.out.println("Launched Browser");


    }

    @AfterSuite
    public void after_all() {
        System.out.println("Its before all quit");
        BrowserDriverFactory.getDriver().quit();
    }
}


