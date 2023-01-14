class RandomizedSet {
    Map <Integer, Integer> map ;
    Random random;
    List<Integer> indexedData;

    public RandomizedSet() {
        indexedData = new ArrayList<>();
        map =new HashMap<>();
        random = new Random();
    }
    
    public boolean insert(int val) {
        if(map.containsKey(val))
            return false;
        indexedData.add(val);
        map.put(val,indexedData.size() - 1);
        
        return true;
    }
    
    public boolean remove(int val) {
        if(map.containsKey(val))
        {
            int index = map.get(val);
            map.put(indexedData.get(indexedData.size() - 1),index);
            Collections.swap(indexedData,indexedData.size() - 1, index);
            
            indexedData.remove( indexedData.size() - 1);
            map.remove(val);
            return true;
        }
        return false;
    }
    
    public int getRandom() {
      
             int randomIndex = random.nextInt(indexedData.size());
             return indexedData.get(randomIndex);

    }
}
