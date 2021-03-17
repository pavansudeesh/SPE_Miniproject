package Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest
{
    private Calculator calculator;

    @Before
    public void setUp()
    {
        calculator = new Calculator();
    }

    @Test
    public void testsqrt()
    {
        double a = 25;
        double expectedResult = 5.0;
        double result = calculator.sqrt(a);
        Assert.assertEquals(expectedResult, result,0.00005);
    }

    @Test
    public void testfactorial() {
        int a = 6;
        int expectedResult = 720;
        int result = calculator.factorial(a);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testln() {
        double a = 9;
        double expectedResult = 2.197225;
        double result = calculator.ln(a);
        Assert.assertEquals(expectedResult, result,0.0000005);
    }

    @Test
    public void testpower() {
        double a = 3;
        double b = 2;
        double expectedResult = 9.0;
        double result = calculator.pow(a, b);
        Assert.assertEquals(expectedResult, result,0.000000005);
    }
    @Test
    public void testsqrt_1()
    {
        double a = 27;
        double expectedResult = 5.0;
        double result = calculator.sqrt(a);
        Assert.assertNotEquals(expectedResult, result,0.00005);
    }
    @Test
    public void testln_1() {
        double a = 8;
        double expectedResult = 2.197225;
        double result = calculator.ln(a);
        Assert.assertNotEquals(expectedResult, result,0.0000005);
    }



    //@Test(expected = IllegalArgumentException.class)
    //blic void testDivideByZero() {
    //   double a = 1;
    //   double b = 0;
    //    calculator.divide(a, b);
    //}
}
