package org.example.utils;

import org.example.MtsOnlinePay;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Waiter {
    public final static int WAIT_3_SECONDS = 3;

    public static Boolean waitElementToBeInvisible (WebElement element) {
        return new WebDriverWait(MtsOnlinePay.getDriver(), Duration.ofSeconds(WAIT_3_SECONDS))
                .until(ExpectedConditions.invisibilityOf(element));
    }
}
