package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

import data.Product;

public class AssertTest {
    @Test
    public void testMethod() {
        Assert.assertEquals("actual result","actual result"); // This will pass if actual = expected
        Product actual = new Product("milk", 1000);
        Product expected = new Product("milk", 10000);
        Assert.assertEquals(actual, expected);
    }
}
