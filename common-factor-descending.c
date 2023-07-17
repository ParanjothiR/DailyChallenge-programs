#include<stdio.h>
#include<stdlib.h>

int main()
{
int a,b;
scanf("%d  %d",&a,&b);
if(a>b){
    int v=b;
    b=a;
    a=v;
}
for(int i=b;i>0;i--){
    if(a%i==0 && b%i==0){
          printf("%d ",i);
    }
}
}