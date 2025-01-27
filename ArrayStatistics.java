import java.util.Arrays;

public class ArrayStatistics {
    public static void main(String[] args) {
        
        int[] numbers = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        
        double mean = calculateMean(numbers);
        System.out.println("Mean: " + mean);

    
        double median = calculateMedian(numbers);
        System.out.println("Median: " + median);

    
        double stdDeviation = calculateStandardDeviation(numbers, mean);
        System.out.println("Standard Deviation: " + stdDeviation);
    }

    
    public static double calculateMean(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }

    
    public static double calculateMedian(int[] arr) {
        Arrays.sort(arr); 
        int n = arr.length;
        if (n % 2 == 0) {
            
            return (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
        } else {
           
            return arr[n / 2];
        }
    }

   
    public static double calculateStandardDeviation(int[] arr, double mean) {
        double sumSquaredDifferences = 0.0;
        for (int num : arr) {
            sumSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDifferences / arr.length); 
    }
}

