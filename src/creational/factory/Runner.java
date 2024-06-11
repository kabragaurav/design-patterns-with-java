/**
 * @author gauravkabra
 * @since 2024
 */

public class Runner {
    public static void main(String[] args) {
        MathOperator adder = MathOperatorFactory.getMathOperator("+");
        System.out.println(adder.operate(1, 2));

        System.out.println(MathOperatorFactory.getMathOperator("-").operate(1, 2));
        System.out.println(MathOperatorFactory.getMathOperator("*").operate(1, 2));
        System.out.println(MathOperatorFactory.getMathOperator("/").operate(1, 2));
        System.out.println(MathOperatorFactory.getMathOperator("/").operate(1, 0));
        System.out.println(MathOperatorFactory.getMathOperator("//").operate(1, 0));
    }
}
