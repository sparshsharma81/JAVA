import java.util.Scanner;

public class SimpleDiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the number of rows (height of the top half of the diamond)
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Upper half of the diamond (including the middle row)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // Move to the next line
            System.out.println();
        }

        // Lower half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");import java.util.Scanner;

                public class SimpleDiamondPattern {
                    public static void main(String[] args) {
                        Scanner sc = new Scanner(System.in);
                
                        // Get the number of rows (height of the top half of the diamond)
                        System.out.print("Enter the number of rows: ");
                        int n = sc.nextInt();
                
                        // Upper half of the diamond (including the middle row)
                        for (int i = 1; i <= n; i++) {
                            // Print leading spaces
                            for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                            }
                
                            // Print stars
                            for (int j = 1; j <= 2 * i - 1; j++) {
                                System.out.print("*");
                            }
                
                            // Move to the next line
                            System.out.println();
                        }
                
                        // Lower half of the diamond
                        for (int i = n - 1; i >= 1; i--) {
                            // Print leading spaces
                            for (int j = 1; j <= n - i; j++) {
                                System.out.print(" ");
                            }
                
                            // Print stars
                            for (int j = 1; j <= 2 * i - 1; j++) {
                                System.out.print("*");
                            }
                
                            // Move to the next line
                            System.out.println();
                        }
                    }
                }
                
            }

            // Move to the next line
            System.out.println();
        }
    }
}
