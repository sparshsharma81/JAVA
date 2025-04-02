import java.util.*;

public class non_unique_element_frequency {
    public static void main(String args[]){
        //we have to find the non unique elements 
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int[]arr = new int[a];
        for(int i=0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        HashMap<Integer,Integer>h1= new HashMap<>();
        for(int i=0;i<a;i++){
           
                h1.put(arr[i],h1.getOrDefault(arr[i], 0)+1);
            

        }
        ArrayList<Integer>a1 = new ArrayList();
        for(var key:h1.keySet()){
           if(h1.get(key) != 1){
            a1.add(key);
           }
        }
        System.out.print(a1);
    }
}
