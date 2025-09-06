import java.util.Scanner;
public class canStudentVote {
     public static boolean canStudentVoteCheck(int age){
        if(age<0) return false;
        return age>=18;
     }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] ages=new int[10];
        for(int i=0;i<ages.length;i++){
            ages[i]=sc.nextInt();
            if(canStudentVoteCheck(ages[i])) System.out.println("Candidate can vote");
            else System.out.println("Candidate cannot vote");
        }
    }
}
