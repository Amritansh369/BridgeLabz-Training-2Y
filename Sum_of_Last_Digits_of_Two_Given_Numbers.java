import java.util.*;
public class Sum_of_Last_Digits_of_Two_Given_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int c1=n1%10;
        int c2=n2%10;
        int sum=c1+c2;
        System.out.println(sum);
    }
}
