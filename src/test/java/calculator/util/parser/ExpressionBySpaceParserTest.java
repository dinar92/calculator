package calculator.util.parser;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionBySpaceParserTest {

    private final String expression = "12 + 13";
    private final ExpressionParser parser = new ExpressionBySpaceParser(expression);

    @Test
    public void whenNextThenReturnSeparatedWords() throws Exception {
        assertTrue(parser.hasNext());
        assertEquals("12", parser.next());
        assertTrue(parser.hasNext());
        assertEquals("+", parser.next());
        assertTrue(parser.hasNext());
        assertEquals("13", parser.next());
        assertFalse(parser.hasNext());
    }

}