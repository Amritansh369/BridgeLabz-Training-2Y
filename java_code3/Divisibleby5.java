import java.util.Scanner;
public class Divisibleby5{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%5==0){
            System.out.print(n+" is divisible by 5");
        }
    }
}