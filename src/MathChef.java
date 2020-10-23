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
        int[] arrayOfOutputs = new int[totalTestCases];
        for (int testCase = 1; testCase <= totalTestCases; testCase++) {
            int number = scanner.nextInt();
            int totalNumberOfQueries = scanner.nextInt();
            for (int queryNumber = 1; queryNumber <= totalNumberOfQueries; queryNumber++) {
                int digit = scanner.nextInt();
                scanner.nextLine();
                char character = scanner.nextLine().charAt(0);
                int digitOfNumber = 0;
                int totalSum = 0;
                String reverseNewNumber = "";
                if (character == '+') {
                }
            }
        }
    }
}
