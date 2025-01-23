import java.util.*;
public class prime_factor {
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();  // Input the number as long
        long num = a;  // Preserve the original number for digit sum calculation
        long primeSum = 0;

        // Check for 2 (even numbers)
        while (num % 2 == 0) { 
            primeSum += 2;
            num /= 2;
        }

        // Now check for odd factors (skip even numbers)
        for (long i = 3; i * i <= num; i += 2) {  // Only loop up to sqrt(num), increment by 2 (only odd numbers)
            while (num % i == 0) {
                primeSum += i;
                num /= i;
            }
        }

        // If num is still greater than 1, it is prime
        if (num > 1) {
            primeSum += num;
        }

        // Calculate the sum of digits of the original number
        long result = 0;
        long c = a;
        while (c != 0) {
            int c1 = (int)(c % 10);
            result += c1;
            c /= 10;
        }

        // Check if the sum of digits equals the prime sum
        if (result == primeSum) {
            System.out.print("1");
        } else {
            System.out.print("0");
        }

        sc.close();
    }
}


