import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];   // [i][0] = Physics, [i][1] = Chemistry, [i][2] = Maths
        double[] percentage = new double[n];
        String[] grade = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter marks for Student " + (i + 1));

            for (int j = 0; j < 3; j++) {
                do {
                    if (j == 0) System.out.print("Physics: ");
                    else if (j == 1) System.out.print("Chemistry: ");
                    else System.out.print("Maths: ");
                    
                    marks[i][j] = sc.nextDouble();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Enter valid marks (0 - 100).");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            double total = marks[i][0] + marks[i][1] + marks[i][2];
            percentage[i] = (total / 300) * 100;

            if (percentage[i] >= 90) {
                grade[i] = "A";
            } else if (percentage[i] >= 75) {
                grade[i] = "B";
            } else if (percentage[i] >= 50) {
                grade[i] = "C";
            } else {
                grade[i] = "F";
            }
        }

        System.out.println("\n--- Student Report ---");
        System.out.printf("%-10s %-10s %-10s %-12s %-10s %-6s\n", 
                          "Physics", "Chemistry", "Maths", "Percentage", "Grade", "");
        for (int i = 0; i < n; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-12.2f %-10s\n", 
                              marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);
        }
    }
}
