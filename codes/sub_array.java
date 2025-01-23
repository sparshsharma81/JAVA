public class sub_array {
    public static void main(String[] args) {
        int n=7;
        int[] arr= {8, -8,9,-9,10,-11,12};
        //in order to print the maximum subbarray we use three loops--
       
        int result =Integer.MIN_VALUE;
        for(int start = 0;start<n;start++){
             int sum = 0;
            for(int end = start;end<n;end++){
                // for(int i = start;i<=end;i++){
                    // System.out.print(arr[end]+" ");
                    sum+=arr[end];
                    result = Math.max(result,sum);
                    
                // }
               

               
            }
             
            //  System.out.println();
        }
        System.out.print(result);

        /*for(int start = 0;start<n;start++){
        for(int end = start;end<n;end++){
        for(int i = start;i<=end;i++){
        System.out.print()}}
       */
    }
}
