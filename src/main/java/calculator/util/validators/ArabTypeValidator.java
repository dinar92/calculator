package calculator.util.validators;

import calculator.util.parser.ExpressionParser;
import calculator.util.parser.ExpressionBySpaceParser;

/**
 * Validator for simple expression like 'num1 (+,-,*,/) num2'
 * Works only with rage from '1' to '10'.
 */
public class ArabTypeValidator implements Validator<String>, SimpleExpressionValidator {

    private final Validator<String> arabNumberValidator = new ArabNumberRangeValidator();

    /**
     * Validates that the expression applies to arab type of numbers.
     *
     * @param s - input expression.
     * @return true - if expression has arab type, false - otherwise.
     */
    @Override
    public boolean isValid(String s) {
        boolean isValid = false;
        ExpressionParser parser = new ExpressionBySpaceParser(s);

        try {
            if (parser.hasNext() && arabNumberValidator.isValid(parser.next())) {
                if (parser.hasNext()) {
                    parser.next();
                    if (parser.hasNext() && arabNumberValidator.isValid(parser.next())) {
                        if (!parser.hasNext()) {
                            isValid = true;
                        }
                    }
                }
            }


        } catch (Exception e) {
            return isValid;
        }
        return isValid;
    }
}
