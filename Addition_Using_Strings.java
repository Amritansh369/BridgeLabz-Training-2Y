import java.util.Scanner;
public class Addition_Using_Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String num1=sc.nextLine();
        String num2=sc.nextLine(); 
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;
            int sum = digit1 + digit2 + carry;
            sb.append(sum % 10);
            carry = sum / 10;
            i--;
            j--;
    }
    System.out.println(sb.reverse().toString());
   }
}