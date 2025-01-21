import java.util.*;
public class product_of_array_except_self1 {
    public static void main (String args[]) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int[] arr= new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
            
        }
        //in this code our approach is we take three arrryas
        int[] prefix = new int[a];
        int[] suffix = new int[a];
        int[] result = new int[a];
        
        prefix[0] = 1;
        for(int i =1;i<a;i++){
            prefix[i] = prefix[i-1] * arr[i - 1];

        }
        suffix[a-1] = 1;
        for(int i = a-2;i>=0;i--){
            suffix[i] = arr[i + 1] * suffix[i+1];
        }
        for(int i=0;i<a;i++){
            result[i] = suffix[i] * prefix[i];
        }
        for(int i=0;i<a;i++){
            System.out.print(result[i]+ " ");
        }
        sc.close();

    }
}
