// Time Complexity = O(n)
// Space Complexity = O(n)

class Solution 
{ 
    long getSubstringWithEqual012(String str) 
    { 
       long ans = 0;
       int z0 = 0;
        int z1 = 0;
        int z2 = 0;
       
       HashMap<String, Integer> memo = new HashMap<>();
       
       String exp = (z1-z0) + "#" + (z2-z1);
       
       memo.put(exp, 1);
       
       for(int i = 0;i<str.length();i++)
       {
           if(str.charAt(i) == '0') z0 += 1;
           else if(str.charAt(i) == '1') z1 += 1;
           else z2 += 1;
           
            exp = (z1-z0) + "#" + (z2-z1);
           
           if(memo.containsKey(exp))
           {
               ans += memo.get(exp);
               memo.put(exp,memo.get(exp)+1);
               
           }
           else 
            memo.put(exp,1);
       }
       
       return ans;
       
    }
} 
