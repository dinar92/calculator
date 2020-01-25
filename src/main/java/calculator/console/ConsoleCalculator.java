package calculator.console;

import calculator.util.calculation.Calculator;
import calculator.util.converters.ArabToRomainConverter;
import calculator.util.converters.Converter;
import calculator.util.converters.TruncatedRomainToArabConverter;
import calculator.util.enums.RomainNumbers;
import calculator.util.enums.Type;
import calculator.util.parser.ExpressionBySpaceParser;
import calculator.util.parser.ExpressionParser;
import calculator.util.validators.*;
import java.util.Scanner;

/**
 * The console calculator implementation.
 */
public class ConsoleCalculator implements calculator.Calculator {

    public void start() throws Exception {
        System.out.println("Welcome to the calculator,");
        System.out.println("which can only work with Roman or Arabic numerals with a range from 1 to 10.");
        System.out.println("Allowed operations: '+', '-', '*'. '/'");
        System.out.println("Please, enter expression:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Validator<String> arabTypeValidator = new ArabTypeValidator();
        Validator<String> romainTypeValidator = new RomainTypeValidator();
        Validator<String> operationValidator = new ArithmeticOperationValidator();
        ExpressionParser parser = new ExpressionBySpaceParser(input);
        Converter<RomainNumbers, Integer> fromRomainToArab = new TruncatedRomainToArabConverter();
        Converter<Integer, String> fromArabToRomainConverter = new ArabToRomainConverter();
        Calculator calculator = new Calculator();
        Type typeOfExpression;
        int arg1;
        int arg2;
        String operation;
        int result;

        if (!operationValidator.isValid(input)) {
            throw new RuntimeException("Operation isn't allowed");
        } else if (arabTypeValidator.isValid(input)) {
            typeOfExpression = Type.ARAB;
            arg1 = Integer.parseInt(parser.next());
            operation = parser.next();
            arg2 = Integer.parseInt(parser.next());

        } else if (romainTypeValidator.isValid(input)) {
            RomainNumbers romainNumber = RomainNumbers.valueOf(parser.next());
            typeOfExpression = Type.ROMAIN;
            arg1 = fromRomainToArab.convert(romainNumber);
            operation = parser.next();
            romainNumber = RomainNumbers.valueOf(parser.next());
            arg2 = fromRomainToArab.convert(romainNumber);

        } else {
            throw new RuntimeException("Type of the expression isn't available");
        }

        result = calculator.calculate(arg1, operation, arg2);
        if (typeOfExpression == Type.ROMAIN) {
            System.out.println("Result: " + fromArabToRomainConverter.convert(result));
        } else {
            System.out.println("Result: " + result);
        }
    }
}
