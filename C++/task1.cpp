#include<bits/stdc++.h>
using namespace std;
int main(){
    
    int top = -1,sz,leftCount = 0,rightCount = 0;
    cout<<"enter the stack size"<<endl;
    cin>>sz;
    char stck[sz];
    char value;
    
    
 for(int i = 0;i < sz; i++){
    if(top != sz - 1){
        
        cin>>value;
        top++;
        stck[top] = value;
        if(value == '{'){
            leftCount++;
           

        }else if(value == '}'){
            rightCount++;
           
        }
    }
    
 } 
 
  if(leftCount == rightCount){
    cout<<"Valid Paranthesis Expression"<<endl;
  }else{
    cout<<"InValid Paranthesis Expression"<<endl;
  }

}