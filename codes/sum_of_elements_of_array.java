import java.util.*;
public class sum_of_elements_of_array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        int [] arr= new int[a];
        for(int i = 0 ; i<a;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];

        }
        System.out.println("The sum of all the elements of the array is :"+sum);
    }
}
