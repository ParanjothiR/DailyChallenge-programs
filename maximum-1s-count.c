#include<stdio.h>
#include<stdlib.h>

int main()
{
  int n;
  scanf("%d",&n);
  int a[n][n];
  int count=0;
  int y=-1;
  int flag=0;
  for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
          scanf("%d ",&a[i][j]);
          if(a[i][j]==1){
              count++;
          }
         // printf("%d ",a[i][j]);
      }
      //printf("%d ",y);
      if(y<count){
          flag=i;
          y=count;
          
      }
      count=0;
  }
  printf("%d ",flag+1);
}