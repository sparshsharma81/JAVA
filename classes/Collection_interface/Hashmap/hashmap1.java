import java.util.*;
public class hashmap1{
    public static void main(String[] args) {
        //now we are using the hashmap...
        /*
         question--- given an array, find the most frequent element in it. if there are multiple elements that appear a maximum number of times.
         print any one of them


         */
       Map<Integer,Integer>h1 = new HashMap<>();
       int[] arr = {1,2,2,4,1,2,4,6,5,4,3,5,2};


       //brute force... first we sort it ---O(nlogn) then we do it using current frequency and max frequency
       for(int i=0;i<arr.length;i++){
       if(h1.containsKey(arr[i])){
        
       }
       }

    }
}