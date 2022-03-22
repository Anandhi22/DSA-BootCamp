public int cutRod(int price[], int n) {
       
       return cutRodder(price, 0, n,  new HashMap<>());
       
    }
    
    private int cutRodder( int[] prices, int currentIndex, int length, HashMap<String, Integer> map)
    {
        
        if(length == 0) return 0;
        
        if(currentIndex>=prices.length) return 0;
        
        int currentPieceLength = currentIndex+1;
        
        String key = currentIndex + "-" + length;
        
        if(map.containsKey(key)) return map.get(key);
        
        int consider =0;
        
        if( currentPieceLength<= length)
          consider = prices[currentIndex] + cutRodder(prices, currentIndex, length -(currentIndex+1), map);
          
       int notConsider = cutRodder(prices, currentIndex+1, length , map);
    
        
        map.put(key, Math.max(consider, notConsider));
        
        return map.get(key);
    }
    