// package JAVA.classes.st1_ques;

import java.util.*;
public class q1 {
    public static void main(String args[]){
        //given a number, find no. of set bits in its binary representation 

        //1 00 11

        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        int total = 0;
        while(a>0){
            int n = a % 2;
            
            total = total + n ;
            a/=2;
        }
        System.out.println(total);
    }
    
}
