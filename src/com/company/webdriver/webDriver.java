package com.company.webdriver;

import org.openqa.selenium.safari.SafariDriver;

public class webDriver {


    private SafariDriver driver;
    public String  url;

    public webDriver() {
        driver = new SafariDriver();
        url = " https://www.podium.com/";

    }
}
