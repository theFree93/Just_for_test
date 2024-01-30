package operators;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayOperations {
    public static final int EVEN_NUMBER = 2;
    private static final int MATRIX_SIZE_TEN = 10;
    private static final int MATRIX_SIZE_FIVE = 5;
    private static final int FIRST_INDEX_IN_ARRAY = 0;
    private static final Logger LOGGER = LoggerFactory.getLogger(ArrayOperations.class);

    public void numberOfPositiveAndNegativeInArray(int[] arrayNegativeAndPositiveNumbers) {
        LOGGER.info("A user passes an array of integers. Output to the console the number of positive and " +
                "negative numbers in it.");
        int countNegativeNumbers = 0;
        int counterPositiveNumbers = 0;
        int counterZero = 0;
        for (int sortNegativeAndPositiveNumbers : arrayNegativeAndPositiveNumbers) {
            if (sortNegativeAndPositiveNumbers < 0) {
                countNegativeNumbers++;
            } else if (sortNegativeAndPositiveNumbers > 0) {
                counterPositiveNumbers++;
            } else {
                counterZero++;
            }
        }
        System.out.println("Number of zeroes: " + counterZero);
        System.out.println("Number of positive  numbers: " + counterPositiveNumbers);
        System.out.println("Number of negative numbers: " + countNegativeNumbers);
    }

    public void sumOfElementsAtEvenIndices(int[] array) {
        LOGGER.info("The user passes an array with integers. Output to the console the sum " +
                "of elements with even indices");
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % EVEN_NUMBER == 0) {
                sum += array[i];
            }
        }
        System.out.println(sum);
    }

    public void calculateSumOfEvenNumbers(int[] array) {
        LOGGER.info("The user passes an array with integers. Output the sum of even elements to the console.");
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % EVEN_NUMBER == 0) {
                count += array[i];
            }
            System.out.println("Sum of even numbers = " + count);
        }
    }

    public void findMaxNumberInArray(int[] array) {
        LOGGER.info("The user passes an array of integers. Output the largest of them to the console");
        int max = array[FIRST_INDEX_IN_ARRAY];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            System.out.println("Max number in array = " + max);
        }
    }

    public Integer findMostFrequentOrLargest(int[] numbers) {
        LOGGER.info("Processing array of integers. Identifying most frequent or largest number.");
        Map<Integer, Integer> numberCounts = new HashMap<>();
        for (int number : numbers) {
            numberCounts.put(number, numberCounts.getOrDefault(number, 0) + 1);
        }

        int maxCount = 0;
        Integer maxItem = null;

        for (Map.Entry<Integer, Integer> entry : numberCounts.entrySet()) {
            if (maxItem == null || entry.getValue() > maxCount ||
                    (entry.getValue() == maxCount && entry.getKey() > maxItem)) {
                maxCount = entry.getValue();
                maxItem = entry.getKey();
            }
        }
        if (maxCount > 1) {
            System.out.println("The most frequent number: " + maxItem);
            return maxItem;
        } else {
            System.out.println("No repeating numbers were found");
            return null;
        }
    }

    public void printDiagonalElements(int[][] matrix) {
        LOGGER.info("Processing 2D array. Printing main diagonal elements.");
        int size = matrix.length;
        if (size != MATRIX_SIZE_TEN || matrix[FIRST_INDEX_IN_ARRAY].length != MATRIX_SIZE_TEN) {
            System.out.println("The matrix size have to be 10x10");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (matrix[i].length < MATRIX_SIZE_TEN) {
                System.out.println("The matrix size have to be 10x10");
                return;
            }
            System.out.println(matrix[i][i]);
        }
    }

    public void printReverseDiagonalOfMatrix(int[][] matrix) {
        LOGGER.info("Processing 2D array. Printing reverse diagonal elements.");
        int size = matrix.length;
        int lastIndex = size - 1;
        if (size != MATRIX_SIZE_TEN || matrix[FIRST_INDEX_IN_ARRAY].length != MATRIX_SIZE_TEN) {
            System.out.println("The matrix size have to be 10x10");
            return;
        }
        for (int i = 0; i < size; i++) {
            if (matrix[i].length < MATRIX_SIZE_TEN) {
                System.out.println("The matrix size have to be 10x10");
                return;
            }
            System.out.println(matrix[i][lastIndex - i]);
        }
    }


    public void findMaxColumnSum(int[][] array) {
        LOGGER.info("User passes a 5x5 array to a method calculates the sum of the numbers in each column " +
                "of a 5x5 integer array and outputs the largest sum");
        int size = array.length;
        if (size != MATRIX_SIZE_FIVE || array[FIRST_INDEX_IN_ARRAY].length != MATRIX_SIZE_FIVE) {
            System.out.println("The matrix size have to be 5x5");
            return;
        }
        int maxSum = Integer.MIN_VALUE;
        for (int j = 0; j < array[FIRST_INDEX_IN_ARRAY].length; j++) {
            int columnSum = 0;
            for (int i = 0; i < array.length; i++) {
                columnSum += array[i][j];
            }
            if (columnSum > maxSum) {
                maxSum = columnSum;
            }
        }

        System.out.println("Highest sum of numbers in the column: " + maxSum);
    }
}