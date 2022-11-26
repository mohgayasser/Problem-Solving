
vector<int> rotateLeft(int d, vector<int> arr) {
    for(int i=0;i<d;i++){
        int temp=(arr.front());
        arr.erase(arr.begin());
        arr.push_back(temp);
    }
    return arr;
}
