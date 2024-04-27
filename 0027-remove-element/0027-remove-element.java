class Solution {
    public int removeElement(int[] nums, int val) {
        
        int left = 0 ; int right = nums.length - 1;
        for(int i = nums.length - 1 ; i >= 0 ; i--){
            if(nums[i] == val){
                  right--;

            }else{
                break;
            }
        }
        
        while(left <= right){
            if(nums[left] == val){
                swap(right , left , nums);
                right--;
             }else{
                
              left++;
            }
        }
        return left;
    }
    
    public void swap(int idx1 , int idx2 , int[] arr){
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}