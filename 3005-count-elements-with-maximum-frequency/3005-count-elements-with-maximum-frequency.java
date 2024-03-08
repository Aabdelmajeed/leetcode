class Solution {
    public int maxFrequencyElements(int[] nums) {
        int maxiOccurence = 0;
        int result = 0;
        int[] arr = new int[101];
        for(int i : nums){
           arr[i]++;
           maxiOccurence = Math.max(maxiOccurence, arr[i]);
        }
        for(int i = 0 ; i < 101 ; i++){
            if(arr[i] == maxiOccurence){
                result++;
            }
        }
        
        return (result*maxiOccurence);
    }
}