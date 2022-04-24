class Solution {
    public int lengthOfLongestSubstring(String str) {
        
    HashMap<Character, Integer> memo = new HashMap<>();
	int release = 0;
	int ans = 0;
	
	for(int acquire = 0; acquire<str.length();acquire++)
	{
	    char currentElement = str.charAt(acquire);
	    
	    while(release < acquire && memo.containsKey(currentElement))
	    {
	        char discardChar = str.charAt(release);
	        memo.remove(discardChar);
	        release += 1;
	    }
	    
	    memo.put(currentElement, acquire);
	    ans = Math.max(ans, (acquire - release + 1));
	}
	
	return ans;
    }
}
