package calculator.util.parser;

/**
 * Retrieves values.
 */
public interface ExpressionParser {

    /**
     * Retrieves values from received input.
     *
     * @return the next retrieved value.
     */
    String next() throws Exception;

    boolean hasNext();

}
