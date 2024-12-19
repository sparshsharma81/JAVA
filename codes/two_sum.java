public class two_sum {
    //there are two approach to solve this question/
    //the easier one is brute force approach in which the time and space compexicity is not good..
    static int[] two(int[]arr, int target){
        for(int i =0;i<nums.length;i++){
            for(int j = i+1; j<nums.length;j++){
                if(arr[i] + arr[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
        

    }
}
