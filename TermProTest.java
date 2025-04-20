import java.util.Random;
import java.util.Scanner;

public class BubbleSortTiming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sizes = {500, 2500, 5000};
        
        for (int n : sizes) {
            long total_time = 0;
            Random rand = new Random();
            
            for (int i = 0; i < 1000; i++) {
                int[] arr = new int[n];
                for (int j = 0; j < n; j++) {
                    arr[j] = rand.nextInt(10000); // Fill array with random numbers
                }
                
                long start_time = System.nanoTime(); // Start timing
                bubbleSort(arr);
                long end_time = System.nanoTime(); // End timing
                
                total_time += (end_time - start_time);
            }
            
            double avg_time = total_time / 1000.0; // Get average time per array
            System.out.println("Number of items sorted: " + n);
            System.out.println("Average sorting time (nanoseconds): " + avg_time);
            System.out.println("-----------------------------------");
        }
        
        scanner.close();
    }
    
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
