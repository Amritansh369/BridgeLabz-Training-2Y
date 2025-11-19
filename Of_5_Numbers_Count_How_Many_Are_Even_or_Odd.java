import java.util.*;
public class Of_5_Numbers_Count_How_Many_Are_Even_or_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int e=0,o=0;
        for(int i=0;i<5;i++){
            int n=sc.nextInt();
            if(n%2==0) e++;
            else o++;
        }
        System.out.println("Even "+e+" Odd "+o);
    }
}
