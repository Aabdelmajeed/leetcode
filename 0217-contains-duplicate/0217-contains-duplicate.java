class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> duplicate = new HashSet<>();
        for(int n: nums){
            duplicate.add(n);
        }
        return (duplicate.size() != nums.length);
    }
}