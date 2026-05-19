package org.example.page;

import org.example.MtsOnlinePay;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
    protected WebDriver driver = MtsOnlinePay.getDriver();

    protected BasePage() {
        PageFactory.initElements(driver, this);
    }
}
