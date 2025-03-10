import java.util.HashMap;

public class Sum_of_k_pairs {
    
    public static void main(String args[]){
        int target = 5;
        int[] arr = {-1,3,2,9,1,-8,6};
        HashMap<Integer,Integer>h1 = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int req = target - arr[i];
            if(h1.containsKey(req)){
                // return new int{req,arr[i]};
                System.out.print(req + arr[i]);

            }
            h1.put(arr[i], i);
        }

    }
}
