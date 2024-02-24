import java.util.Arrays;

public class Problem_10 {
    public static void main(String[] args) {
        // Example array of unsorted numbers
        int[] numbers = {10, 5, 20, 15, 25, 30};

        // Find the second largest number
        int secondLargest = findSecondLargest(numbers);

        // Print the result
        System.out.println("The second largest number is: " + secondLargest);
    }

    // Function to find the second largest number in an array
    public static int findSecondLargest(int[] numbers) {
        // Check if the array has at least two elements
        if (numbers.length < 2) {
            System.out.println("Array should have at least two elements.");
            return Integer.MIN_VALUE;
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Return the second largest number
        return numbers[numbers.length - 2];
    }
}


