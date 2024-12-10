import java.util.*;
public class given_number_is_present {
    public static void main(String[] args) {
        System.out.println("now this code will check that the given number is present in the code or not....");
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        System.out.println("Great ... now its time to enter the array... so....");
        System.out.println("Tell the size of the array...");
        int b = sc.nextInt();
        int []arr = new int[b];

        for(int i = 0 ; i<b; i++){
            arr[i] = sc.nextInt();
        

        }
        boolean isPresent = false;

        for(int i = 0 ; i<b;i++){
            if(arr[i] == a){
                System.out.println("Bhai present hai...");
                 isPresent = true;
                break;
               
            }
           
        }
        if(!isPresent){
            System.out.println("Bhai kisi aur number se try kar...");
        }


    }
}
