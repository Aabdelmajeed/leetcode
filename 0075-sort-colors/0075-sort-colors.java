class Solution {
    public void sortColors(int[] nums) {

        
        int start = 0;
        int current = 0;
        int end = nums.length - 1;
        while(current <= end){
            if(nums[current] == 0){
                if(nums[start] != 0){
                     int temp = nums[start];
                    nums[start] = nums[current];
                    nums[current] = temp;
                }
                current++;
                start++;
            }else if(nums[current] == 2){
                if(nums[end] != 2){
                     int temp = nums[end];
                    nums[end] = nums[current];
                    nums[current] = temp;
                }
                 end--;
            }else{
                current++;
            }
        }

    }
    
    
}