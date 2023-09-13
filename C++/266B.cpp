#include<bits/stdc++.h>
using namespace std;
int main(){
    int noOfChild , time;
    cin>>noOfChild>>time;
    string s;
    cin>>s;
    for(int i = 0 ; i < time; i++){
        if(s[i] == 'B'){
            int temp =  s[i];
            s[i] = s[i+1];
            s[i+1] = temp;
        }
    }
    cout<<s<<endl;
}