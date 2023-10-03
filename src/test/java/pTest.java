import org.testng.Assert;
import org.testng.annotations.Test;

public class pTest {
    @Test(priority = 1)
    public void testOne(){
        Assert.assertTrue(5==5);
    }
    @Test(priority = 2)
    public void testTwo(){
        Assert.assertEquals(2, 2);
    }
}
