import java.util.*;
public class Is_N_an_Exact_Multiple_of_M {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(n%m==0) System.out.println(n+" is an exact multiple of "+m);
    }
}
