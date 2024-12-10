import java.util.*;

public class check_website {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String web = sc.nextLine();
        if(web.endsWith(".com")){
            System.out.println("Bhai ye website thik hai");

        }
        else if(web.endsWith(".in")){
            System.out.println("Bhai ye to koi government website hai");
        }
        else if(web.endsWith("org")){
            System.out.println("Bhai ye to koi organisation wali website hai");

        }
        else{
            System.out.println("System hang ho gya");
        }
    }

    
}