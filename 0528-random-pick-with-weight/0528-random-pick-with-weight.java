class Solution {
            int sum = 0;

   ArrayList<Integer> arr = new ArrayList<>();
    public Solution(int[] w) {
        for(int we: w){
            sum += we;
            arr.add(sum);
        }
        
        
    }
    
    public int pickIndex() {
        Random rm = new Random();
        int target = rm.nextInt(sum) +1;
        int low = 0 , high = arr.size() - 1 ;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr.get(mid) < target){
                low = mid + 1;
            }else{
                high = mid ;
            }
        }
        return low;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(w);
 * int param_1 = obj.pickIndex();
 */