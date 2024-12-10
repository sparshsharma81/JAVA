
import java.util.*;

public class sum_first_n_even_number {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        for(int i=0 ; i<=a;i++){
            sum+=(2*i);

        }
        System.out.printf("%d",sum);
    }
}
