// package classes.Collection_interface.Hashmap;

import java.util.HashMap;

public class max_frequency {
    public static void main(String arsg[]){
        //now finding the max frequency...
        int[] arr = {1,4,2,5,1,4,4,6,4,4,4,6,2,2};
        HashMap<Integer,Integer>freq = new HashMap<>();
        for(int el:arr){
            if(!freq.containsKey(el)){
                freq.put(el,1);

            }
            else{
                freq.put(el,freq.get(el)+1);
            }
        
        }
        //the above operation is in O(n)---

        int mxfreq = 0;
        int anskey = -1;
        for(var key : freq.keySet()){ //var is basically any data type that we can access/..
            if(freq.get(key) > mxfreq){
                mxfreq = freq.get(key);
                anskey = key;
            }



        }
        ///its time complexicity --- O(n);

        System.out.print(anskey +" " + mxfreq);


    }
    
}
