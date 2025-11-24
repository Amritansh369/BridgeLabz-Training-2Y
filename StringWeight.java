import java.util.*;
public class StringWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int weight = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch); // make case-insensitive
                weight += (ch - 'a' + 1);       // a=1, b=2, ..., z=26
            }
        }
        System.out.println(weight);
    }
}
