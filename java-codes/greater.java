
import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        //using java..we are going to find out whether a given number is greater than or not from a number;
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
    }
}
