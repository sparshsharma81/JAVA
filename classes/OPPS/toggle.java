// package OPPS;
import java.util.*;
public static char convert(int a){
    if(a == 1) return '0';
    else return '1';
}
public class toggle {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        String st = String.valueOf(a);
       StringBuilder st2 = new StringBuilder(st);
       st2 = st2.replace(2, 3,convert(st2.charAt(2)));

    }
    
}
