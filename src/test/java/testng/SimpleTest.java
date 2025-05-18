package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SimpleTest {
    @BeforeSuite
    public void setUp() {
        System.out.println("Before Suite method");
    }

    @AfterSuite
    public void tearDown() {
        System.out.println("After Suite method");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test method");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class method");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class method");
    }

    @Test
    public void testMethod() {
        System.out.println("simple testing method");
    }



}
