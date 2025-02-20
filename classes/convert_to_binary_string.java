// package classes;
import java.util.*;
public class convert_to_binary_string {
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        // System.out.println(a);
        String s = Integer.toBinaryString(a);
        // System.out.println(Integer.toBinaryString(a));
        System.out.println(s);
        //Integer.toString(num,2) --alternative approach for solving thiis



    }
}
