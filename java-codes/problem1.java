//in this.. we need to convert the marks of students into percentage...
/*
 write a program to calculate percentage of a given student in CBSE board exam. his marks from 5 subjects
  are supposed to be taken//..
  marks are out of 100
  
 */
import java.util.Scanner;
public class problem1 {
    public static void main(String args[]){
        System.out.print("Enter your marks of subject 1: ");
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();

        System.out.print("Enter your marks of subject 2: ");
        int a2 = sc.nextInt();
        System.out.print("Enter your marks of subject 3: ");
        int a3 = sc.nextInt();
        System.out.print("Enter your marks of subject 4: ");
        int a4 = sc.nextInt();
        System.out.print("Enter your marks of subject 5: ");
        int a5 = sc.nextInt();
        System.out.print("Great, now your total percentage is: ");
        float f = (a1+a2+a3+a4+a5)/5;
        System.out.println(f);
            }
    
}
