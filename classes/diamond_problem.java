import java.util.*;
public class diamond_problem {
    public static void main(String[] args) {
        //now printing the diamond pattern......
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int m = (a+1)/2;
        //now printing the upper part of diamond pattern...
        for(int i = 1; i<=a;i++){
            //now this is for space...
            for(int j= 0; j<=a-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1; j++){
                System.out.print("*");
            }
           System.out.println("");
           
            
        }

        //now we are printing the downer loop....
        for(int i = m-1; i>0;i--){
            for(int j =1;j<=m-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        sc.close();
    }
}
