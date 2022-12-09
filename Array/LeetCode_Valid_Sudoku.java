class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Integer> hash_Seth = new HashSet<Integer>();
        Set<Integer> hash_Setv = new HashSet<Integer>();
        Set<Integer> hash_SetBox = new HashSet<Integer>();
        
        int counterh=0,counterv=0,countBox=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
            
                if(Character.compare(board[i][j],'.')!=0){
                    hash_Seth.add((int)(board[i][j]));
                    counterh++;
                }
            }
            if(hash_Seth.size()!=counterh)return false;
            hash_Seth.clear();
           
            counterh=0;
        }
         for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                  if(Character.compare(board[j][i],'.')!=0){
                    hash_Setv.add((int)(board[j][i]));
                    counterv++;
                }
            }
            if(hash_Setv.size()!=counterv)return false;
            hash_Setv.clear();
            counterv=0;
        }int j=0,k=0,first=0,cell;
        for(int i=0;i<9;){
            first=0;
            cell=i;
            for( j=k;first<3;){
                if(Character.compare(board[i][j],'.')!=0){
                    hash_SetBox.add((board[i][j])-'0');
                    countBox++;
                }
                j++;
                if(j%3==0){
                   first++;
                    ++i;
                    j=k;
                }
            }
            i=cell;
            k+=3;
            if(k>8){
                k=0;
                i+=3;
            }
            if(hash_SetBox.size()<countBox)return false;
            hash_SetBox.clear();
            countBox=0;
        }
       return true;
    }
}
