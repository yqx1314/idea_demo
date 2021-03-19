/**
 * @author yqx
 * @Company https://www.suning.com
 * @date 2021/3/19 19:35
 * @desc
 */
public class ComputeFactory {

    private static final Add add = new Add();
    private static final Sub sub = new Sub();

    public static Computable getCompute(String symbol) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        return (Computable) Class.forName(symbol).newInstance();
    }
}
