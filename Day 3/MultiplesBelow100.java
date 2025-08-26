import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Error: Number must be positive and less than 100.");
        } else {
            int counter = number - 1;
            System.out.println("Multiples of " + number + " below 100:");
            while (counter > 1) {
                if ((number * counter) < 100) {
                    System.out.println(number * counter);
                }
                counter--;
            }
        }
        sc.close();
    }
}
