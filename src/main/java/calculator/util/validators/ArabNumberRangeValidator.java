package calculator.util.validators;

import java.util.Arrays;

/**
 * Validator of the arab numbers.
 */
public class ArabNumberRangeValidator implements Validator<String> {

    /**
     * Validates that argument is equal to one of the allowed arab numbers.
     *
     * @param s arg
     * @return true if valid, false - otherwise.
     */
    public boolean isValid(String s) {
        return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).stream().anyMatch(n -> n == Integer.parseInt(s));
    }
}
