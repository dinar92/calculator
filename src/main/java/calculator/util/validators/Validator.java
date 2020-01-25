package calculator.util.validators;

/**
 * The validator for any expression part.
 *
 * @param <T> type to validate.
 */
public interface Validator<T> {

    /**
     * Result of validation.
     */
    boolean isValid(T t);
}
