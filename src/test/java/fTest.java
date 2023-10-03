import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.invokers.ExpectedExceptionsHolder;

public class fTest {
    @DataProvider(name = "divisionData")
    public Object[][] divisionTestData() {
        return new Object[][] {
                { 10.0f, 2.0f, 5.0f },
                { -12.0f, 3.0f, -4.0f },
                { 8.0f, -4.0f, -2.0f },
                { -15.0f, -5.0f, 3.0f },
                { 0.0f, -5.0f, 0.0f },
                { 0.0f, 5.0f, 0.0f },
//                { -15.0f, 0.0f, 0.0f }
        };
    }
    @DataProvider(name = "invalid divisionData")
    public Object[][] divisionTestInvalidData() {
        return new Object[][] {
                { 10.0f, 0.0f}
        };
    }

    @Test(dataProvider = "divisionData")
    public void testDivision(float numerator, float denominator, float expectedResult){
        Calculator calc = new Calculator();
        float result = calc.division(numerator, denominator);
        Assert.assertEquals(result, expectedResult);
    }
    @Test(dataProvider = "invalid divisionData", expectedExceptions = ArithmeticException.class)
    public void testDivisionInvalid(float numerator, float denominator){
        Calculator calc = new Calculator();
        calc.division(numerator, denominator);
    }
}
