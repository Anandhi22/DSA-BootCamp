//T(n)=\sum_{i=0}^{n-1}T(i)*T(n-i-1)                             

class Solution
{
    
    public static BigInteger findCatalan(int n)
    {
        return nthCatalan(n, new HashMap<>());
        
    }
    
    public static BigInteger nthCatalan(int n, HashMap<Integer, BigInteger> memo)
    {
        if(n==0||n==1) return BigInteger.valueOf(1);
        
        if(memo.containsKey(n)) return memo.get(n);
        
        BigInteger ways = BigInteger.valueOf(0);
        
        for(int i = 0;i<n;i++)
        {
        BigInteger a =  nthCatalan(i,memo) ;
        BigInteger b = nthCatalan(n-i-1, memo);
        BigInteger c = a.multiply(b);
         ways = ways.add(c);
        }
        
        memo.put(n, ways);
    return memo.get(n);
        
    }
}
