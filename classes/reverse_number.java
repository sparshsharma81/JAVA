import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take the number input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int reversed = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            reversed = reversed * 10 + digit;  // Append the digit to the reversed number
            num /= 10;  // Remove the last digit from the number
        }

        // Print the reversed number
        
        System.out.println("Reversed number: " + reversed);
    }
}
