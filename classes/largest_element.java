import java.util.*;
public class largest_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int a = sc.nextInt();
        System.out.println("now enter the arrays...");
        int [] arr = new int[a];
        for(int i = 0; i<a;i++){
            arr[i] = sc.nextInt();
        }
        // System.out.print("Ok now enter the max element: ");
        int max = arr[0];
        for(int i =0 ;i<a;i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.print("The max element is : " + max);




    }
}
