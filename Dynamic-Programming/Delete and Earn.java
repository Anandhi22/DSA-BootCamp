class Solution {
    public int deleteAndEarn(int[] nums) {
        
        int[] freq = new int[100000];
        
        int max = 0;
        for( int val : nums) {
            freq[val]++;
            max = Math.max(max, val);
        }
            
        return findEarn(freq, 0, max, new HashMap<>());
    }
    
    public int findEarn( int[] freq, int currIndex, int size, HashMap<Integer, Integer> map)
    {
        if(currIndex>size) return 0;
        
        if(map.containsKey(currIndex)) return map.get(currIndex);
        
        int earn = currIndex * freq[currIndex]  + findEarn(freq, currIndex+2, size, map);
        
        int skip = findEarn(freq, currIndex+1, size, map);
        
        map.put(currIndex, Math.max(earn,skip));
        
        return map.get(currIndex);
        
    }
}
