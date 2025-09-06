import java.util.Scanner;
public class sumofn {
    public static int sum(int n){
        if(n==1) return 1;
        return n+sum(n-1);
    }
    public static int sum2(int n){
        return (n*(n+1))/2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0) System.out.println("Not a Natural number");
        else{
            int recResult=sum(n);
            int formulaResult=sum2(n);
            System.out.println("Sum using recursion "+recResult);
            System.out.println("Sum using formula "+formulaResult);
            if(recResult==formulaResult) System.out.println("Both methods give the same result");
            else System.out.println("The result of both methods are different");
        }
    }
}
