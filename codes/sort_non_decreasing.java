import java.util.*;


public class sort_non_decreasing {
    static int[] commpare(int[] num){
        int size = num.length;
        int [] result = new int[size];
        int left= 0, right = size -1;
        for(int i = size-1; i>=0;i--){
            if(Math.abs(num[left])< Math.abs(num[right])){
                result[i] = num[left] * num[left];    
                left++;         
            }
            else{
                result[i] = num[right] * num[right];
                right--;
            }
        }
        return result;


        
    }
    
    public static void main(String[] args) {
        //now we are sorting array --- in non decreasing order, return an array of squares of each number sorted in non - decreasing order..

        //first we intake the array..
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int a = sc.nextInt();
        System.out.println("Great..since you have entered the size of the array..now enter the elements");
        int [] arr= new int[a];
        for(int i = 0; i<a ; i++){
            arr[i] = sc.nextInt();

        }
        
        arr = commpare(arr);

        //now we are comparing the absolute values...

        //now this is output of the array..
        for(int i = 0 ; i<a;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
