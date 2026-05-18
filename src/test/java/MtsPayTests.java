import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MtsPayTests {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = MtsOnlinePay.getDriver();
        driver.get("https://www.mts.by/");

    }


    @Test
    public void title() {
        final By COOKIE = By.xpath("//*[text()='Принять']");
        final By TITLE = By.xpath("//*[text()='Онлайн пополнение ']");
        final String EXPECTED_TITLE = "Онлайн пополнение без комиссии";

        driver.findElement(COOKIE).click();

        String actualTitle = driver.findElement(TITLE).getText().replaceAll("\n|\r\n", " ");
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, EXPECTED_TITLE, "Test failed, message not correct!");

    }

    @Test
    public void payPics() {
        final By COOKIE = By.xpath("//*[text()='Принять']");
        final By LOGO1 = By.xpath("//img[@alt='Visa']");
        final By LOGO2 = By.xpath("//img[@alt='Verified By Visa']");
        final By LOGO3 = By.xpath("//section//img[@alt='MasterCard']");
        final By LOGO4 = By.xpath("//img[@alt='MasterCard Secure Code']");
        final By LOGO5 = By.xpath("//section//img[@alt='Белкарт']");

        final String EXPECTED_LOGO1 = "Visa";
        final String EXPECTED_LOGO2 = "Verified By Visa";
        final String EXPECTED_LOGO3 = "MasterCard";
        final String EXPECTED_LOGO4 = "MasterCard Secure Code";
        final String EXPECTED_LOGO5 = "Белкарт";

        driver.findElement(COOKIE).click();
        String actualLogo1 = driver.findElement(LOGO1).getAttribute("alt");
        String actualLogo2 = driver.findElement(LOGO2).getAttribute("alt");
        String actualLogo3 = driver.findElement(LOGO3).getAttribute("alt");
        String actualLogo4 = driver.findElement(LOGO4).getAttribute("alt");
        String actualLogo5 = driver.findElement(LOGO5).getAttribute("alt");
        System.out.println(actualLogo1);
        System.out.println(actualLogo2);
        System.out.println(actualLogo3);
        System.out.println(actualLogo4);
        System.out.println(actualLogo5);
        Assert.assertEquals(actualLogo1, EXPECTED_LOGO1, "Test failed, message not correct!");
        Assert.assertEquals(actualLogo2, EXPECTED_LOGO2, "Test failed, message not correct!");
        Assert.assertEquals(actualLogo3, EXPECTED_LOGO3, "Test failed, message not correct!");
        Assert.assertEquals(actualLogo4, EXPECTED_LOGO4, "Test failed, message not correct!");
        Assert.assertEquals(actualLogo5, EXPECTED_LOGO5, "Test failed, message not correct!");
    }

    @Test
    public void servise() {
        final By COOKIE = By.xpath("//*[text()='Принять']");
        final By SERVISE = By.xpath("//*[text()='Подробнее о сервисе']");
        final String EXPECTED_URL = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

        driver.findElement(COOKIE).click();
        driver.findElement(SERVISE).click();

        String actualUrl = driver.getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl, EXPECTED_URL, "Test failed, URL is not correct!");
    }


    @Test
    public void payForm() {
        final By COOKIE = By.xpath("//*[text()='Принять']");
        final By NUMBER_INPUT = By.xpath("//input[@placeholder='Номер телефона']");
        final By MANY_INPUT = By.xpath("//input[@id='connection-sum']");
        final By EMAIL_INPUT = By.xpath("//input[@id='connection-email']");
        final By PAY_BUTTON = By.xpath("//*[@id='pay-connection']/button");

        driver.findElement(COOKIE).click();
        driver.findElement(NUMBER_INPUT).sendKeys("297777777");
        driver.findElement(MANY_INPUT).sendKeys("50");
        driver.findElement(EMAIL_INPUT).sendKeys("test1@testmail.ru");
        driver.findElement(PAY_BUTTON).click();

    }

    @AfterMethod
    public static void tearDown() {
        MtsOnlinePay.quitDriver();
    }
}
