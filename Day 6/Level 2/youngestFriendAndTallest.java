import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class youngestFriendAndTallest{
    public static int youngestBasedOnAge(int[] ages){
        int minindex=0;
        for(int i=0;i<ages.length;i++){
            if(ages[i]<ages[minindex]){
                minindex=i;
            }
        }
        return minindex;
    }
    public static int tallestBasedOnHeight(int[] heights){
        int maxindex=0;
        for(int i=0;i<heights.length;i++){
            if(heights[i]>heights[maxindex]) maxindex=i;
        }
        return maxindex;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String names[]={"Amar","Akbar","Anthony"};
        int[] ages=new int[3];
        int[] heights=new int[3];
        for(int i=0;i<ages.length;i++){
            System.out.print("Age of "+names[i]+" is: ");
            ages[i]=sc.nextInt();
        }
        for(int i=0;i<heights.length;i++){
            System.out.print("Height of "+names[i]+" is: ");
            heights[i]=sc.nextInt();
        }
        int youngestAgeIndex=youngestBasedOnAge(ages);
        int tallestBoyIndex=tallestBasedOnHeight(heights);
        System.out.println("Youngest boy "+names[youngestAgeIndex]);
        System.out.println("Tallest boy "+names[tallestBoyIndex]);
    }
} 