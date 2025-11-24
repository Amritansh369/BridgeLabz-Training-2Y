import java.util.*;

public class Count_of_Non_Repeated_Digits_in_a_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Integer> map = new HashMap<>();
        int num=sc.nextInt();
        while (num > 0) {
            int d = (int) (num % 10);
            map.put(d, map.getOrDefault(d, 0) + 1);
            num /= 10;
        }
        int count = 0;
        for (int x : map.values()) {
            if (x == 1)
                count++;
        }
        System.out.println(count);
    }
}
