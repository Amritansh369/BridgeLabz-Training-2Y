import java.util.Scanner;
public class whilebreak {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int n=sc.nextInt();
        while(true){
            if(n==0 || n<0){
                break;
            }
            sum+=n;
            n=sc.nextInt();
        }
        System.out.println(sum);
    }
}
