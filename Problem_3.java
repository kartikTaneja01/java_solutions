import java.util.Scanner;
public class Problem_3 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Close the Scanner object to prevent resource leak
        scanner.close();

        // Find the larger number
        double largerNumber = (number1 > number2) ? number1 : number2;

        // Print the larger number
        System.out.println("The larger number is: " + largerNumber);
    }
}


