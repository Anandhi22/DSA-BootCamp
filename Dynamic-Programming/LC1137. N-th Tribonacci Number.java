public int tribonacci(int n) {
        
    return checkTribo(n, new HashMap<Integer, Integer>());
    }
    
    public int checkTribo(int n, HashMap<Integer, Integer> memo)
    {
        if(n ==1 || n ==2)return 1;
        
         if(n ==0)return 0;
        
        int currentKey = n;
        
        if(memo.containsKey(n)) return memo.get(n);
        
        int a = checkTribo(n-1, memo);
        int b = checkTribo(n-2, memo);
        int c = checkTribo(n-3, memo);
        
        
        memo.put(currentKey, a+b+c);
        return memo.get(currentKey);
    }