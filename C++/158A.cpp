#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n ,c=0,c0 = 0, k;
    cin>>n>>k;
    vector<int> v;
    for(int i=0; i<n; i++){
       int value;
       cin>>value;
       v.push_back(value);
    }
    for(int i=0; i< n; i++){
         if(v[i] == 0) c0++;
         if(v[k]<=v[i]){
              c++;
        }
            
        
    }
    
    if(c0 ==  v.size()){
         c = 0 ;
    }
   
    cout<<c<<endl;
}