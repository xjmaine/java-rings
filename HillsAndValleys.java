import java.util.Arrays;

public class HillsAndValleys {
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
    
    // Test cases
    public static void main(String[] args) {
        int[][] testCases = {
            {4, 5, 6, 5, 4, 5, 4},       // Mixed hills and valleys
            {1, 2, 3, 4, 5, 6},           // Strictly increasing
            {5, 5, 5, 5, 5},               // Constant array
            {6, 5, 4, 3, 2, 1},            // Strictly decreasing
            {6, 5, 4, 4, 4, 5, 6},         // Flattened valley
            {1, 2, 4, 4, 4, 2, 1}          // Flattened hill
        };
        
        for (int[] testCase : testCases) {
            System.out.println("Array: " + Arrays.toString(testCase));
            System.out.println("Hills and Valleys: " + 
            patternReg(testCase));
            System.out.println("---");
        }
    }
}