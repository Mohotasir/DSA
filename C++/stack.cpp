#include<bits/stdc++.h>
using namespace std;
int maxSize = 8;
int stack[8];
int top = -1;

int isFull(){
  return  (top==maxSize) ? 1 : 0;
}
int push(int value){
    if(!isFull()){
        top++;
        stack[top] = data;
    }else{
        cout<<"stack in full"<<endl;
    }
}


int main()
{

   push(44);
   push(10);
   push(62);
   push(123);
   push(15);
   cout<<"Stack Elements: "<<endl;

   // print stack data
   for(int i = 0; i < 8; i++) {
      cout<<stack[i]<<endl;
   }


    return 0;
}