
import java.util.*;

public class if_else {
    public static void main(String[] args) {
        /***
         * 
         * 
          write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject
          to pass. Assume 3 subjects and take marks as an input from the user

          
         */
        System.out.print("Enter the marks of subject 1: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("Great now enter the marks of 2nd subject: ");
        int b = sc.nextInt();
        System.out.print("Great now enter the marks of 3rd subject: ");
        int c = sc.nextInt();
        float f = (a+b+c)/3;
        System.out.printf("Great now your percentage is: %.2f",f);
        System.out.println();
        if(f>40 && a>33 && b >33 && c>33){
            System.out.println("Congrulations... pass ho gya bhai tu");

        }
        else{
            System.out.println("Bhai thodi rishwat deni padegi");
        }

    }
    
}
