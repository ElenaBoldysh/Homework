import org.example.MtsOnlinePay;
import org.example.service.MainPageService;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.DriverManager;

public class BaseTest {
    protected MainPageService mainPageService;
    @BeforeMethod
    public void startTests() {
        mainPageService = new MainPageService();
    }

    @AfterMethod
    public void stopBrowser() {
        MtsOnlinePay.quitDriver();
    }
}
