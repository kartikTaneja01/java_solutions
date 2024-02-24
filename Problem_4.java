public class Problem_4 { 
        public static void main(String[] args) {
            // Example arrays
            double[] array1 = {10.7};
            double[] array2 = {1.0, 2.0, 3.0};
            double[] array3 = {17.4, 21.1, 39.7, 48.0};
            double[] array4 = {-957.0, -493.0, -384.0, -268.0, -131.0};
            double[] array5 = {}; // Empty array
    
            // Test the arrays
            System.out.println("Median of array1: " + findMedian(array1));
            System.out.println("Median of array2: " + findMedian(array2));
            System.out.println("Median of array3: " + findMedian(array3));
            System.out.println("Median of array4: " + findMedian(array4));
            System.out.println("Median of array5: " + findMedian(array5));
        }
    
        // Function to find the median of a sorted array
        public static double findMedian(double[] nums) {
            int length = nums.length;
            
            if (length == 0) {
                return -1.0; // Array is empty
            } else if (length % 2 == 0) {
                // Array has even number of elements
                int midIndex = length / 2;
                return (nums[midIndex - 1] + nums[midIndex]) / 2.0;
            } else {
                // Array has odd number of elements
                return nums[length / 2];
            }
        }
    }
    
