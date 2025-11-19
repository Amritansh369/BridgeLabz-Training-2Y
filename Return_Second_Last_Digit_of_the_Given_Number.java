import java.util.*;
public class Return_Second_Last_Digit_of_the_Given_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=n/10;
        int ls=c%10;
        System.out.println(ls);
    }
}
