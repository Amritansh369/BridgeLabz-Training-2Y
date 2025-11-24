import java.util.*;
public class Find_String_Code {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(char c:s.toCharArray()){
            sb.append((int)(c));
        }
        System.out.println(sb.toString());
    }
}
