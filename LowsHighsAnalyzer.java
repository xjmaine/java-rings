import java.util.Arrays;
import java.util.Scanner;

public class LowsHighsAnalyzer {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Interactive input
            System.out.println("Hills and Valleys Pattern Analyzer");
            System.out.print("Enter array elements (space-separated): ");
            
            // Read input
            String input = scanner.nextLine();
            int[] numbers = Arrays.stream(input.split("\\s+"))
                                   .mapToInt(Integer::parseInt)
                                   .toArray();
            
            // Analyze and display results
            int result = patternReg(numbers);
            
            System.out.println("\nAnalysis Results:");
            System.out.println("Input Array: " + Arrays.toString(numbers));
            System.out.println("Total Hills and Valleys: " + result);
            
            // Detailed breakdown
            printDetailedAnalysis(numbers);
        }
    }
    
    public static int patternReg(int[] numbers) {
        if (numbers == null || numbers.length < 3) return 0;
        
        int varCount = 0;
        
        for (int i = 1; i < numbers.length - 1; i++) {
            int prev = numbers[i - 1];
            int current = numbers[i];
            int next = numbers[i + 1];
            
            // Skip consecutive identical elements
            while (i < numbers.length - 1 && numbers[i] == numbers[i + 1]) {
                i++;
            }
            
            // Update next if we've skipped elements
            if (i != numbers.length - 1) {
                next = numbers[i + 1];
            }
            
            // Detect high points (Hills)
            if (current > prev && current > next) {
                varCount++;
            } 
            // Detect low points (valleys)
            else if (current < prev && current < next) {
                varCount++;
            }
        }
        
        return varCount;
    }
    
    private static void printDetailedAnalysis(int[] numbers) {
        System.out.println("\nDetailed Pattern Analysis:");
        for (int i = 1; i < numbers.length - 1; i++) {
            int prev = numbers[i - 1];
            int current = numbers[i];
            int next = numbers[i + 1];
            
            if (current > prev && current > next) {
                System.out.println("Hill detected at index " + i + 
                    ": " + prev + " -> " + current + " -> " + next);
            } else if (current < prev && current < next) {
                System.out.println("Valley detected at index " + i + 
                    ": " + prev + " -> " + current + " -> " + next);
            }
        }
    }
} 
