#include<bits/stdc++.h>
using namespace std;
int main(){
   int num, x , y ;
   cin>>num;
if(num==12){
    cout<<4<< " "<<8<<endl;
}else if(num % 2==0){
    x = 6 ;
    y = num - x;
    cout<<x <<" "<< y<<endl;
}else{
  x = 9 ;
  y = num - x ;
  cout<<x <<" "<< y<<endl;
}
}