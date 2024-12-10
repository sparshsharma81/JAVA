import java.util.*;
public class cheak_leap {
    public static void main(String[] args) {
        //this program will check whether the year is leap or not
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%4 == 0 && a%100 == 0 && a%400 == 0c){
            System.out.println("Yes this is a leap year");

        }
        else{
            System.out.println("Maybe next...");
        }

    }
    
}
