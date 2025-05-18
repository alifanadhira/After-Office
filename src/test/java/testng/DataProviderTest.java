package testng;

import org.testng.annotations.Test;

import data_provider.DataProviderClass;

public class DataProviderTest {
    @Test
    (dataProvider = "dataProvider", dataProviderClass = DataProviderClass.class)  //Called from DataProviderClass
    public void testMethod(int productId, String productName) {
        System.out.println("ID: " + productId + ", Name: " + productName);
    }
}
