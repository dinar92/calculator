package calculator.util.validators;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArabNumberRangeValidatorTest {

    private final String[] allowedNumbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
    private final String[] notAllowedNumbers = {"12", "102", "1002"};
    private final Validator<String> validator = new ArabNumberRangeValidator();

    @Test
    public void whenAllowedNumbersThenIsValid() {
        for (String number :
                allowedNumbers) {
            assertTrue(validator.isValid(number));
        }
    }

    @Test
    public void whenNotAllowedNumbersThenIsNotValid() {
        for (String number :
                notAllowedNumbers) {
            assertFalse(validator.isValid(number));
        }
    }

}