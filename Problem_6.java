  public class Problem_6 {

        public static void main(String[] args) {
            // Example array of strings
            String[] strings = {"Sunshine", "Umbrella", "Major", "Resourceful"};
    
            // Find the string with the most number of vowels
            String mostVowelsString = findStringWithMostVowels(strings);
    
            // Print the result
            System.out.println("String with the most number of vowels: " + mostVowelsString);
        }
    
        // Function to find the string with the most number of vowels
        public static String findStringWithMostVowels(String[] strings) {
            String result = "";
            int maxVowels = 0;
    
            // Iterate through each string in the array
            for (String str : strings) {
                int vowelCount = countVowels(str);
                // Check if the current string has more vowels than the previous max
                if (vowelCount > maxVowels) {
                    maxVowels = vowelCount;
                    result = str;
                }
            }
            return result;
        }
    
        // Function to count the number of vowels in a string
        public static int countVowels(String str) {
            int count = 0;
            // Convert the string to lowercase to simplify comparison
            str = str.toLowerCase();
            // Iterate through each character in the string
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    count++;
                }
            }
            return count;
        }
    }
    
          
