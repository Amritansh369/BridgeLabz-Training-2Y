import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        int temp = Math.abs(number);
        
        while (temp != 0) {
            temp = temp / 10;
            count++;
        }

        if (number == 0) {
            count = 1;
        }

        System.out.println(count);
        sc.close();
    }
}
