import java.util.*;
public class reverse_array {
   public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,8,99,23};
    Arrays.sort(arr);

    for(int i =arr.length-1 ;i>=0;i--){
        System.out.print(arr[i]+" ");
    }
   } 
}
