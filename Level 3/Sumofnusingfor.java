import java.util.Scanner;
public class Sumofnusingfor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        int sum = 0;
        if (n <= 0) {
            System.out.println("Error: The number is not a natural number.");
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int sum2 = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + sum2);
            if (sum == sum2) {
                System.out.println("Both methods produce the same result. The computation is correct.");
            } else {
                System.out.println("The results are different. Please check the computation.");
            }
        }
        sc.close();
    }
}
