package data_provider;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name = "dataProvider")
    public Object[][] dataProviderMethod() {
        return new Object[][] {
            { 1234, "milk" },
            { 5678, "tea" },
            { 9101, "coffee" }
        };
    }
}
