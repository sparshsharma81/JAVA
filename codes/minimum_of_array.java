import java.util.*;
public class minimum_of_array {
    public static void main(String[] args) {
        System.out.println("Great... we are finding the minimum of an array...");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int [] arr = new int[a];
        for(int i = 0 ; i<a;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Great... you have entred the array...");
        System.out.println("Now its time for the output of the result");
        for(int i = 0 ; i<a;i++){
            System.out.print(" " + arr[i]+ " ");
        }

        int sum = arr[0];
        for(int i =0; i<a;i++){
            if(arr[i]<sum){
                sum = arr[i];
            }
        }
        System.out.println("So the smallest element in the given array is : "+sum);

    }
}
