import java.util.Random;
public class FootballTeamHeights {
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int val : arr) {
            if (val < min) {
                min = val;
            }
        }
        return min;
    }
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) {
                max = val;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random rand = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = rand.nextInt(101) + 150; // 150 to 250
        }
        System.out.println("Heights of players in cm:");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);
        double mean = findMean(heights);
        System.out.println("\n--- Results ---");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.printf("Mean Height: %.2f cm%n", mean);
    }
}
