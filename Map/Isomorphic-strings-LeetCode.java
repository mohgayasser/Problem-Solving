class Solution {
    public boolean isIsomorphic(String s, String t) {
       if(s.length() != t.length()) return false;
       else {
            Map<Character,Character> arr = new HashMap<>();
            for(int i=0; i< s.length(); i++){
                if(!arr.containsKey(s.charAt(i)) && !arr.containsValue(t.charAt(i)))
                     arr.put(s.charAt(i),t.charAt(i));
                if(arr.containsKey(s.charAt(i)) && arr.get(s.charAt(i)) == t.charAt(i))
                    continue;
                else 
                    return false;
            }

       }
        return true;
       } 
    
}
