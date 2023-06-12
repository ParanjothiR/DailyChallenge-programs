int isPresent(int M, int N)
{
int k=M;
int y=N;
int sum=0;
int r=1;
int temp=k;
while(k>0){
    if((k%10)==(y%10)){
        sum=r*(k%10)+sum;
        printf("%d %d",sum,r);
        if(sum==N){
            return 1;
            
        }
        r=r*10;
        k=k/10;
        y=y/10;
    
    }else{
        y=N;
        k=temp/10;
        temp=k;
        sum=0;
        r=1;
    }
}
return 0;
}