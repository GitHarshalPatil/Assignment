import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String input) {
        // Convert the input to lowercase for case-insensitive comparison
        input = input.toLowerCase();

        // Create a boolean array to mark the occurrence of each alphabet (a-z)
        boolean[] alphabetOccurrence = new boolean[26];

        // Iterate through the input string and mark the occurrence of each alphabet
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                alphabetOccurrence[ch - 'a'] = true;
            }
        }

        // Check if all alphabets (a-z) have occurred at least once
        for (boolean occurred : alphabetOccurrence) {
            if (!occurred) {
                return false; // Not a pangram
            }
        }

        return true; // It's a pangram
    }
}
