package com.profillo.step_definitions;

import com.profillo.utitilies.ConfigurationReader;
import com.profillo.utitilies.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.hc.client5.http.impl.io.ManagedHttpClientConnectionFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private ManagedHttpClientConnectionFactory DBUtils;

    @Before
    public void setUp() {
        String browser = ConfigurationReader.get("browser");
        Driver.get().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Driver.get().manage().window().maximize();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            final byte[] screenShot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenShot, "image/png", "screenshot");
        }

        Driver.closeDriver();
    }

    @Before("@db")
    public void setupDb() {

    }

    @After("@db")
    public void closeDb() {

    }
}
