package com.setpace.frontend;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.springframework.beans.factory.annotation.Autowired;
import com.setpace.frontend.config.EnvironmentProperties;
import com.setpace.frontend.pageobjects.GoogleSearchPage;

@Execution(ExecutionMode.CONCURRENT)
class GoogleTest extends TestBase {

    @Autowired
    private GoogleSearchPage littlePageObject;

    @Autowired
    private EnvironmentProperties environmentProperties;

    @Test
    void visitGoogle() throws Exception {
        driver.get(environmentProperties.getUrl());

        littlePageObject.justTesting("https://www.setpace.se/");

        if(!driver.getCurrentUrl().equalsIgnoreCase("https://www.setpace.se/")) {
            System.out.println("hej hej");
            throw new Exception("faaail");
        }
    }

    @Test
    void visitGoogleAgain() throws Exception {
        driver.get(environmentProperties.getUrl());

        littlePageObject.justTesting("https://www.google.se/");

        if(!driver.getCurrentUrl().equalsIgnoreCase("https://www.google.se/")) {
            System.out.println("hej hej");
            throw new Exception("faaail");
        }
    }
}
