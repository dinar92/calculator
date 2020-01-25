package calculator.util.converters;

/**
 * Converter from Arabic to Romain numbers.
 */
public class ArabToRomainConverter implements Converter<Integer, String> {

    private final String[] romainNumbers = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I", " "};
    private final int[] arabNumbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1, 0};

    @Override
    public String convert(Integer integer) throws Exception {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (integer > 0) {
            while (arabNumbers[i] <= integer) {
                result.append(romainNumbers[i]);
                integer -= arabNumbers[i];
            }
            i++;
        }
        return result.toString();
    }
}
