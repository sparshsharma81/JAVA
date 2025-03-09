import java.util.ArrayList;
import java.util.*;

public class map {
    public static void main(String args[]){
        /*
         there are 4 types of map
         1.hashmap -- unordered map
         2. linked hash map --- insertion order (maintained)
         3.tree map
         
         */

         HashMap<Integer,Integer> hmap = new HashMap<>(); //in this we use to pass hashmap
         hmap.put(key, value); //we can put keys and values pair in hashmap
         ArrayList<Integer> arr = new ArrayList<>(); 
         Scanner sc= new Scanner(System.in);

         int n = sc.nextInt();
         for(int i =0;i<n;i++){
            int a = sc.nextInt();
            arr.add(a);
         }

         for(int i =0;i<arr.size();i++){
            int key = arr.get(i);
            // if(hmap.containsKey(arr.get(key))){
            //     int prev_freq = hmap.get(key);
            //     hmap.put(key,prev_freq+1);
            // }
            // else{
            //     hmap.put(key,1);
            // }
            int prev_freq = hmap.getOrDefault(key, 0); 
            hmap.put(key,prev_freq+1);

            for(Map.Entry<Integer,Integer> entry : hmap.entrySet()){
                System.out.println("Key : " + entry.getKey() + " || Freq : " + entry.getValue());
            }

            /*
             getValue , getKey ,  getOrDefault
             */
         }

    }
}
