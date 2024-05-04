class Solution {
    public boolean isHappy(int n) {
    int slow = n;
       int fastPointer = sum(n);
        while(fastPointer != 1 && slow != fastPointer){
            slow = sum(slow);
            fastPointer = sum(sum(fastPointer));
        }
        return fastPointer == 1;
    }
    
    public int sum(int n){
        int result = 0;
        while(n != 0){
            int digit = n%10;
            result += (Math.pow(digit , 2));
            n/=10;
        }
        return result;
    }
}