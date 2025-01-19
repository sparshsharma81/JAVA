import java.util.*;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<Integer>();
        

        //for adding
        list.add(0);
        list.add(3);
        //add at last
        System.out.println(list);

        //add element in between
        list.add(0,1);
        System.out.println(list);

        //set element
        list.set(0,4);
        //0th index pr jo bhi element hai use 4 kar diya
        System.out.println(list);

        //deleting
        list.remove(0); ///this will remove the element at 0th index

        System.out.println(list);

        System.out.println(list.size()); //return the length() of arraylist


        //accessing a particular index
        System.out.println(list.get(0)); //this will access the element at 0th index;


        //we can sort the arraylist using Collections.sort(list) -- by default it is O(nlog(n))
        Collections.sort(list);
        System.out.println(list);

    }
}
