/**
 * Classes are make inner, since not needed by anyone outside this class
 * 
 * @author gauravkabra
 * @since 2024
 */


public class MathOperatorFactory {

    public static MathOperator getMathOperator(String op) {
        switch (op) {
            case "+": 
                return new Adder();
            case "-": 
                return new Subtractor();
            case "*": 
                return new Multiplier();
            case "/": 
                return new Divider();
            default: 
                throw new UnsupportedOperationException("Unsupported operator symbol");
        }
    }
    
    private static class Adder implements MathOperator {
        @Override
        public int operate(int x, int y) {
            return x + y;
        }
    }

    private static class Subtractor implements MathOperator {
        @Override
        public int operate(int x, int y) {
            return x - y;
        }
    }


    private static class Multiplier implements MathOperator {
        @Override
        public int operate(int x, int y) {
            return x * y;
        }
    }

    private static class Divider implements MathOperator {
        @Override
        public int operate(int x, int y) {
            if (0 == y) {
                throw new UnsupportedOperationException("Division by 0 is not allowed");
            }
            return x / y;
        }
    }


}
