import java.util.*;
public class reverse_multiplicaiton_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.printf("Great.. now we are printing the reverse table of %d",a);
        for(int i=11 ; i!=0; i--){
            System.out.printf("%d X %d = %d",a,i,a*i);
            System.out.println(" ");

        }
        
    }
    
}
