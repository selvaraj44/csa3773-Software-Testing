import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first string
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine();

        // Input second string
        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine();

        // Compare the strings
        if (word1.equals(word2)) {
            System.out.println("The words are equal.");
        } else {
            System.out.println("The words are not equal.");
        }

        scanner.close();
    }
}