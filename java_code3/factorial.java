import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("User has not entered a positive Integer");
        }
        else{
            int fact=1;
            int i=1;
            while(i<=n){
                fact=fact*i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
