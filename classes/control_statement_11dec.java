import java.util.*;
public class control_statement_11dec{
    public static void main(String args[]){
        System.out.print("Enter the number :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.print("The number is positive");
        }
        else if(a==0){
            System.out.println("THe number which you have entered is 0");
        }
        else{
            System.out.print("The number is negative");
        }
    }
}