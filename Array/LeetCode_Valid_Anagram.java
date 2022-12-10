class Solution {
    public boolean isAnagram(String s, String t) {
        int index=-1;
       
        for(int i=0;i<s.length();i++){
            StringBuilder sb = new StringBuilder(t);
            index=t.indexOf(s.charAt(i));
            if(index!=-1){
                t=sb.deleteCharAt(index).toString();
               
            }else {
                return false;
            }
        }
        if(t.length()!=0) return false;
        return true;
    }
}
