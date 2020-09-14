/* Created By IntelliJ IDEA
 *  Author: Devansh Shukla (Devansh1352000)
 *  Date: 14-09-2020
 *  Time: 08:30 PM
 */

import java.util.Scanner;

public class PassHack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int numberOfInputs = 0; numberOfInputs < testCases; numberOfInputs++) {
            String revPassword = "";
            String password = "";
            int wrongPassword = scanner.nextInt();
            int conditionVariable = wrongPassword;
            while (conditionVariable != 0) {
                int eachDigit = conditionVariable % 10;
                conditionVariable = conditionVariable / 10;
                if (eachDigit <= 1) {
                    break;
                } else {
                    eachDigit = eachDigit - 2;
                    revPassword = revPassword.concat(String.valueOf(eachDigit));
                }
            }
            for (int reverseIndex = revPassword.length() - 1; reverseIndex >= 0; reverseIndex--) {
                password = password.concat(String.valueOf(revPassword.charAt(reverseIndex)));
            }
            int correctPassword = Integer.parseInt(password);
            System.out.println(correctPassword);
        }
        scanner.close();
    }
}
