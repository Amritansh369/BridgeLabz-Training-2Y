import java.util.Scanner;
public class Sumofnountil0 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double total=0.0;
        double v=sc.nextDouble();
        while(v!=0){
            total+=v;
            v=sc.nextDouble();
        }
        System.out.println(total);
    }
}
