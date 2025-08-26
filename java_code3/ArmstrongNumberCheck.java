import java.util.Scanner;
public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;
        int originalNumber = number;
        
        // Loop to extract each digit and compute its cube
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get last digit
            sum += digit * digit * digit;    // Cube the digit and add to sum
            originalNumber /= 10;            // Remove last digit
        }

        // Check Armstrong condition and print result
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close();
    }
}
