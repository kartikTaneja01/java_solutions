public class Problem_9 {
    
        public static void main(String[] args) {
            // Example input
            int number = 59;
    
            // Check if the number is a two-digit special integer
            boolean isSpecial = isSpecialInteger(number);
    
            // Print the result
            if (isSpecial) {
                System.out.println(number + " is a two-digit special integer.");
            } else {
                System.out.println(number + " is not a two-digit special integer.");
            }
        }
    
        // Function to check if a number is a two-digit special integer
        public static boolean isSpecialInteger(int number) {
            if (number < 10 || number > 99) {
                return false; // Not a two-digit integer
            }
    
            // Extract the digits of the number
            int tensDigit = number / 10;
            int onesDigit = number % 10;
    
            // Calculate the sum and product of the digits
            int sum = tensDigit + onesDigit;
            int product = tensDigit * onesDigit;
    
            // Check if the number is special
            return (sum + product) == number;
        }
    }
    

