public class prefix_sum {
    public static void main(String[] args) {
        // prefix sum is basically the sum of all the elements of the elements before an particular element 
        int[] arr = {1,2,3,5,6};
        for(int i = 1 ; i<4;i++){
            arr[i] += arr[i-1];
            System.out.println(arr[i]+" ");
        }
        

    }
}
