package calculator;

import calculator.console.ConsoleCalculator;

/**
 * The launcher of the calculator.
 */
public class Launcher {

    public static void main(String[] args) throws Exception {
        Calculator calculator = new ConsoleCalculator();
        calculator.start();
    }
}
