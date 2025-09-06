import java.util.Scanner;
public class athlete {
    public static int rounds(int s1, int s2, int s3, int d){
        int peri=s1+s2+s3;
        int rounds=d/peri;
        return rounds;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int d=5;
        System.out.println(rounds(s1,s2,s3,d));
    }
}
