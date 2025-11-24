import java.util.*;
public class Return_Second_Word_in_Uppercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.trim().split(" ");
        if(words.length<2) System.out.println("Not possible");
        System.out.println(words[1].toUpperCase());
    }
}
