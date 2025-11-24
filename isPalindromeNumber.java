import java.util.*;
public class isPalindromeNumber{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int pali=0;
        int temp=n;
        while(n>0){
            int r=n%10;
            pali=pali*10+r;
            n/=10;
        }
        if(pali==temp) System.out.println("Palindrome number");
        else System.out.println("Not a Palindrome number");
    }
}