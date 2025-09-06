import java.util.*;

public class NumberChecker3 {

    public static int countDigits(int num) {
        return String.valueOf(Math.abs(num)).length();
    }

    public static int[] getDigitsArray(int num) {
        String str = String.valueOf(Math.abs(num));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigitsArray(num);
        int[] reversed = reverseArray(digits);

        System.out.println("Number of digits: " + countDigits(num));
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Reversed array: " + Arrays.toString(reversed));
        System.out.println("Arrays equal? " + areArraysEqual(digits, reversed));
        System.out.println("Is Palindrome? " + isPalindrome(num));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));

        sc.close();
    }
}
