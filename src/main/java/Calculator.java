/**
 * @author yqx
 * @Company https://www.suning.com
 * @date 2021/3/19 18:01
 * @desc
 */
public class Calculator {

    public int compute(int num1, int num2, char symbol) {
        Computable computable = ComputeFactory.getCompute(symbol);
        return computable.compute(num1,num2);
    }
}
