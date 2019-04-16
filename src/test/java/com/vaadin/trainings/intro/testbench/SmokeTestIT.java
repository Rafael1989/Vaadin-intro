package com.vaadin.trainings.intro.testbench;

import com.vaadin.flow.component.orderedlayout.testbench.VerticalLayoutElement;
import com.vaadin.testbench.TestBenchTestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmokeTestIT extends TestBenchTestCase {

    @Before
    public void setUp() throws Exception {
        setDriver(new ChromeDriver());
        getDriver().get("http://localhost:8080");
    }

    @Test
    public void verticalLayoutExists() {
        Assert.assertTrue($(VerticalLayoutElement.class).exists());
    }
}
