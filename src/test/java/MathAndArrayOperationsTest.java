import operators.ArrayOperations;
import operators.ConditionalOperators;
import operators.Cycles;
import operators.Shop;

public class MathAndArrayOperationsTest {
    private final static int[] POSITIVE_AND_NEGATIVE_NUMBERS_ARRAY = new int[0];
    private final static int[] INTEGER_ARRAY = new int[0];
    private final static int[] ARRAY_WITH_REPEATING_NUMBERS = new int[0];
    private final static int[][] MATRIX_WITH_INTEGERS_TEN_BY_TEN = new int[0][0];
    private final static int[][] MATRIX_WITH_INTEGERS_FIVE_BY_FIVE = new int[0][0];

    public static void main(String[] args) {
        ConditionalOperators conditionalOperators = new ConditionalOperators();
        conditionalOperators.compareWithTen();
        conditionalOperators.inputAndCompareTwoNumbers();
        conditionalOperators.determineTriangleType();
        conditionalOperators.numberOfNegativeAndPositiveNumbers();
        conditionalOperators.findTheLargestNumber();
        conditionalOperators.sumOfLargestAndSmallestNumber();
        conditionalOperators.evenOrOddNumber();

        Shop shop = new Shop();
        shop.processPurchase();

        Cycles cycles = new Cycles();
        cycles.printMultiplicationTableOfFour();
        cycles.printEvenNumbersUpToN();
        cycles.numberFromFibonacciSequence();
        cycles.calculatingTheFactorial();
        cycles.printEachCharacterOnNewLine();

        ArrayOperations arrayOperations = new ArrayOperations();
        arrayOperations.numberOfPositiveAndNegativeInArray(POSITIVE_AND_NEGATIVE_NUMBERS_ARRAY);
        arrayOperations.sumOfElementsAtEvenIndices(INTEGER_ARRAY);
        arrayOperations.calculateSumOfEvenNumbers(INTEGER_ARRAY);
        arrayOperations.findMaxNumberInArray(INTEGER_ARRAY);
        arrayOperations.findMostFrequentOrLargest(ARRAY_WITH_REPEATING_NUMBERS);
        arrayOperations.printDiagonalElements(MATRIX_WITH_INTEGERS_TEN_BY_TEN);
        arrayOperations.printReverseDiagonalOfMatrix(MATRIX_WITH_INTEGERS_TEN_BY_TEN);
        arrayOperations.findMaxColumnSum(MATRIX_WITH_INTEGERS_FIVE_BY_FIVE);
    }
}
