package calculator.util.validators;

import calculator.util.parser.ExpressionBySpaceParser;
import calculator.util.parser.ExpressionParser;

/**
 * Validator for simple expression like 'num1 (+,-,*,/) num2'
 * Works only with rage from 'I' to 'X'.
 */
public class RomainTypeValidator implements Validator<String>, SimpleExpressionValidator {

    private final Validator<String> romainNumberValidator = new RomainNumberRangeValidator();

    /**
     * Validates that the expression applies to romain type of numbers.
     *
     * @param s - input expression.
     * @return true - if expression has romain type, false - otherwise.
     */
    @Override
    public boolean isValid(String s) {
        boolean isValid = false;
        ExpressionParser parser = new ExpressionBySpaceParser(s);

        try {
            if (parser.hasNext() && romainNumberValidator.isValid(parser.next())) {
                if (parser.hasNext()) {
                    parser.next();
                    if (parser.hasNext() && romainNumberValidator.isValid(parser.next())) {
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
