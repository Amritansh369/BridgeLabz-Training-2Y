import java.util.*;
public class Chararray {
    public static char[] userdefined(String s){
        char[] result=new char[s.length()];
        for(int i=0;i<s.length();i++){
            result[i]=s.charAt(i);
        }
    return result;
}
    public static boolean compare(char[] builtin,char[] userdefined){
        if(builtin.length!=userdefined.length){
            return false;
        }
        for(int i=0;i<builtin.length;i++){
            if(builtin[i]!=userdefined[i]){
                return false;
            }
        }
    return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] builtIn=s.toCharArray();
        char[] userdefined=userdefined(s);
        boolean result=compare(builtIn,userdefined);
        System.out.println("Manual char array: " + Arrays.toString(userdefined));
        System.out.println("Built-in char array: " + Arrays.toString(builtIn));
        System.out.println("Comparison result: " + result);
    }
}
