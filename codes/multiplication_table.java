import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        System.out.print("Now we are printing the multiplication table: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i = 1 ; i<=10; i++){
            System.out.printf("%d X %d = %d",a , i , a*i);
            System.out.println(" ");
        }
    }
}
