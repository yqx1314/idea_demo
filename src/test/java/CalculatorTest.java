import org.junit.Assert;
import org.junit.Test;

/**
 * @author yqx
 * @Company https://www.suning.com
 * @date 2021/3/19 19:00
 * @desc
 */
public class CalculatorTest {
    @Test
    public void shouldReturn2When1Plus1() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1,1,"Add");
        int expectResult = 2;
        Assert.assertEquals(expectResult,actualResult);
    }

    @Test
    public void shouldReturn0When1Sub1() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(1,1,"Sub");
        int expectResult = 0;
        Assert.assertEquals(expectResult,actualResult);
    }

    @Test
    public void shouldReturn4When2Multi2() throws IllegalAccessException, ClassNotFoundException, InstantiationException {
        Calculator calculator = new Calculator();
        int actualResult = calculator.compute(2,2,"Multi");
        int expectResult = 4;
        Assert.assertEquals(expectResult,actualResult);
    }

}