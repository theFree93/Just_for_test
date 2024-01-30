package operators;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import utils.StreamManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ConditionalOperators {
    private final static int COMPARISON_THRESHOLD = 10;
    private static final Logger LOGGER = LoggerFactory.getLogger(ConditionalOperators.class);
    public void compareWithTen() {
        LOGGER.info("User enters numbers into the console. Checks whether it is greater than or less than ten.");
        System.out.println("Input the first number ");
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            int inputNumber = Integer.parseInt(bufferedReader.readLine());
            if (inputNumber > COMPARISON_THRESHOLD) {
                System.out.println("That number is more than 10 ");
            } else {
                System.out.println("That number is less than 10 ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void inputAndCompareTwoNumbers() {
        LOGGER.info("A user enters two numbers into the console. Comparing them with each other.");
        System.out.println("Input the first number ");
        System.out.println("Input the second number ");
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            int firstNumber = Integer.parseInt(bufferedReader.readLine());
            int secondNumber = Integer.parseInt(bufferedReader.readLine());
            if (firstNumber > secondNumber) {
                System.out.println("The first number is greater than the second ");
            } else if (firstNumber < secondNumber) {
                System.out.println("The second number is greater than the first ");
            } else {
                System.out.println("The numbers is equal");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void determineTriangleType() {
        LOGGER.info("A user enters three numbers. Check whether they form an equilateral, isosceles or rocky triangle.");
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            System.out.println("Enter the length of side first: ");
            double firstSideLength = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Enter the length of the second side: ");
            double secondSideLength = Double.parseDouble(bufferedReader.readLine());
            System.out.println("Enter the length of the third side: ");
            double thirdSideLength = Double.parseDouble(bufferedReader.readLine());
            if (firstSideLength == secondSideLength || secondSideLength ==
                    thirdSideLength || thirdSideLength == firstSideLength) {
                System.out.println("This triangle is isosceles. ");
            } else if (firstSideLength == secondSideLength && secondSideLength == thirdSideLength) {
                System.out.println("This triangle is equilateral. ");
            } else {
                System.out.println("This triangle is different-sided. ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public void numberOfNegativeAndPositiveNumbers() {
        LOGGER.info("The user enters four numbers. Counting the number of positive and negative numbers.");
        System.out.println("Enter the first number: ");
        System.out.println("Enter the second number: ");
        System.out.println("Enter the third number: ");
        System.out.println("Enter the fourth number: ");
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            int firstNumber = Integer.parseInt(bufferedReader.readLine());
            int secondNumber = Integer.parseInt(bufferedReader.readLine());
            int thirdNumber = Integer.parseInt(bufferedReader.readLine());
            int fourthNumber = Integer.parseInt(bufferedReader.readLine());

            List<Integer> inputNumbers = new ArrayList<>();
            inputNumbers.add(firstNumber);
            inputNumbers.add(secondNumber);
            inputNumbers.add(thirdNumber);
            inputNumbers.add(fourthNumber);

            int countNegativeNumbers = 0;
            int countPositiveNumbers = 0;

            for (int number : inputNumbers) {
                if (number < 0) {
                    countNegativeNumbers++;
                } else {
                    countPositiveNumbers++;
                }
            }
            System.out.println("This is count of negative numbers " + countNegativeNumbers);
            System.out.println("This is count of positive numbers " + countPositiveNumbers);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void findTheLargestNumber() {
        LOGGER.info("The user enters three numbers. Determine the largest number among them.");
        System.out.println("Enter the first number ");
        System.out.println("Enter the second number ");
        System.out.println("Enter the third number ");
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            int firstNumber = Integer.parseInt(bufferedReader.readLine());
            int secondNumber = Integer.parseInt(bufferedReader.readLine());
            int thirdNumber = Integer.parseInt(bufferedReader.readLine());
            int maxNumber = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
            System.out.println("Highest number = " + maxNumber);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void sumOfLargestAndSmallestNumber() {
        LOGGER.info("The user enters three numbers. Calculating the sum of the largest and the smallest of them.");
        System.out.println("Enter the first number ");
        System.out.println("Enter the second number ");
        System.out.println("Enter the third number ");
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            int firstNumber = Integer.parseInt(bufferedReader.readLine());
            int secondNumber = Integer.parseInt(bufferedReader.readLine());
            int thirdNumber = Integer.parseInt(bufferedReader.readLine());
            int maxNumber = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
            int smallestNumber = Math.min(firstNumber, Math.min(secondNumber, thirdNumber));
            int sum = maxNumber + smallestNumber;
            System.out.println("Sum of the largest and smallest numbers = " + sum);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void evenOrOddNumber() {
        LOGGER.info("User enters a number. Checks whether the number is even or odd.");
        System.out.println("Enter the number ");
        try (BufferedReader bufferedReader = StreamManager.getBufferedReader()) {
            int inputNumber = Integer.parseInt(bufferedReader.readLine());
            if (inputNumber % 2 == 0) {
                System.out.println("The entered number is an even number ");
            } else {
                System.out.println("The number entered is an odd number ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}