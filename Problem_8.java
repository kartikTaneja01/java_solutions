public class Problem_8 {
    
        public static void main(String[] args) {
            // Example input
            int totalSeconds = 21893872;
    
            // Convert seconds to days, hours, minutes, and seconds
            String timeEquivalent = convertSeconds(totalSeconds);
    
            // Print the result
            System.out.println(timeEquivalent);
        }
    
        // Function to convert seconds to days, hours, minutes, and seconds
        public static String convertSeconds(int totalSeconds) {
            // Calculate days, hours, minutes, and seconds
            int days = totalSeconds / (24 * 3600);
            totalSeconds = totalSeconds % (24 * 3600);
            int hours = totalSeconds / 3600;
            totalSeconds = totalSeconds % 3600;
            int minutes = totalSeconds / 60;
            int seconds = totalSeconds % 60;
    
            // Construct the result string
            StringBuilder result = new StringBuilder();
            if (days > 0) {
                result.append(days).append(" Day(s) ");
            }
            if (hours > 0) {
                result.append(hours).append(" Hour(s) ");
            }
            if (minutes > 0) {
                result.append(minutes).append(" Minute(s) ");
            }
            if (seconds > 0) {
                result.append(seconds).append(" Second(s)");
            }
            return result.toString();
        }
    }
       

