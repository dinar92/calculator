package calculator.util.parser;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Parser for the simple expressions where the space as a separator of members.
 */
public class ExpressionBySpaceParser implements ExpressionParser {


    private final String input;
    private Iterator<String> iterator;

    public ExpressionBySpaceParser(String input) {
        this.input = input;
        this.iterator = Arrays.asList(this.input.split(" ")).iterator();
    }

    /**
     * @return the next word from the line.
     * @throws Exception if no more left words.
     */
    @Override
    public String next() throws Exception {
        return this.iterator.next();
    }

    /**
     * @return true - if the parser has any word, false - otherwise.
     */
    @Override
    public boolean hasNext() {
        return this.iterator.hasNext();
    }
}
