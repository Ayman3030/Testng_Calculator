import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class GradCalculatorTest {
    @DataProvider(name = "gradeTestData")
    public Object[][] gradeTestData() {
        return new Object[][] {
                { 101, "Invalid" },
                { 100, "Excellent" },
                { 99, "Excellent" },
                { 91, "Excellent" },
                { 90, "Excellent" },
                { 89, "Very Good" },
                { 81, "Very Good" },
                { 80, "Very Good" },
                { 79, "Good" },
                { 71, "Good" },
                { 70, "Good" },
                { 69, "Accepted" },
                { 61, "Accepted" },
                { 60, "Accepted" },
                { 59, "Failed" },
                { 41, "Failed" },
                { 40, "Failed" },
                { 39, "Invalid" },
                { 1, "Invalid" },
                { 0, "Invalid" },
                { -1, "Invalid" },
                { 1000, "Invalid" },
                { -1000, "Invalid" },
        };}
        @Test(dataProvider = "gradeTestData")
        public void testGetGrade(int mark, String expectedGrade) {
            Calculator calc = new Calculator();
            String actualGrade = calc.getGrade(mark);
            Assert.assertEquals(actualGrade, expectedGrade);
        }
    }

