import java.util.Scanner;
public class lowercase {
    public static String userdefined(String s){
    StringBuilder result=new StringBuilder();
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='A' && ch<='Z'){
            result.append((char)(ch+32));
        }
        else{
            result.append(ch);
        }
    }
    return result.toString();
    }
    public static boolean compare(String userdefined,String builtin){
        if(userdefined.length()!=builtin.length()){
            return false;
        }
        for(int i=0;i<userdefined.length();i++){
            if(userdefined.charAt(i)!=builtin.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String builtin=s.toLowerCase();
        String userdefined=userdefined(s);
        boolean compare=compare(userdefined, builtin);
        System.out.println("Builtin lowercase "+builtin);
        System.out.println("Userdefined lowercase "+userdefined);
        System.out.println("Comparison result "+compare);
    }
}
