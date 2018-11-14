package lesson;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;

    @BeforeClass
    public void initWebdriver() {
        System.setProperty("webdriver.chrome.driver",
                "src/main/resources/chromedriver243.exe");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
    }
    @AfterClass
    public void closeBrowser() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    @Test(dataProvider = "testValue",
            dataProviderClass = TestDevBy.class)
            public void testLesson(String value, String key) {
        driver.get("https://dev.by/registration");
        System.out.println(value);
        System.out.println("tst" + Keys.ENTER + "ddd");
        }

    }

