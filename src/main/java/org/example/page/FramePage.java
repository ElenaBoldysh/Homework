package org.example.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class FramePage extends BasePage {
    @FindBy(xpath = "//span[@class='ng-star-inserted']")
    public WebElement amountToBePaid;
    @FindBy(xpath = "//span[@class='pay-description__text']")
    public WebElement numberToBePaid;
    @FindBy(xpath = "//span[@class='ng-tns-c2312288139-2 ng-star-inserted']")
    public WebElement cardNumber;
    @FindBy(xpath = "//span[@class='ng-tns-c2312288139-4 ng-star-inserted']")
    public WebElement validityPeriod;
    @FindBy(xpath = "//span[@class='ng-tns-c2312288139-5 ng-star-inserted']")
    public WebElement cvc;
    @FindBy(xpath = "//span[@class='ng-tns-c2312288139-3 ng-star-inserted']")
    public WebElement nameOnTheCard;
    @FindBy(xpath = "//span[@class='icons-container ng-tns-c2312288139-2']")
    public WebElement picOfPaySyst;
}
