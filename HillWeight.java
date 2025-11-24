import java.util.*;
public class HillWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int weight = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                weight += j;
            }
        }
        System.out.println(weight);
    }
}
