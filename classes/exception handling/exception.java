import java.util.*;
public class exception {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = 0,b;
        try{
            a = sc.nextInt();
            b =sc.nextInt();
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException ex){
            // try{
            //    break; 
            // }
            // catch(){
            //     System.out.println("Error");
            // }
            
            // System.out.println("Bhai zero se divide nahi kar sakte
            // System.out.println("please number to likhh");
            // b = sc.nextInt();
            // System.out.println(a/b);

            System.out.println(ex.getMessage());

        }

        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());


        }
        // catch(ArithmeticException)

        finally{
            System.out.println("Code in finally block is always executed..");
        }
    }
}
