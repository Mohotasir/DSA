#include<stdio.h>
int main(){

    int TestCase , problemCount = 0 ;
    scanf("%d",&TestCase);
    while(TestCase--){
        int input , count = 0;
        for(int i = 0 ; i < 3 ; i++){
            scanf("%d",&input);
            if(input == 1){
                count++;
            }
        }
        if(count >= 2){
            problemCount ++;
        }


    }
    printf("%d",problemCount);
 return 0 ;
}