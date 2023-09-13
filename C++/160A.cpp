#include<bits/stdc++.h>
using namespace std;
int main()
{
    int n , sum = 0 , cSum = 0 , c = 0;
    cin>>n;
    vector<int>coin;
    for(int i = 0 ; i < n ; i++){
        int c;
        cin>>c;
        sum += c;
        coin.push_back(c);
    }
    sort(coin.begin(),coin.end());
    for(int i = n-1; i >= 0 ; i--){
        
        if(cSum > sum/2){
            break;
        }
        cSum += coin[i];
        c++;
    }
    cout<<c<<endl;}