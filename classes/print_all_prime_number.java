
import java.util.*;

public class print_all_prime_number {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();

        //     for(int i = 2;i<=Math.sqrt(a);i++){
        //         if(a%i== 0){
        //             System.out.print(i+" ");
        //         }
        //     }
        // }
        for (int i = 2; i <= a; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }

}
