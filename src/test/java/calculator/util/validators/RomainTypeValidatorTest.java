package calculator.util.validators;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomainTypeValidatorTest {

    private final String correctExpression = "I + I";
    private final String incorrectExpression = "1 + I";
    private final String outOfRange = "XI - I";
    private final Validator<String> validator = new RomainTypeValidator();

    @Test
    public void whenCorrectInputThenIsValid() {
        assertTrue(validator.isValid(correctExpression));
    }

    @Test
    public void whenIncorrectInputThenNotIsValid() {
        assertFalse(validator.isValid(incorrectExpression));
    }

    @Test
    public void whenNumberOutOfRangeThenIsNotValid() {
        assertFalse(validator.isValid(outOfRange));
    }

}
