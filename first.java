import java.util.Scanner;

public class first {
    public static void nForest(int n) {
        // Iterate over the rows
        for (int i = 1; i <= n; i++) {
            // Iterate over the columns
            for (int j = 1; j <= n; j++) {
                // Print asterisk without newline
                System.out.print("* ");
            }
            // Print a newline after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        scanner.close(); // Close the scanner to avoid resource leak
        
        // Call the nForest method with the input size
        nForest(n);
    }
}
