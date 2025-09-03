import java.util.Scanner;
public class RockPaperScissors {
    static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        if (choice == 0) return "rock";
        else if (choice == 1) return "paper";
        else return "scissors";
    }

    static String findWinner(String user, String computer) {
        if (user.equals(computer)) return "draw";
        if ((user.equals("rock") && computer.equals("scissors")) ||
            (user.equals("paper") && computer.equals("rock")) ||
            (user.equals("scissors") && computer.equals("paper"))) {
            return "user";
        }
        return "computer";
    }

    static String[][] calculateStats(String[][] results, int totalGames) {
        int userWins = 0, computerWins = 0, draws = 0;
        for (int i = 0; i < totalGames; i++) {
            if (results[i][2].equals("user")) userWins++;
            else if (results[i][2].equals("computer")) computerWins++;
            else draws++;
        }
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / totalGames);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(computerWins);
        stats[1][2] = String.valueOf((computerWins * 100.0) / totalGames);
        return stats;
    }

    static void displayResults(String[][] results, String[][] stats) {
        System.out.println("Game\tUser\tComputer\tWinner");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }
        System.out.println("\nSummary:");
        System.out.println("Player\tWins\tWin%");
        for (int i = 0; i < stats.length; i++) {
            System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2] + "%");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[][] results = new String[n][3];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String userChoice = sc.nextLine().toLowerCase();
            String computerChoice = getComputerChoice();
            String winner = findWinner(userChoice, computerChoice);
            results[i][0] = userChoice;
            results[i][1] = computerChoice;
            results[i][2] = winner;
        }
        String[][] stats = calculateStats(results, n);
        displayResults(results, stats);
    }
}
