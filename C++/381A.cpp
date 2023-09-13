#include<bits/stdc++.h>
using namespace std;
int main(){
    int T,s=0,d=0 , l , r;
    cin>>T;
    vector<int>v;
    for(int i=0;i<T;i++){
        int n;
        cin>>n;
        v.push_back(n);
        
    }
    l = 0 ;
    r = T - 1;
    while(l <= r){
         
         if(v[r] > v[l]){
            s += v[r];
            r--;
         }else{
            s+= v[l];
            l++;
         }
         if(l>r)break;

        if(v[r] > v[l]){
            d += v[r];
            r--;
         }else{
            d += v[l];
            l++;
         }
    }
    
    cout<<s<< " " <<d<<endl;
}