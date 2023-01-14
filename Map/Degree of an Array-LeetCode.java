class Solution {
    public int findShortestSubArray(int[] nums) {
        Map <Integer,Integer> freqOfNum =new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            freqOfNum.put(nums[i] , freqOfNum.getOrDefault(nums[i],0) + 1);
        }
        Map<Integer,List<Integer>> StartAndEndOfFreq = new HashMap<>();
        List <Integer> arr ;
        int max = 1;
        for(int i = 0; i < nums.length; i++){
            arr = new ArrayList<>( StartAndEndOfFreq.getOrDefault(nums[i],List.of()));
            arr.add(i);
            StartAndEndOfFreq.put(nums[i] ,arr );
            if(freqOfNum.get(nums[i]) > max) max = freqOfNum.get(nums[i]);
        }
        int result = 49999;
     
        for (Map.Entry<Integer,Integer> entry : freqOfNum.entrySet()) {
            if(entry.getValue()==max){
                arr = StartAndEndOfFreq.get(entry.getKey());
                if(arr.get(arr.size()-1) - arr.get(0) < result)
                    result = arr.get(arr.size()-1) - arr.get(0);
            }
        }
    return result+1;
    }
}
