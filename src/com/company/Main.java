package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello World");
        WebDriver driver = new SafariDriver();
        driver.get("https://www.podium.com/");

    }
}
