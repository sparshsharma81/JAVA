import java.util.*;
public class diamond_pattern_print {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        //this is for the upper half
        for(int i = 1 ;i<=a;i++){
            //now this loop is for spacing...
            for(int j =1;j<=a-1;j++){
            System.out.print(" ");
            }
        

            //now this is for printing stars in the upper half
        for(int j =1 ; j<2*i-1 ; j++){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
