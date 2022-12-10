//I got ( Terminated due to timeout) with this code, but I will reach the completely correct one and update this version.

public static long largestRectangle(List<Integer> h) {
    // Write your code here
        long answer=h.get(0);
        //List<long> maxOfEachElement=new ArrayList<long>();
        long l,w;
        for(int i=0;i<h.size();i++){
            l=h.get(i);
            w=0;
            for(int j=0;j<h.size();j++){
               
                if(i>j){
                    if(h.get(j)>=h.get(i)){
                        w++;
                    }else {
                        w=0;  
                    }
                }else if(i<=j){
                     if(h.get(j)>=h.get(i)){
                        w++;
                    }else {
                      break; 
                    }
                }
            }
            if((w*l)>answer){
                answer=w*l;
            }
        }
        return answer;
    }

}
