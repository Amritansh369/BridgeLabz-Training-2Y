import java.util.Scanner;
public class leapyear {
    public static boolean leapyear(int year){
        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year < 1582) System.out.println("The leap year program doesn't work");
        else{
            if(leapyear(year)) System.out.println(year+" is a leap year");
            else System.out.println("Not a leap year");
        }
    }
}
