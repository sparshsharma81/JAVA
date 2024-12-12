import java.util.*;
public class reverse_a_number {
    public static void main(String[] args) {
        //now this code is regarding reversing a number
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        
        int c = (b%10)*10 + (b/10);

        
        

        System.out.println("The reverse of number is : "+c);

        sc.close();
    }
}
