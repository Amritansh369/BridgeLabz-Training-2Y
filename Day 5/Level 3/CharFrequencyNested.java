import java.util.Scanner;
public class CharFrequencyNested {
    static String[] charFrequency(String s) {
        char[] chars = s.toCharArray();
        int[] freq = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            if (chars[i] == '0') continue;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }
        String[] result = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[i] = chars[i] + " -> " + freq[i];
            } else {
                result[i] = "";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] freqArray = charFrequency(input);
        System.out.println("Character Frequency");
        for (String entry : freqArray) {
            if (!entry.equals("")) {
                System.out.println(entry);
            }
        }
    }
}
