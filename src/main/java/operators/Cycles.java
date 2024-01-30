package operators;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.StreamManager;

import java.io.BufferedReader;
import java.io.IOException;

public class Cycles {
    private static final int THE_END_OF_MULTIPLICATION_TABLE = 10;
    private static final int INCREMENT = 1;
    private static final int MULTIPLIER = 4;
    private static final int INDEX_LIMIT = 1;
    private static final int EVEN_DIVISOR = 2;
    private static final Logger LOGGER = LoggerFactory.getLogger(Cycles.class);

    public void printMultiplicationTableOfFour() {
        LOGGER.info("Output multiplication table by 4 to the console.");
        for (int i = 1; i <= THE_END_OF_MULTIPLICATION_TABLE; i++) {
            System.out.println("Multiplication table by " + MULTIPLIER + " * " + i + " = " + MULTIPLIER * i);
        }
    }

    public void printEvenNumbersUpToN() {
        LOGGER.info("Printing all even numbers from 0 to the entered number.");
        System.out.println("Enter a number:");
        int enteredNumber = 0;
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            enteredNumber = Integer.parseInt(bufferedReader.readLine());
            for (int i = 0; i < enteredNumber; i++) {
                if (i % EVEN_DIVISOR == 0) {
                    System.out.println("Even numbers from 0 to " + enteredNumber + " : " + i);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void numberFromFibonacciSequence() {
        LOGGER.info("Printing the Fibonacci number at the entered index.");
        System.out.println("Enter a number:");
        int enteredNumber = 0;
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            enteredNumber = Integer.parseInt(bufferedReader.readLine());
            int fibNumber = numberCalculationFibonacciSequence(enteredNumber);
            System.out.println("Fibonacci number with index " + enteredNumber + " = " + fibNumber);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static int numberCalculationFibonacciSequence(int index) {
        LOGGER.info("Printing each character of the entered string on a new line.");
        if (index <= INDEX_LIMIT) {
            return index;
        }
        int previousNumber = 0;
        int currentNumber = 1;
        for (int i = INCREMENT; i < index; i++) {
            int temp = previousNumber;
            previousNumber = currentNumber;
            currentNumber = temp + currentNumber;
        }
        return currentNumber;
    }

    public void calculatingTheFactorial() {
        LOGGER.info("Output multiplication table by 4 to the console.");
        System.out.println("Enter a number:");
        int enteredNumber = 0;
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            enteredNumber = Integer.parseInt(bufferedReader.readLine());
            int factorial = 1;
            for (int i = 1; i <= enteredNumber; i++) {
                factorial *= i;
            }
            System.out.println("Factorial for a number " + enteredNumber + " = " + factorial);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void printEachCharacterOnNewLine() {
        LOGGER.info("Output multiplication table by 4 to the console.");
        System.out.println("Enter your line:");
        String enteredLine = null;
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            enteredLine = bufferedReader.readLine();
            for (char charactersArray : enteredLine.toCharArray()) {
                System.out.println(charactersArray);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

