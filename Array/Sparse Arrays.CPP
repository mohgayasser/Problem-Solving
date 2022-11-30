
vector<int> matchingStrings(vector<string> stringList, vector<string> queries) {
    vector<int>result(queries.size(),0);
    for(int i=0;i<queries.size();i++){
        for(int j=0;j<stringList.size();j++){
            if(queries[i]==stringList[j])
                result[i]++;
        }
    }
    return result;
}
