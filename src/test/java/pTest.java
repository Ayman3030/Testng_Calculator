import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class pTest {
    @BeforeClass
    public void printBCStatus(){
        System.out.println("Class is started");
    }
    @BeforeMethod
    public void printBStatus(ITestResult result){
        System.out.println("Starting  " + result.getMethod().getMethodName());
    }
    @AfterMethod
    public void printStatus(ITestResult result){
        System.out.println("Finishing  " + result.getMethod().getMethodName());
    }
    @Test(priority = 1)
    public void testOne(){
//        throw new SkipException("skip exception");
        Assert.assertTrue(5==5);
    }
    @Test(priority = 2)
    public void testTwo(){
        Assert.assertEquals(2, 2);
    }
}
