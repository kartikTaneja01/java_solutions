public class Problem_5 {
            public static void main(String[] args) {
            // Example incomes
            double income1 = 190000;
            double income2 = 345000;
            double income3 = 780000;
            double income4 = 2400000;
    
            // Test the incomes
            System.out.println("Income Tax for income1: Rs." + computeIncomeTax(income1));
            System.out.println("Income Tax for income2: Rs." + computeIncomeTax(income2));
            System.out.println("Income Tax for income3: Rs." + computeIncomeTax(income3));
            System.out.println("Income Tax for income4: Rs." + computeIncomeTax(income4));
        }
    
        // Function to compute income tax based on taxable income
        public static double computeIncomeTax(double income) {
            double tax = 0;
    
            if (income <= 250000) {
                tax = 0; // No tax for income up to Rs. 2,50,000
            } else if (income <= 500000) {
                // 10% of income over Rs. 2,50,000
                tax = 0.1 * (income - 250000);
            } else if (income <= 1000000) {
                // 10% of income over Rs. 2,50,000 + 20% of income over Rs. 5,00,000
                tax = 0.1 * 250000 + 0.2 * (income - 500000);
            } else {
                // 10% of income over Rs. 2,50,000 + 20% of income over Rs. 5,00,000 + 30% of income over Rs. 10,00,000
                tax = 0.1 * 250000 + 0.2 * 500000 + 0.3 * (income - 1000000);
            }
    
            return tax;
        }
    }
       

