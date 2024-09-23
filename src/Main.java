import java.util.Scanner;

// also available on
public class Main {
    public static int Score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        askQuestion("What is the primary purpose of the Scanner class in Java?", "To perform calculations", "To create graphical user interfaces (GUIs)", "To read input from the user", "To manage file operations");
        checkAnswer(scanner, 'C');

        askQuestion("Which method of the Scanner class is used to read an integer from the user?", "nextInt()", "nextLine()", "nextDouble()", "read()");
        checkAnswer(scanner, 'A');

        askQuestion("How do you create a Scanner object to read input from the console?", "Scanner scanner = new Scanner();", "Scanner scanner = new Scanner(System.in);", "Scanner scanner = Scanner.create();", "Scanner scanner = Scanner.open();");
        checkAnswer(scanner, 'B');

        askQuestion("What happens if the user enters a non-integer value when prompted for an integer using nextInt()?", "The program crashes.", "The input is ignored.", "The program enters an infinite loop.", "The program continues to the next line of code.");
        checkAnswer(scanner, 'A');

        askQuestion("How do you close a Scanner object after reading input?", "scanner.close();", "scanner.stop();", "scanner.finish();", "scanner.end();");
        checkAnswer(scanner, 'A');

        scanner.close();
        System.out.println("Your score: " + Score + " " + "(" +((double) Score / 5) * 100 + "%)");
    }

    private static void askQuestion(String question, String... options) {
        System.out.println(question);
        for (int i = 0, j = 65; i < options.length; i++, j++) {
            System.out.println((char) j + ". " + options[i]);
        }
    }

    private static void checkAnswer(Scanner scanner, char correctOption) {
        char chosenOptions = scanner.next().toUpperCase().charAt(0);
        if (chosenOptions == correctOption) {
            System.out.println("Correct Answer!");
            Score++;
        }
        else {
            System.out.println("Wrong Answer! The correct answer is: '" + correctOption + "'");
        }

        System.out.println();
    }
}