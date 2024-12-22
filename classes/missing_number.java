public class missing_number{
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,0}; //by default 0 hota hai if no number is pressent.
        
        int range = nums.length;
        int actual_sum = (range * (range+1)) / 2;
        int current_sum = 0;
        
        for(int i =0;i<nums.length;i++){
            current_sum +=nums[i];

        }
        System.out.println(actual_sum - current_sum);

    }
}