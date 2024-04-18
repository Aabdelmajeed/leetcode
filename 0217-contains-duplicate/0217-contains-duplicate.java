class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> se = new HashSet<Integer>();
        for(int n : nums){
            se.add(n);
        }
        return (se.size() != nums.length);
     }
}