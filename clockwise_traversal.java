import java.util.Scanner;
public class clockwise_traversal {
    
    static void print1(int[][]arr){
        int left = 0;
        int right = arr[0].length-1;
        int top = 0, bottom = arr.length-1;

        // while(left <= right){
        //     for(int i=0; i<arr[0].length;i++){
        //         System.out.print(arr[top][i] + " ");
                
        //     }
        //     top++;
        // }
        // while(top<=bottom){
        //     for(int i =0;i<arr.length;i++){
        //         System.err.print(arr[toṇp][right]);
               
        //     }
        //     right--;
        // }
        // while()

        while(top<= bottom && left <=right){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i = top;i<=bottom;i++){
                System.out.print(arr[i][right]+ " ");
                
            }
            right--;
            for(int i =right;i>=left;i--){
                System.out.print(arr[bottom][i]+" ");

            }
            bottom--;
            for(int i =bottom ;i>=top;i--){
                System.out.print(arr[i][left]+ " ");
            }
            left++;
        }
        
    }
    public static void main(String[] args) {
        // int arr[][] = {{1,2,3},
        //                {4,5,6},
        //                {7,8,9}};
        // print1(arr);
        
        System.out.println("We are printing the traversal of the array....");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int a = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int b = sc.nextInt();
        int [][]arr = new int[a][b];
        for(int i =0;i<=arr[0].length-1;i++){
            for(int j=0;j<=arr.length-1;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Great..now the array is: ");
        for(int i =0;i<=arr[0].length-1;i++){
            for(int j=0;j<=arr.length-1;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
        print1(arr);
    }
}

}
