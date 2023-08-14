#include<stdio.h>
#include<stdlib.h>

int main()
{
 int n,m;
 scanf("%d %d",&n,&m);
 int k[1000001];
 int factor=0;
 for(int i=n;i<=m;i++){
     for(int j=1;j*j<=i;j++){
         if(i%j==0){
             k[factor++]=j;
             k[factor++]=i/j;
         }
     }
 }
 int min=-1;
 for(int k1=0;k1<factor-1;k1++){
    for(int j=k1+1;j<factor;j++){
        if(k[k1]>=k[j] ){
            if(k[k1]==k[j]){
                k[j]=-1;
            }else{
            min=k[k1];
            k[k1]=k[j];
            k[j]=min;
            }
        }
    }
 }
 for(int i=0;i<factor;i++){
     if(k[i]!=-1){
         
     
     printf("%d ",k[i]);
     }
 }
}