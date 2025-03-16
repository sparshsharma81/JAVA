// package classes.Collection_interface.Hashmap;

import java.util.*;

public class max_subarray_sum {
    public static void main(String args[]){
        //now here we are finding the sum of maximum 
        /*
         we can solve this problem using the hashmap + prefix sum approach
         maintain a prefix sum while traversing ...
         adding the prefix sum with index into the hashmap
         if the prefix sum appears in the hashmap..then it means in the hashmap..if the prefix sum occours twice..means it will be max subarray sum/..
         so we can return the index differnece and that will be our answaer

         */

         int[] arr = {1, 2, -3, 3, 1, -4, 2, 2, -2};

         Map<Integer,Integer>h1 = new HashMap<>();
         int sum = 0, mxsum =0;
         for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum ==0) mxsum = i+1;
            
            if(h1.containsKey(sum)){
                mxsum = Math.max(mxsum,i-h1.get(sum));
            }
            else{
                h1.put(sum,i);
            }
         }
         System.out.print(mxsum);
         

    }
    
}
