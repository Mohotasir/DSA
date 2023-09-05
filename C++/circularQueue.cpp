#include<bits/stdc++.h>
using namespace std;
int size,front = -1,rear = -1;
int *a;

bool isFull(){
    return ((front == 0 && rear == size - 1) || (front == rear + 1)) ? true : false;
}
bool isEmpty(){
    return (front == -1) ? true : false;
}
void enQueue(int e){
     if(isFull()){
        cout<<"*****queue is full . value is not inserted****"<<endl;
     }else{
        (front == -1)? front = 0 : front ;
        rear = (rear + 1) % size;
        a[rear] =  e;
     }
}
void deQueue(){
    if(!isEmpty()){
        if(front == rear){
            front = -1;
            rear = -1;
        }else{
            front = (front + 1)%size;
        }
    }else{
        cout<<"queue is empty"<<endl;
    }
}
int main(){
  cout<<"Enter the size of the queue:";
  cin>>size;
  a = new int[size];
 while(true){
        int option ,value ;
        cout << " 1.enqueue a element\n 2.dequeue a element\n 3.check isFull?\n 4.check isEmpty?\n 5.Show all elements\n 6.exit\n"<<endl;
        cout << "select any option from the menu:";
        cin >> option;
        if(option==1){
            cout<<"Enqueue a value:";
            cin>>value;
            enQueue(value);
        }else if(option == 2){
            deQueue();

        }else if(option == 3){
             isFull() ? cout<< "queue is full\n" : cout<< "queue is not full\n";
        }else if(option == 4){
            isEmpty() ?cout<<  "queue is empty\n" : cout<< "queue is not empty\n";
        }else if(option == 5){
            if(rear>=front){
                for(int i = front ; i <= rear; i++){
                    cout<< a[i] <<endl;
                }
            }else{
                for(int i = 0 ;i <= rear ;i++){
                    cout<< a[i]<<endl;
                }
                for(int i = front ; i < size ; i++){
                    cout<<a[i]<<endl;
                }
                
            }
        }else if(option == 6){
            break;
        }
    }
  
}