package creditcardvalidation;

import java.util.Scanner;

public class CreditCardValidation {

    // Method to check if card is valid
    public static boolean isValid(Long number) {
        int size = getSize(number);
        if (size < 13 || size > 16) {
            return false;
        }

        if (!(prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37) || prefixMatched(number, 6))) {
            return false;
        }

        int sumEven = sumOfDoubleEvenPlace(number);
        int sumOdd = sumOfOddPlace(number);

        return (sumEven + sumOdd) % 10 == 0;
    }

    // Sum of double even place digits
    public static int sumOfDoubleEvenPlace(Long number) {
        int sum = 0;
        String numStr = number.toString();
        for (int i = numStr.length() - 2; i >= 0; i -= 2) {
            int digit = Integer.parseInt(numStr.substring(i, i + 1));
            int doubled = digit * 2;
            sum += getDigit(doubled);
        }
        return sum;
    }

    // Return single digit or sum of digits if it's two digits
    public static int getDigit(int number) {
        if (number > 9) {
            return (number / 10) + (number % 10);
        } else {
            return number;
        }
    }

    // Sum of odd place digits
    public static int sumOfOddPlace(Long number) {
        int sum = 0;
        String numStr = number.toString();
        for (int i = numStr.length() - 1; i >= 0; i -= 2) {
            int digit = Integer.parseInt(numStr.substring(i, i + 1));
            sum += digit;
        }
        return sum;
    }

    // Check if prefix matches
    public static boolean prefixMatched(Long number, int d) {
        String prefix = getPrefix(number, getSize((long) d)).toString();
        return prefix.equals(String.valueOf(d));
    }

    // Get number of digits
    public static int getSize(Long d) {
        return d.toString().length();
    }

    // Get the prefix of the number
    public static Long getPrefix(Long number, int k) {
        String numStr = number.toString();
        if (numStr.length() < k) {
            return number;
        } else {
            return Long.valueOf(numStr.substring(0, k));
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a credit card number: ");
        Long cardNumber = input.nextLong();

        boolean valid = isValid(cardNumber);

        if (valid) {
            System.out.println("The credit card number " + cardNumber + " is valid.");
        } else {
            System.out.println("The credit card number " + cardNumber + " is invalid.");
        }

        input.close();
    }
}
