package qa.guru.allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;

public class BaseTestConfig {
    @BeforeAll
    static void configure() {
        SelenideLogger.addListener("allure", new AllureSelenide());
    }
}
