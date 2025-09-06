import java.util.*;
public class si {
    public static float si(float p, float r, float t){
        return (p*r*t)/100;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float p=sc.nextFloat();
        float r=sc.nextFloat();
        float t=sc.nextFloat();
        float result=si(p,r,t);
        System.out.println("The Simple Interest is "+result+" for Principal "+p+",Rate of Interest "+r+" and time "+t);
    }
}
