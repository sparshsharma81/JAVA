import java.util.*;

public class fibonacci_sereies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int number;
        int first = 0;
        int second =1;
        System.out.print("Fibonacci sereies: 0 1 ");

        for(int i=2 ;i<a;i++){
            number = first+second;
             System.out.print(number+" ");
            first = second;
            second = number;
           
            
          
    }
}
}
