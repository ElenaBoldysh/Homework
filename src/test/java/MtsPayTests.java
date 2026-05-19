import jdk.jfr.Description;
import org.example.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.example.utils.Constants.EXPECTED_RESULT;
import static org.example.utils.Constants.EXPECTED_TITLE;

public class MtsPayTests extends BaseTest{

    @DataProvider(name = "correct values for test")
    public Object[][] getCorrectValues() {
            return new Object[][]{
                    {"297777777", "50", "1123@mail.ru"},
                    {"297777777", "7", "try@mail.ru"},
                    {"297777777", "550", "Try@mail.ru"}
            };
    }

    @Test(testName = "Проверка заголовка формы оплаты")
    public void title() {
        String actualTitle = mainPageService.openPageAndAcceptCookie()
                        .getNameTitle();
        System.out.println(actualTitle);
        Assert.assertEquals(actualTitle, EXPECTED_TITLE, "Test failed, message not correct!");
    }

   @Test(testName = "Test correct values", dataProvider = "correct values for test")
    @Description("Заполнение формы оплаты")
    public void payForm(String number, String sum, String email) {
        mainPageService.openPageAndAcceptCookie()
                .inputCorrectValues(number, sum, email);
   }

}
