import java.util.*;

public class first_n_natural_numbers {
    public static void main(String[] args) {
        //now we are writing the program to print the first n natural numbers...

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i= 1; i<a;i+=2){
            System.out.println(i);
            //this code will print the first n natural numbers... 
        }

    }
}
