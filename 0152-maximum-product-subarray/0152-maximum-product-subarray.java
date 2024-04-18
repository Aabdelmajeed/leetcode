class Solution {
    public int maxProduct(int[] nums) {
        int maxi = 1;
        int mini = 1;
        int ans = nums[0];
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 0){
                mini = 1;
                maxi = 1;
                ans = Math.max(ans , nums[i]);
                continue;
            }
            int temp = maxi;
            maxi = Math.max(nums[i] , Math.max(nums[i] * maxi , nums[i] * mini));              mini = Math.min(nums[i] , Math.min(nums[i] * temp , nums[i] * mini));
            ans = Math.max(ans , maxi);

        }
        
        return ans;
    }
}