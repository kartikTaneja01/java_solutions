import java.text.DecimalFormat;
public class Problem_2 {
    public static void main(String[] args) {
        // Input net price and tax rate
        double netPrice = 99.95;
        double taxRate = 0.12;

        // Calculate gross price before taxes
        double grossPrice = netPrice / (1 + taxRate);

        // Format the output to two decimal places
        DecimalFormat df = new DecimalFormat("#.##");
        String formattedGrossPrice = df.format(grossPrice);

        // Print the result
        System.out.println("Net Price: " + netPrice);
        System.out.println("Tax Rate: " + taxRate);
        System.out.println("Gross Price: " + formattedGrossPrice);
    }
}


