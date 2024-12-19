import java.util.*;

public class equal_partision {public static boolean canPartition(int[] arr) {
    int totalSum = 0;

    // Calculate the total sum of the array
    for (int num : arr) {
        totalSum += num;
    }

    // If the total sum is odd, it cannot be partitioned into two equal parts
    if (totalSum % 2 != 0) {
        //write me the types of array that is ni
        return false;
    }

    int target = totalSum / 2; // The sum of each partition
    int prefixSum = 0;

    // Check for a prefix sum equal to the target
    for (int num : arr) {
        prefixSum += num;
        if (prefixSum == target) {
            return true; // Partition found
        }
    }

    return false; // No valid partition
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input the array size and elements
    System.out.print("Enter the size of the array: ");
    int n = sc.nextInt();
    int[] arr = new int[n];

    System.out.println("Enter the elements of the array:");
    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    // Check if partitioning is possible
    if (canPartition(arr)) {
        System.out.println("Yes, the array can be partitioned into two equal sums.");
    } else {
        System.out.println("No, the array cannot be partitioned into two equal sums.");
    }
}
}