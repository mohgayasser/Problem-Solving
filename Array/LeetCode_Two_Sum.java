class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> index=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
               int found=0,newTarget=target-nums[i]; 
               index.add(i);
               for(int j=i+1;j<nums.length;j++){
                   if(nums[j]==newTarget){
                        index.add(j);
                        found=1;
                        break;
                   }
               }
               if (found==1) break;
               index.clear();
        }
           int [] list =new int[index.size()];
             for(int i=0;i<index.size();i++){
                 list[i]=index.get(i);
             }       
                    return list;
    }
}
