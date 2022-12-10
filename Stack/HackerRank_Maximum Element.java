
class Result {

    /*
     * Complete the 'getMax' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY operations as parameter.
     */
   
    public static List<Integer> getMax(List<String> operations) {
    // Write your code here
    List<Integer> ourList=new ArrayList<Integer>();  ;
    List<Integer>answer=new ArrayList<Integer>();  ;
        for(int i=0;i<operations.size();i++){
            String[] nums = operations.get(i).split(" ", 2);
            if(Integer.parseInt(nums[0])==1){
               ourList.add(Integer.parseInt(nums[1])); 
            }
            else if(Integer.parseInt(nums[0])==2){
                ourList.remove(ourList.size()-1);
            }
            else{
               answer.add(Collections.max(ourList)); 
            }
        }
         return answer;
    }
   
}
