import java.util.*;
public class Create_PIN_Using_Alpha_Beta_Gamma {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();

        int pin=smallDigit(a)*100+smallDigit(b)*10+smallDigit(c);
        System.out.println(pin);
    }
    public static int smallDigit(int x){
        int min=9;
        while(x>0){
            int r=x%10;
            if(r<min) min=r;
            x=x/10;
        }
        return min;
    }
}
