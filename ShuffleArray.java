
import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] originalArr = {1, 2, 3, 4, 5, 6, 7};
        int[] shuffledArr = customShuffle(originalArr);

        System.out.print("Original array: ");
        printArray(originalArr);

        System.out.print("Shuffled array: ");
        printArray(shuffledArr);
    }

    public static int[] customShuffle(int[] arr) {
        int[] shuffledArr = arr.clone(); // Create a copy of the original array
        int n = shuffledArr.length;
        Random rand = new Random();

        // Start from the last element and swap it with a random element before it
        for (int i = n - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1); // Generate a random index between 0 and i
            // Swap elements at indices i and j
            int temp = shuffledArr[i];
            shuffledArr[i] = shuffledArr[j];
            shuffledArr[j] = temp;
        }

        return shuffledArr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}