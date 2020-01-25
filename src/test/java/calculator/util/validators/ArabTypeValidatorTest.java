package calculator.util.validators;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArabTypeValidatorTest {

    private final String correctExpression = "6 - 4";
    private final String incorrectExpression = "a = c";
    private final String outOfRangeExpression = "11 + 32";
    private final Validator<String> validator = new ArabTypeValidator();

    @Test
    public void whenCorrectThenIsValid() {
        assertTrue(validator.isValid(correctExpression));
    }

    @Test
    public void whenIncorrectThenIsNotValid() {
        assertFalse(validator.isValid(incorrectExpression));
    }

    @Test
    public void whenOutOfRangeThenIsNotValid() {
        assertFalse(validator.isValid(outOfRangeExpression));
    }
}