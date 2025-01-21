import java.util.*;
public class row_column {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt(); 
        int[][] arr= new int[a][a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                arr[i][j] = sc.nextInt();

            }
           
        }  

        
        boolean[] rows = new boolean[a];
        boolean[] column = new boolean[a];

        //step1--identify the rows and columns which are needed to set 1
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
                if(arr[i][j] == 1){
                    rows[i] = true;
                    column[j] = true;
                }
            }
        }
        
        //step-2 NOW Modifing the array
        
        for(int i =0;i<a;i++){
            for(int j= 0;j<a;j++){
                if(rows[i] || column[j] ){
                    arr[i][j] = 1;

                }
            }
        }
        System.out.println();
        for(int i=0;i<a;i++){
            for(int j= 0;j<a;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


    }
}
