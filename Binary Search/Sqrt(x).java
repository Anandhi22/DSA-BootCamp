class Solution {
    public int mySqrt(int x) {
        
        
       long start = 0;
        long end = x;
        long root= -1;
        
        while(start<=end)
        {
            long mid = start + (end-start)/2;
            
            long sqr = mid * mid;
           if(sqr == x) return (int)mid;
            else if(sqr > x) end = mid-1;
            else
            {
                root = mid;
                start = mid+1;
            }
        }
        
     return (int)root;
    }
}
