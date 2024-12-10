import java.util.Scanner;
public class add_two_matrix {

    public static void main(String[] args) {
        System.out.println("Great... we are creating an program to add two matrix");
        System.out.print("Now first enter the size of first matrix...");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int [][] arr1 = new int[a][b];
        int [][] arr2 = new int[a][b];
        int [][] arr3 = new int[a][b];
        System.out.println("Great... now you have entereted the size of first matrix...so the second matrix should have the same size.. so now ");
        System.out.println("Enter the elements of first matrix");
        for(int i = 0; i<a;i++){
            for(int j = 0; j<b;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Great... now enter the elements of the second matrix..");
        for(int i =0 ; i<a;i++){
            for(int j = 0 ; j<b;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Great..now adding two matrix would result...");
        for(int i = 0 ;i<a;i++){
            for(int j = 0 ; j<b; j++){
                System.out.printf("%d+%d= %d ,",arr1[i][j], arr2[i][j] , arr1[i][j]+ arr2[i][j]);
            }
            System.out.println(" ");
        }


    }
}
