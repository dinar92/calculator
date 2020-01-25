package calculator.util.validators;

import calculator.util.parser.ExpressionBySpaceParser;
import calculator.util.parser.ExpressionParser;

import java.util.Arrays;
import java.util.List;

public class ArithmeticOperationValidator implements Validator<String>, SimpleExpressionValidator {

    private final List<String> allowedOperations = Arrays.asList("+", "-", "*", "/");


    @Override
    public boolean isValid(String s) {
        boolean isValid = false;
        ExpressionParser parser = new ExpressionBySpaceParser(s);

        try {
            if (parser.hasNext()) {
                parser.next();
                if (parser.hasNext()) {
                    String operation = parser.next();
                    isValid = allowedOperations.stream().anyMatch(o -> o.equals(operation));
                }

            }
        } catch (Exception e) {
            isValid = false;
        }
        return isValid;
    }
}
