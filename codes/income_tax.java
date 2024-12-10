
import java.util.Scanner;

public class income_tax {

    public static void main(String[] args) {
        //this program is build to check the tax...
        /*
         * 2.5L --- 5.0L ---5%
         * 5.0L --- 7.5L ---20%
         * 7.5L --- 10.0L ---30%
         * 
         * 
         * 
         * 
         */
        System.out.println("Enter your salaxy..we won't tell anyone");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float tax = 0;

        if (a > 2.5 && a < 5.0) {
            tax = 0.05f * (a - 2.5f);

            System.out.printf("Your salary is : %.2f", tax);
        }
        else if(a<2.5){
            System.out.println("Enjoy");
        }
        else if (a>5.0 && a<7.5){
            tax = (2.5f * 0.05f) + (a - 7.5f)*0.2f;
            System.out.printf("The tax is %.2f",tax);
        }
        else if (a>7.5 && a<10.0){
            tax = (2.5f * 0.05f) + (2.5f * 0.2f) + (a - 7.5f)*0.3f;
            System.out.printf("Your tax to be reduced is : %.2f",tax);
        }

    }
}
