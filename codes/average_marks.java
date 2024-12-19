import java.util.*;
public class average_marks {
    public static void main(String[] args) {
        System.out.println("We are calculating the average marks of students...");
        System.out.print("Enter the size of the array");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   
        int sum = 0;
        int [] arr = new int[a];
        for(int i = 0; i<a;i++){
            arr[i]= sc.nextInt();
            sum+=arr[i];
            
            
        }
        System.out.println("The average of the physics marks is :" + sum/a);
        

    }
}
