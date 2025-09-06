import java.util.Scanner;
public class fiveNumbers {
    public static boolean isPositive(int n){
        return n>0;
    }
    public static boolean isEven(int n){
        return n%2==0;
    }
    public static int isCompare(int n1,int n2){
        if(n1>n2) return 1;
        else if(n2==n1) return 0;
        else return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter five numbers:");
        int numbers[]=new int[5];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        for(int i=0;i<numbers.length;i++){
            if(isPositive(numbers[i])){
                if(isEven(numbers[i])) System.out.println(numbers[i]+" is positive and even");
                else if(!isEven(numbers[i])) System.out.println(numbers[i]+" is positive and odd");
            }
            else{
                System.out.println(numbers[i]+" is negative");
            }
        }
        int compare=isCompare(numbers[0], numbers[numbers.length-1]);
        System.out.println();
        System.out.println("Comparing first " + "("+numbers[0]+")" +" and last "+ "("+numbers[numbers.length-1]+")"+":");
        if(compare==1){
            System.out.println("First is equal to last");
        }
        else if(compare==-1) System.out.println("First is not equal to last");
        else System.out.println("Both are equal");
    }
}
