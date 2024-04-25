class Solution {
    public boolean isPalindrome(int x) {
        // 121 
        if (x < 0 || (x != 0 && x % 10 == 0)) {
        return false;
    }

        int dx = 0;
        int temp = x;
        while(temp > 0){
            int res = temp % 10;
            temp/=10;
            dx = dx*10 + res;  
        }
        
 
        return (dx == x);
     }
}