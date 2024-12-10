import java.util.*;
public class reverse_an_array {
    public static void main(String[] args) {
        System.out.println("Enter the size of array which you wanted to reverse...");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int []arr = new int[a];
        for(int i = 0 ; i<a;i++){
            arr[i] = sc.nextInt();


        }
        for(int i = arr.length;i!=0;i--){
            System.out.println(arr[i-1]);
        }

    }
    
}
