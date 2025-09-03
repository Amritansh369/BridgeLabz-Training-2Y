import java.util.*;
public class Splittext1 {
    public static int len(String s){
        int c=0;
        for(int i=0;i<s.length();i++){
            c++;
        }
        return c;
    }
    public static String[] userdefined(String s){
        int n=len(s);
        int wordCount=1;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                wordCount++;
            }
        }
        String[] words=new String[wordCount];
        StringBuilder count=new StringBuilder();
        int index=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==' '){
                words[index]=count.toString();
                index++;
                count=new StringBuilder();
            }
            else{
                count.append(s.charAt(i));
            }
            words[index]=count.toString();
        }
        return words;
    }
    public static boolean compare(String[] userdefined,String[] builtin){
        if(userdefined.length!=builtin.length){
            return false;
        }
        for(int i=0;i<userdefined.length;i++){
            if(!userdefined[i].equals(builtin[i])){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] builtin=s.split(" ");
        String[] userdefined=userdefined(s);
        boolean compare=compare(userdefined,builtin);
        System.out.println("Builtin "+Arrays.toString(builtin));
        System.out.println("User defined "+Arrays.toString(userdefined));
        System.out.println("Comparison result "+compare);   
    }
}
