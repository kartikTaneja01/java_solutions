public class Problem_1 {
    public static void main(String[] args) {
        // Input integer
        int number = -7291;

        // Convert integer to string and remove the negative sign if present
        String numStr = String.valueOf(number).replaceAll("-", "");

        // Calculate the number of digits
        int numDigits = numStr.length();

        // Print the number of digits
        System.out.println(numDigits);
    }
}
