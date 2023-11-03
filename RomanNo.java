import java.util.Scanner;

//import.java.util.Scanner;
public class RomanNo {
    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;

        // Define Roman numeral values and their corresponding integers
        int[] values = {1, 5, 10, 50, 100, 500, 1000};
        char[] numerals = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentIndex = 0;

            // Find the index of the current Roman numeral in the array
            while (currentIndex < numerals.length && numerals[currentIndex] != currentChar) {
                currentIndex++;
            }

            int currentValue = values[currentIndex];

            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            prevValue = currentValue;
        }

        return result;
    }

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter any number");
//    	int no=sc.nextInt();
        String romanNumeral = sc.nextLine();
        int intValue = romanToInt(romanNumeral);

        System.out.println("The integer value of " + romanNumeral + " is " + intValue);
    }
}