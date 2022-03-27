//   LeetCode509 - Fibonacci Number

pubic int fib(int n) {
        return checkFib(n, new HashMap<Integer, Integer>());
    }
    
    public int checkFib(int n, HashMap<Integer, Integer> memo)
    {
        if(n ==1)return 1;
        
         if(n ==0)return 0;
        
        int currentKey = n;
        
        if(memo.containsKey(n)) return memo.get(n);
        
        int a = checkFib(n-1, memo);
        int b = checkFib(n-2, memo);
        
        memo.put(currentKey, a+b);
        return memo.get(currentKey);
    }
