class Solution {
   public boolean circularArrayLoop(int[] nums) {
    int n = nums.length;
    
    for (int i = 0; i < n; i++) {
        int slowIdx = i;
        int fastIdx = i;
        boolean isForward = nums[i] > 0; 
        
       while(true){
            slowIdx = getNextIndex((slowIdx + nums.length)%nums.length, nums);
            fastIdx = getNextIndex((nums.length + getNextIndex((fastIdx + nums.length)%nums.length, nums))%nums.length, nums);
            if(slowIdx == -1 || fastIdx == -1)
                break;
            if(fastIdx == slowIdx)
                return true;
       }
    
    }
    
    return false;  
}

private int getNextIndex(int currentIndex, int[] nums) {
    int nextIndex = (currentIndex + nums[currentIndex]) % nums.length;
     if (nextIndex < 0)
        nextIndex += nums.length;
     if (nextIndex == currentIndex || nums[nextIndex] * nums[currentIndex] < 0)
        return -1;
    return nextIndex;
}

}