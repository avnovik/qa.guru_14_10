package qa.guru.allure;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.webdriver;
import static io.qameta.allure.Allure.attachment;
import static io.qameta.allure.Allure.step;

public class AttachmentsTest extends BaseTestConfig {

    private static final String REPOSITORY = "avnovik/qa.guru_14_10";

    @Test
    public void testLambdaAttachments() {
        step("Открываем главную страницу", () -> {
            open("https://github.com/");
            attachment("Sourse", webdriver().driver().source());
        });
    }

    @Test
    public void testAnnotatedAttachments() {
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.takeScreenshot();
    }
}
