package calculator.util.validators;

import calculator.util.enums.RomainNumbers;

import java.util.Arrays;

/**
 * Validator of the romain numbers.
 */
public class RomainNumberRangeValidator implements Validator<String> {

    /**
     * Validates that argument is equal to one of the allowed romain numbers.
     *
     * @param s arg
     * @return true if valid, false - otherwise.
     */
    public boolean isValid(String s) {
        return Arrays.asList(RomainNumbers.values()).stream().map(n -> n.toString()).anyMatch(n -> n.equals(s));
    }
}
