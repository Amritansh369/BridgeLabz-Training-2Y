import java.util.Scanner;

public class CharFrequency {
    static String[][] charFrequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        String[][] result = new String[s.length()][2];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freq[c] != 0) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                freq[c] = 0;
                index++;
            }
        }
        String[][] finalResult = new String[index][2];
        for (int i = 0; i < index; i++) {
            finalResult[i][0] = result[i][0];
            finalResult[i][1] = result[i][1];
        }
        return finalResult;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[][] freqArray = charFrequency(input);
        System.out.println("Character\tFrequency");
        for (int i = 0; i < freqArray.length; i++) {
            System.out.println(freqArray[i][0] + "\t\t" + freqArray[i][1]);
        }
    }
}
