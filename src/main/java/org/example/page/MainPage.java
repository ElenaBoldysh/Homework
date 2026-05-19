package org.example.page;

import org.example.utils.Waiter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends BasePage{
    @FindBy(xpath = "//*[text() = 'Принять']")
    private List<WebElement> cookieButton;
    @FindBy(xpath = "//*[text()='Онлайн пополнение ']")
    private WebElement title;

    @FindBy(xpath = "//img[@alt='Visa']")
    private WebElement picVisa;
    @FindBy(xpath = "//img[@alt='Verified By Visa']")
    private WebElement picByVisa;
    @FindBy(xpath = "//section//img[@alt='MasterCard']")
    private WebElement picMasterCrd;
    @FindBy(xpath = "//img[@alt='MasterCard Secure Code']")
    private WebElement picMasterSecure;
    @FindBy(xpath = "//section//img[@alt='Белкарт']")
    private WebElement picBelCard;

    @FindBy(xpath = "//input[@placeholder='Номер телефона']")
    public static WebElement numberInput;
    @FindBy(xpath = "//input[@id='connection-sum']")
    private static WebElement manyInput;
    @FindBy(xpath = "//input[@id='connection-email']")
    private static WebElement emailInput;
    @FindBy(xpath = "//*[@id='pay-connection']/button")
    private static WebElement payButton;
    @FindBy(css = "iframe.bepaid-iframe")
    private WebElement payFrame;

    public MainPage openPage(String url) {
        driver.get(url);
        return this;
    }

    public MainPage acceptCookie() {
        if (!cookieButton.isEmpty()) {
            cookieButton.get(0).click();
            Waiter.waitElementToBeInvisible(cookieButton.get(0));
        }
        return this;
    }

    public String chekTitle() {
        return  title.getText().replaceAll("\n|\r\n", " ");
    }

    public MainPage chekPicVisa(String src) {
       picVisa.findElement((By) picVisa).getAttribute("alt");
        return this;
    }

    public MainPage chekPicByVisa(String src) {
        picByVisa.findElement((By) picByVisa).getAttribute("alt");
        return this;
    }

    public MainPage chekPicMasterCrd(String src) {
        picMasterCrd.findElement((By) picMasterCrd).getAttribute("alt");
        return this;
    }

    public MainPage chekPicMasterSecure(String src) {
        picMasterSecure.findElement((By) picMasterSecure).getAttribute("alt");
        return this;
    }
    public MainPage chekPicBelCard(String src) {
        picBelCard.findElement((By) picBelCard).getAttribute("alt");
        return this;
    }

    public MainPage inputNumber(String number) {
        numberInput.sendKeys(number);
        return this;
    }

    public MainPage inputMany(String sum) {
        manyInput.sendKeys(sum);
        return this;
    }

    public MainPage inputEmail(String email) {
        emailInput.sendKeys(email);
        return this;
    }

    public MainPage clickPayButton() {
        payButton.click();
        return this;
    }

    public String getFrameLink() {
        return payFrame.getAttribute("src");
    }
}
