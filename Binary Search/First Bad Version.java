public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        int start = 1;
        int end = n;
        int firstBad = -1;
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            
            if(isBadVersion(mid))
            { 
                firstBad = mid;
                end = mid-1;
            }
       
            else  start = mid+1;
            
        }
        
        return firstBad;
    }
}
