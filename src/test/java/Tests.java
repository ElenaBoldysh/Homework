public class Tests {
    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = MtsOnlinePay.getDriver();
        driver.get("https://www.mts.by/");
    }
}
