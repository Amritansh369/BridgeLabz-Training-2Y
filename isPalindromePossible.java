import java.util.*;
public class isPalindromePossible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        String s=String.valueOf(n);
        int q=s.length();
        int check[]=new int[10];
        for(int i=0;i<q;i++){
            check[s.charAt(i)-'0']++;
        }
        for(int x:check){
            if(x%2!=0) c++;
        }
        if(c>1) System.out.println("Cannot be rearranged to form a palindrome");
        else System.out.println("Can be rearranged to form a palindrome");
    }
}
