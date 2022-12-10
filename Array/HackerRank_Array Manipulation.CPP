
long arrayManipulation(int n, vector<vector<int>> queries) {
    long  max=0;
    long  i=queries[0][0]-1,j=0;
    long  stop=0;
    vector<long > arr(n, 0);
    while(stop<queries.size()){
        i=queries[stop][0]-1;
        arr[i]+=queries[stop][2]; 
        i=queries[stop][1];
        arr[i]-=queries[stop][2]; 
        stop++;
    }
    
    for(i=1;i<=n;i++){
        
        arr[i]+=arr[i-1];
        if( arr[i]>max){
           max=arr[i];
        }
       
    }
    return max;
}
