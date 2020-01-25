package calculator.util.converters;

import calculator.util.enums.RomainNumbers;

import java.util.HashMap;
import java.util.Map;

/**
 * Roman to Arabic numbers converter.
 */
public class TruncatedRomainToArabConverter implements Converter<RomainNumbers, Integer> {

    private final Map<RomainNumbers, Integer> numbersMap = new HashMap<>();

    {
        numbersMap.put(RomainNumbers.I, 1);
        numbersMap.put(RomainNumbers.II, 2);
        numbersMap.put(RomainNumbers.III, 3);
        numbersMap.put(RomainNumbers.IV, 4);
        numbersMap.put(RomainNumbers.V, 5);
        numbersMap.put(RomainNumbers.VI, 6);
        numbersMap.put(RomainNumbers.VII, 7);
        numbersMap.put(RomainNumbers.VIII, 8);
        numbersMap.put(RomainNumbers.IX, 9);
        numbersMap.put(RomainNumbers.X, 10);
    }

    /**
     * Converts roman to arabic number.
     * Trimmed by range from 1 to 10.
     *
     * @throws Exception if number out of range.
     */
    public Integer convert(RomainNumbers romainNumber) throws Exception {
        Integer arabNumber = this.numbersMap.get(romainNumber);
        if (arabNumber == null) {
            throw new RuntimeException("Number can't be convert to arab number system");
        }
        return arabNumber;
    }
}
