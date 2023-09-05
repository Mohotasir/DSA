#include<bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;
    vector<int>a;
    for(int i = 0 ; i < n ; i++){
        int v;
        cin>> v;
        a.push_back(v);
    }
    int i , j , min;
    for(i = 0 ; i < n ; i++)
    {
        min = i;
        for(j = i + 1 ; j < n ; j++)
        {
            if(a[j] < a[min])
            {
                min = j ;
            }
        }
        int temp = a[min];
        a[min] = a[i];
        a[i] = temp ;
    }


    for(int i = 0 ; i < n ; i++)
    {    
        cout<<"output "<< a[i] <<endl;
    }

}