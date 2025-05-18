package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest {

    public static int count = 0; //This variable is used to keep track of the number of retries.

    @Test(retryAnalyzer = retry_mecanism.RetrySample.class) //The retryAnalyzer attribute is used to specify the class that implements the retry logic.
    public void flackyTest() {
        count++;
        System.out.println("Test method executed " + count + " times");
        Assert.assertTrue(count > 2); //Retry will stop if the count is greater than 2.
    }
}
