import java.util.*;
public class Substringcompare {
    public static String create(String s, int start, int end){
        String r="";
        for(int i=start;i<end;i++){
            r+=s.charAt(i);
        }
        return r;
    }
    public static boolean compare(String r, String s1){
        if(r.length()!=s1.length()){
            return false;
        }
        for(int i=0;i<r.length();i++){
            if(r.charAt(i)!=s1.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(); 
        int start=sc.nextInt();
        int end=sc.nextInt();
        System.out.println(create(s,start,end));
        String s1=s.substring(start,end);
        String manual=create(s,start,end);
        System.out.println("Manual Substring "+manual);
        System.out.println("Built-in Substring "+s1);
        System.out.println("Comparison result "+compare(manual,s1));
        sc.close();
    }
}
