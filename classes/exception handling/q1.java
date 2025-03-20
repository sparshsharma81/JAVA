import java.util.*;
public class q1{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b= 0;
        while(true){
            try{
                b = sc.nextInt();
                System.out.println(a/b);
                break;
            }
            catch(ArithmeticException ex){
                System.out.println(ex.getMessage());
                System.out.println("Enter the number again.. ");

            }
        }
    }
}