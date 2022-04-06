class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        int[] freq = new int[k];
        
        for(int currVal : arr)
        {
            int currRem = ((currVal % k) + k) % k;
            freq[currRem] += 11;
        }
        
        
        for( int i = 0;i<=k/2;i++)
        {
            if(i == 0)
            {
                if(freq[i]%2 != 0) return false;
            }
            
            else 
            {
                int y = k - i;
                if(freq[i] != freq[y]) return false;
            }
        }
       return true;
    }
}
