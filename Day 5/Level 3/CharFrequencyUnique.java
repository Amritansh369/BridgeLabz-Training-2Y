import java.util.Scanner;
public class CharFrequencyUnique {
    static char[] uniqueCharacters(String s) {
        char[] temp = new char[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (temp[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[index] = c;
                index++;
            }
        }
        char[] unique = new char[index];
        for (int i = 0; i < index; i++) {
            unique[i] = temp[i];
        }
        return unique;
    }
    static String[][] charFrequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(s);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
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
