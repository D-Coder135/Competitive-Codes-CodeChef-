/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 15-09-2020
 *  Time: 01:50 PM
 */


/*
 * The Problem Code for this problem on CodeChef is --> MATHCHEF
 * */


import java.util.Scanner;

public class MathChef {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int totalTestCases = scanner.nextInt();
        int[] arrayOfOutputs = new int[0];
        for (int testCase = 1; testCase <= totalTestCases; testCase++) {
            int number = scanner.nextInt();
            int totalNumberOfQueries = scanner.nextInt();
            arrayOfOutputs = new int[totalNumberOfQueries];
            for (int queryNumber = 0; queryNumber < totalNumberOfQueries; queryNumber++) {
                int digit = scanner.nextInt();
                scanner.nextLine();
                char character = scanner.nextLine().charAt(0);
                int digitOfNumber;
                int totalSum = 0;
                String reverseNewNumber = "";
                if (character == '+') {
                    while (number != 0) {
                        digitOfNumber = number % 10;
                        int sumOperation = digitOfNumber + digit;
                        totalSum += sumOperation;
                        number = number / 10;
                        reverseNewNumber = reverseNewNumber.concat(String.valueOf(sumOperation));
                    }
                    StringBuilder newNumberInString = new StringBuilder(reverseNewNumber);
                    number = Integer.parseInt(String.valueOf(newNumberInString.reverse()));
                    arrayOfOutputs[queryNumber] = totalSum;
                } else if (character == '*') {
                    int duplicateNumber = number;
                    while (duplicateNumber != 0) {
                        digitOfNumber = duplicateNumber % 10;
                        int multiplicationOperation = digitOfNumber * digit;
                        totalSum += multiplicationOperation;
                        duplicateNumber = duplicateNumber / 10;
                    }
                    arrayOfOutputs[queryNumber] = totalSum;
                } else {
                    int duplicateNumber = number;
                    while (duplicateNumber != 0) {
                        digitOfNumber = duplicateNumber % 10;
                        int divisionOperation = digitOfNumber / digit;
                        totalSum += divisionOperation;
                        duplicateNumber = duplicateNumber / 10;
                    }
                    arrayOfOutputs[queryNumber] = totalSum;
                }
            }
            System.out.println("Test Case: " + testCase);
            for (int outputs : arrayOfOutputs) {
                System.out.println(outputs);
            }
        }
        scanner.close();
    }
}


