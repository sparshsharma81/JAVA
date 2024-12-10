import java.util.*;
public class check_array_is_sorted {
    public static void main(String[] args) {
        System.out.println("Now we are checking the array is sorted or not....");
        System.out.println("So the basic condition is arr[i]<arr[i+1]");
        System.out.println("Now enter the size of matrix");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int []arr = new int[a];

        for(int i = 0 ; i<a;i++){
            arr[i] = sc.nextInt();
        }
        boolean isSorted = true;
        for(int i = 1; i<a;i++){
            if(arr[i]>arr[i-1]){
                isSorted = false;
               
                break;

            }

        }
        if(isSorted){
            System.out.println("Broh.. this is sorted...");

        }
        else{
            System.out.println("not broh...");
        }
    }
}
