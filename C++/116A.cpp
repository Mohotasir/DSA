#include<bits/stdc++.h>
using namespace std;
int main(){
    int stopage,entPass;
    cin>>stopage;
   int passValue[stopage];
   for(int i = 0 ;i < stopage ; i++)
   {
     int exit , entry ;
     cin>>exit >>entry;
     if(i == 0){
       
        passValue[i] = entry;
       
     }else{
         entPass = passValue[i-1] - exit + entry;
         passValue[i] = entPass; 
        }
    }
    int  res = passValue[0];
    for(int i = 1 ;i< stopage ;i++){
        if(passValue[i] > res){
            res = passValue[i];
        }

        
    }
    cout<<res<<endl;
   
}