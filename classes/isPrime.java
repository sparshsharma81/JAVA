import java.util.*;

public class isPrime{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        boolean isPrime = true;
        int n = sc.nextInt();
        if(n <= 2) System.out.println("This is not a prime number");
        for(int i=2;i*i<n;i++){
            if(n % i == 0) System.out.println("The number which you have entered is not a prime number");


        }
        System.out.println(true? "this is a prime number":"Am i right");
    }
}