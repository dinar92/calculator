package calculator.util.validators;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomainNumberRangeValidatorTest {

    private final String[] allowedNumbers = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    private final String[] notAllowedNumbers = {"XI", "XXI", "C"};
    private final Validator<String> validator = new RomainNumberRangeValidator();
    
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