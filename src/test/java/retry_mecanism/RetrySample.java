package retry_mecanism;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetrySample implements IRetryAnalyzer {
    private int retryCount = 0;     //private means that this variable can only be accessed within this class (class:RetrySample)
    private static final int maxRetryCount = 3;  //static can be called without intiating an object of the class. final means that this variable cannot be changed after it is initialized (constant).

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("Retrying test " + result.getName() + " for the " + retryCount + " time.");
            return true;
        }
        return false;
    }
    
}
