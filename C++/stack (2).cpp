#include<bits/stdc++.h>
using namespace std;
int maxSize ;
char *stck;
int top = -1,leftFirst =0,rightFirst=0 ,leftSecond=0,rightSecond=0,leftThird=0,rightThird=0;

bool isFull(){
  return (top == maxSize-1) ? true : false;
}

bool isEmpty(){
  return (top == -1) ? true : false;
}

bool push(char bracket)
{
    if(!isFull()){
        top++;
        stck[top] = bracket;
        if(stck[top] == '('){
            leftFirst++;

        }else if(stck[top] == ')'){
            rightFirst++;

        }else if(stck[top] == '{'){
            leftSecond++;

        }else if(stck[top] == '}'){
            rightSecond++;

        }else if(stck[top] == '['){
            leftThird++;

        }else if(stck[top] == ']'){
            rightThird++;

        }
        return (leftFirst == rightFirst && leftSecond == rightSecond && leftThird ==  rightThird) ? true : false;

    }else{
      cout<<"stack is full"<<endl;
      return -1;
    }
}
void checkValidity(bool res){
    if(res)
        cout<<"Valid Parenthesis Expression\n";
    else
        cout<<"InValid Parenthesis Expression\n";

}
int main()
{
    cout<<"Enter stack size"<<endl;
    cin>>maxSize;
    stck = new char[maxSize];
    bool result;
    while(1){
           cout<< " 1.push value\n 2.check validity\n 3.break"<<endl;
           int op;
           cin>>op;
        if(op==1){
             cout<<"enter a value "<<endl;
             char value;
             cin>>value;
             result =  push(value);

        }else if(op == 2){
                 checkValidity(result);

        }else if(op == 3){
               break;
        }

   }
    return 0;
}
