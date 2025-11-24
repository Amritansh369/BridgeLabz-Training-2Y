import java.util.Scanner;
public class count_of_all_digits_in_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        while(n>0){
            int r=n%10;
            x++;
            n=n/10;
        }
        System.out.println(x);
    }
}
