class Solution {
    public boolean isPalindrome(String s) {
         s =  s.replace(" " , "");
        s = s.toLowerCase();
          s = s.replaceAll(
                "[^a-z0-9]", "");
        int firstPointer = 0;
        int lastPointer = s.length() - 1;
        while(firstPointer < lastPointer){
            if(s.charAt(firstPointer++) != s.charAt(lastPointer--))
                return false;
            
        }
        return true;
    }
}