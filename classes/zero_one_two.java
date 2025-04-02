
import java.util.*;

public class zero_one_two {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int a = size;
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }

        //solution
        int count_zero = 0;
        int count_one = 0;
        int count_two = 0;
        for (int i = 0; i < a; i++) {
            if (arr[i] == 0) {
                count_zero++;
            }
            if (arr[i] == 1) {
                count_one++;
            }
            if (arr[i] == 2) {
                count_two++;
            }

        }
        for (int i = 0; i < a; i++) {
            if (count_zero > 0) {
                arr[i] = 0;
                count_zero--;

            }
            else if (count_one > 0) {
                arr[i] = 1;
                count_one--;
            }
            else{
                arr[i] = 2;
                count_two--;
            }

        }
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
