import java.util.*;
public class Splittext2 {
    public static int myLength(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            c++;
        }
        return c;
    }
    public static String[] mySplit(String s) {
        int n = myLength(s);
        int wordCount = 1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                wordCount++;
            }
        }
        String[] words = new String[wordCount];
        StringBuilder current = new StringBuilder();
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == ' ') {
                words[index] = current.toString();
                index++;
                current = new StringBuilder();
            } else {
                current.append(s.charAt(i));
            }
        }
        words[index] = current.toString(); 
        return words;
    }
    public static String[][] wordWithLength(String[] words) {
        int n = words.length;
        String[][] result = new String[n][2];
        for (int i = 0; i < n; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(myLength(words[i]));
        }
        return result;
    }
    public static int[] findShortestAndLongest(String[][] wordInfo) {
        int n = wordInfo.length;
        int minIndex = 0, maxIndex = 0;
        int minLen = Integer.parseInt(wordInfo[0][1]);
        int maxLen = Integer.parseInt(wordInfo[0][1]);
        for (int i = 1; i < n; i++) {
            int len = Integer.parseInt(wordInfo[i][1]);
            if (len < minLen) {
                minLen = len;
                minIndex = i;
            }
            if (len > maxLen) {
                maxLen = len;
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();
        String[] words = mySplit(text);
        String[][] wordInfo = wordWithLength(words);
        int[] result = findShortestAndLongest(wordInfo);
        System.out.println("Shortest Word: " + wordInfo[result[0]][0] +
                           " (Length = " + wordInfo[result[0]][1] + ")");
        System.out.println("Longest Word: " + wordInfo[result[1]][0] +
                           " (Length = " + wordInfo[result[1]][1] + ")");
    }
}
