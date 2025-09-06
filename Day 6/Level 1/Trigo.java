import java.util.Scanner;
public class Trigo {
    public static double[] calculateTrigonometricFunctions(double angle)
{
double radian=Math.toRadians(angle);
double sine=Math.sin(radian);
double cosine=Math.cos(radian);
double tangent=Math.tan(radian);
return new double[]{sine,cosine,tangent};
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double angle=sc.nextDouble();
        double[] result=calculateTrigonometricFunctions(angle);
        System.out.println("Sine "+result[0]);
        System.out.println("Cosine "+result[1]);
        System.out.println("Tangent "+result[2]);
    }
}
