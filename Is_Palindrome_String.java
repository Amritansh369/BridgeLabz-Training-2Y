import java.util.Scanner;
public class Is_Palindrome_String{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        int l=0,r=n-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
                System.out.println("False");
                return;
            }
            l++;
            r--;
        }
        System.out.println("True");
    }
}
