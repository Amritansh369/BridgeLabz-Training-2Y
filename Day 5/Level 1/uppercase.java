import java.util.*;
public class uppercase {
    public static String userdefined(String s){
        StringBuilder result=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
        if(ch >= 'a' && ch <= 'z'){
            result.append((char)(ch-32));
        }else{
            result.append(ch);
        }
    }
    return result.toString();
}
    public static boolean compare(String userdefined, String builtin){
        if(userdefined.length()!=builtin.length()){
            return false;
        }
        for(int i=0;i<builtin.length();i++){
            if(userdefined.charAt(i)!=builtin.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String builtin=s.toUpperCase();
        String userdefined=userdefined(s);
        boolean result=compare(builtin,userdefined);
        System.out.println("Manual uppercase: " + userdefined);
        System.out.println("Built-in uppercase: " + builtin);
        System.out.println("Comparison result: " + result);
    }
}
