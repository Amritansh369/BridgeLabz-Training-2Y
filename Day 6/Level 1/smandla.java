import java.util.Scanner;

public class smandla {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int sm = Integer.MAX_VALUE;
        int la = Integer.MIN_VALUE;

        if (n1 >= n2 && n1 >= n3) la = n1;
        if (n2 >= n1 && n2 >= n3) la = n2;
        if (n3 >= n1 && n3 >= n2) la = n3;
    
        if (n1 <= n2 && n1 <= n3) sm = n1;
        if (n2 <= n1 && n2 <= n3) sm = n2;
        if (n3 <= n1 && n3 <= n2) sm = n3;
        return new int[] { sm, la };  
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int[] result = findSmallestAndLargest(n1, n2, n3);
        System.out.println("Smallest = " + result[0]);
        System.out.println("Largest = " + result[1]);
    }
}
