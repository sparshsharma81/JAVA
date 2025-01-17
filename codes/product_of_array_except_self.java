public class product_of_array_except_self {
    public static void main(String[] args) {
        //now this question states that we need to find the product of array except self
        //so our approach is find the prefix multiplication then suffix multiplication and then multiply it... 
        // int[] arr = {7,2,3,4,5};
        // int n = arr.length;
        // int[] result = new int[n]; //0 0 0 0 0

        // //step1: finding the prefix multiplication
        // int prefix =1;
        // for(int i =0;i<n;i++){
        //     result[i] = prefix;
        //     prefix*=arr[i];
        // }

        // int suffix = 1;
        // for(int i =n-1;i>=0;i--){
        //     result[i] = suffix;
        //     suffix*=arr[i];    
        // }

        // int sum = suffix * prefix;
        // System.out.print(sum);



        //now for this code we have a approach like create two array.
        //prefix array and suffix array
        int[] arr = {1,2,3,4,5};
        int[] suffix = new int[arr.length];
        int[] prefix = new int[arr.length];
        int[] result = new int[arr.length];

        prefix[0] = 1;
        for(int i = 1;i<arr.length;i++){
            prefix[i] = prefix[i-1] * arr[i-1]; 
        }
        suffix[arr.length-1] = 1;
        for(int i = arr.length-2;i>=0;i--){
            suffix[i] = suffix[i+1] * arr[i+1];
        }
        for(int i = 0;i<arr.length;i++){
            result[i] = suffix[i] * prefix[i] ;

        }
        for(int i =0;i<arr.length;i++){
            System.out.print(result[i]+" ");
        }
        
    }

    //this code has runtime complexicvity 2ms with time complexicity -- O(n);   
    
}
