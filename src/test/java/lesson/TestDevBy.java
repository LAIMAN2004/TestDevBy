package lesson;

import org.testng.annotations.DataProvider;

public class TestDevBy {
    @DataProvider(name="testValue")
    public Object[][] dataProvider(){
        return new Object[][]{
                {"test1", "26846216"},
                {"test2", "djncwwmcd"},
                {"test3", "541dwc"}
        };
    }
}
