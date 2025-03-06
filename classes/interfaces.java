import java.util.*;

public class interfaces{
    public static void main(String[] args) {
        /*
         java collection framework 

         it is based on four interface
         1.list ---it has duplicates
         2.queue --based in a specific order --- first in first out
         3.map ---it stores key values pairs... --
         4.set ----insertion order is mentain -- and can not have duplicate elements
         */


         /*
          list --- it has 4 types
          vector, arraylist , linkedlist, stack
          */


          /*
           set --- set has three implementation
if we want to call them then we need to pass datatypes in angular brackets
           it does not allow the duplicate elemenets
           1.hashset----hash means random order
           2.linkedset ---order of insertion 
           3.treeset ---sorted order of elements
           */

           /*
            hashmap--
            it is of four types
            hashmap --random order
            linkedhash map -- insertion order jisme karege..usi me hoga..duplicates nahi hoge...
            tree map--- arranged order
            hashtable ---- same hashmap but thread is same 
            if two or more thread using same hashmap then they are synchronized
            */


            /*
             arraylist to array
             Object[] arr1 = arrList.toArray();
             Integer[] arr2 = arrList.toArray(new Integer[0]);


             //primitive type array -- primitive is int double char 
             int[]arr = arrList.stream().mapToInt(Integer::intValue).toArray();

             first use arrList.Stream().then map integer to its int value then .toArray();
             */

             //question---input a list and find the largest element in that list..
             List<Integer>l1 = new ArrayList<>();
             l1.add(1);
             l1.add(2);
             l1.add(3);
             l1.add(4);
             l1.add(5);
             int max =0;
             for(int i=0;i<l1.size();i++){
                max = Math.max(max,l1.get(i));

             }
             System.out.print(max);
    }

}