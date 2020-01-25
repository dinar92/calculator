package calculator.util.calculation;

/**
 * The simple for working with integers.
 */
public class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }

    public int mult(int a, int b) {
        return a * b;
    }

    public int div(int a, int b) {
        return a / b;
    }

    /**
     * Calculates simple expression.
     *
     * @param a         - first argument.
     * @param operation - an operation on integers (+,-,*,/).
     * @param b         - second argument.
     * @return - a result of expression.
     * @throws if an operation not support.
     */
    public int calculate(int a, String operation, int b) throws Exception {
        int result = 0;
        switch (operation) {
            case "+":
                result = this.sum(a, b);
                break;
            case "-":
                result = this.sub(a, b);
                break;
            case "*":
                result = this.mult(a, b);
                break;
            case "/":
                result = this.div(a, b);
                break;
            default:
                throw new RuntimeException("The operation" + operation + " isn't available.");
        }

        return result;
    }
}
