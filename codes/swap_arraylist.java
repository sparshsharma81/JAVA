import java.util.*;
// import java.util.ArrayList;
public class swap_arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        int start =0;
        int end = l1.size()-1;
        while(start<=end){
            int temp = l1.get(start);
            l1.set(start, l1.get(end));
            l1.set(end, temp);
            start++;
            end--;
        }
        System.out.println(l1);
        
    }
}
