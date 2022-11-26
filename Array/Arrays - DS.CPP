
vector<int> reverseArray(vector<int> a) {
    
    vector<int> r;
    
    for(int i=0;i<a.size();i++){
        r.push_back(a[a.size()-i-1]);
    }
    
    return r;
}

