import java.util.*;
public class average_marks_for_each_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int a = sc.nextInt();
        int [] arr = new int[a];
        int sum = 0;
        
        for(int el : arr){
            el = sc.nextInt();
            sum+=el;
        }
        System.out.println("Now the average that is calculated using the for-each loop is: "+sum/a);
    }
}
