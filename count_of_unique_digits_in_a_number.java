import java.util.HashSet;
import java.util.Scanner;
public class count_of_unique_digits_in_a_number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();
        while(n>0){
            int r=n%10;
            set.add(r);
            n=n/10;
        }
        System.out.println(set.size());
    }
}
