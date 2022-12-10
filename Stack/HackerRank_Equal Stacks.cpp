int equalStacks(vector<int> h1, vector<int> h2, vector<int> h3) {
   
    int sum1=accumulate(h1.begin(),h1.end(),0);
    int sum2=accumulate(h2.begin(),h2.end(),0);
    int sum3=accumulate(h3.begin(),h3.end(),0);
    
   // bool equal=true;   
     while (!(sum1==sum2&&sum1==sum3)&&!h1.empty()&&!h2.empty()&&!h3.empty()) {
       
         if(!h1.empty()&&(sum1>sum2||sum1>sum3)){
             sum1-=h1.front();
             h1.erase(h1.begin());
         }
         else if(!h2.empty()&&(sum2>sum1||sum2>sum3)){
             sum2-=h2.front();
             h2.erase(h2.begin());
         }
         else {
             if(!h3.empty()){
                sum3-=h3.front();
                h3.erase(h3.begin());
             }
         }
     }
    if(h1.empty()||h2.empty()||h3.empty())
        return 0;
    return sum2;
}
