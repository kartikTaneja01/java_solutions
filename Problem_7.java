public class Problem_7 {
    
        public static void main(String[] args) {
            // Example input values
            double rateOfInflation = 20; // in percentage
            int numberOfYears = 5;
    
            // Calculate compounded inflation
            double compoundedInflation = calculateCompoundedInflation(rateOfInflation, numberOfYears);
    
            // Print the result
            System.out.println("Compounded retail inflation after " + numberOfYears + " years: " + compoundedInflation + "%");
        }
    
        // Function to calculate compounded inflation
        public static double calculateCompoundedInflation(double rateOfInflation, int numberOfYears) {
            // Convert rate of inflation from percentage to decimal
            double rate = rateOfInflation / 100.0;
            // Calculate compounded inflation using the formula (1 + rate)^numberOfYears
            double compoundedInflation = Math.pow(1 + rate, numberOfYears);
            // Convert compounded inflation back to percentage
            compoundedInflation = (compoundedInflation - 1) * 100;
            return compoundedInflation;
        }
    }
    

