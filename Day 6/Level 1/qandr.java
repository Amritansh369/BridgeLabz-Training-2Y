import java.util.Scanner;
public class qandr {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        if(divisor==0){
        System.out.println("Error: Division by zero is not allowed."); 
        return null;
    }
        int quotient=number/divisor;
        int remainder=number%divisor;
        return new int[] {quotient,remainder};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int divisor=sc.nextInt();
        int[] result=findRemainderAndQuotient(number, divisor);
        System.out.println("Quotient "+result[0]);
        System.out.println("Remainder "+result[1]);
    }
}
