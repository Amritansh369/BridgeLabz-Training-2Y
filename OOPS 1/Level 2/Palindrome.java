public class Palindrome {
    public static class palindrome{
        String text;
        public void check(String text){
            int n=text.length();
            StringBuilder sb=new StringBuilder();
            for(int i=n-1;i>=0;i--){
                sb.append(text.charAt(i));
            }
            if(sb.toString().equals(text)) System.out.println("Palindrome");
            else System.out.println("Not a Palindrome");
        }
    }
    public static void main(String[] args) {
        palindrome p=new palindrome();
        p.text="racecar";
        p.check(p.text);
    }
}
