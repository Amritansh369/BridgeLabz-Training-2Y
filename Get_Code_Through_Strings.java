import java.util.Scanner;
public class Get_Code_Through_Strings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();
        for (char c : s.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                char shifted = (char) ('a' + (c - 'a' + 2) % 26);
                sb.append(shifted);
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
