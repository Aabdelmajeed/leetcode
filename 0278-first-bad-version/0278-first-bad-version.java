/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while(left <= right){
            int midV = left + (right - left) / 2;
            boolean isBad = isBadVersion(midV);
            if(isBad){
                if(midV == 1 || !isBadVersion(midV - 1)){
                   return midV;
                }else{
                   right = midV - 1;
                }
            }
            
            if(!isBad){
                left = midV+1;
            }
        }
        
        return -1;
    }
}