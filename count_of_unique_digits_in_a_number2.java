import java.util.Scanner;
public class count_of_unique_digits_in_a_number2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),c=0;
        int len=(int)Math.log10(n)+1;
        boolean arr[]=new boolean[10];
        while(n>0){
            int r=n%10;
            if(!arr[r]){
                arr[r]=true;
                c++;
            }
            n/=10;
        }
        System.out.println(c);
}
}
