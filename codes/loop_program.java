import java.util.*;
public class loop_program {
    public static void main(String[] args) {
        //now we are solving the coding questions,.../
        /*
         * 
         * 
         * 
         * 
         */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
    //     for(int j = 0;j<a;j++){
    //         for(int i = a-j; i>j; i--){
    //             System.out.print(" * ");
    //         }
    //         System.out.println("");
    //     }
    // }

    for(int i = a ; i!=0 ;i--){
        for(int j = 0 ;j<i;j++){
            System.out.print(" * ");
        }
        System.out.println(" ");
    }
}
}
