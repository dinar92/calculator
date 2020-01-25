package calculator.util.converters;

/**
 * Converts digit from T type to V type number system.
 * @param <T> input number.
 * @param <V> expect number.
 */
public interface Converter<T, V> {

    /**
     * @throws Exception if any error of converting.
     */
    V convert(T t) throws Exception;
}
