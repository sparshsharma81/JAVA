
import java.util.Scanner;

public class repeated_element{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
       
        int[] arr = new int[a+1];
        int sum = 0;
        for(int i = 0;i<=a;i++){
            arr[i] = sc.nextInt();
            sum+=arr[i];
           

        }
        int sum2 = (a * (a+1))/2;
        System.out.println(sum-sum2);
        
              



    }
}
