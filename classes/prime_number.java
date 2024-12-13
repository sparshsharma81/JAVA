import java.util.*;
public class prime_number {
    public static void main(String[] args) {
        //now we are printing prime numbers from 2 to n
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int reverse = 0;
        int b;

        while(a!=0){
            b = a%10;
            a/=10;
            System.out.print(b);


        }
        sc.close();
    }
}
