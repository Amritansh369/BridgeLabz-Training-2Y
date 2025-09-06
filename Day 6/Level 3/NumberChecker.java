import java.util.*;
public class NumberChecker {
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
    public static boolean isDuckNumber(int[] digits) {
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }
    public static boolean isArmstrong(int num) {
        int[] digits = getDigitsArray(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }
    public static int[] findTwoLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                secondLargest = largest;
                largest = d;
            } else if (d > secondLargest && d != largest) {
                secondLargest = d;
            }
        }
        return new int[]{largest, secondLargest};
    }
    public static int[] findTwoSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                secondSmallest = smallest;
                smallest = d;
            } else if (d < secondSmallest && d != smallest) {
                secondSmallest = d;
            }
        }
        return new int[]{smallest, secondSmallest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int count = countDigits(num);
        int[] digits = getDigitsArray(num);

        System.out.println("Number of digits: " + count);
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(num));

        int[] largest = findTwoLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = findTwoSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);

        sc.close();
    }
}
