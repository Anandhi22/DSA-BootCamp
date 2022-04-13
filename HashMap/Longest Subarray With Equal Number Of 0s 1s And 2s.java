 public static int solution(int[] arr) {
       
        int ans = 0;
        int z0 = 0;
        int z1 = 0;
        int z2 = 0;
       
       HashMap<String, Integer> memo = new HashMap<>();
       
       String exp = (z1-z0) + "#" + (z2-z1);
       
       memo.put(exp, 1);
       
       for(int i = 0;i<arr.length;i++)
       {
           if(arr[i] ==  0) z0 += 1;
           else if(arr[i] == 1) z1 += 1;
           else z2 += 1;
           
            exp = (z1-z0) + "#" + (z2-z1);
           
           if(memo.containsKey(exp))
           {
               ans = Math.max(ans, i - memo.get(exp));
           }
           else 
            memo.put(exp,i);
       }
       
       return ans;
    }
