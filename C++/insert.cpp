#include<bits/stdc++.h>
using namespace std;
int main()
{   
    int n = 10;
    int arr[n] = {1,2,3,4,5,6,7,8,9,10};
    
    int p = 1;
    int e = 90;
    n++;
   for(int i = n - 1 ; i >= p ; i--)
   {
      arr[i] = arr[i-1];
     
   }
    arr[p-1] = e;

   for(int i =0;i<n;i++){
      cout<<" " <<arr[i];
   }

   return 0 ;
}