import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int s;
		int sum=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        s=sc.nextInt();
		        while(s>0){
		            int y=s%10;
		            sum=10*sum+y;
		            s=s/10;
		        }
		        a[i][j]=sum;
		        sum=0;
		    }
		}
	
		for(int i=0;i<m;i++){
		    for(int j=0;j<n;j++){
		        for(int u=j+1;u<n;u++){
		            if(a[j][i]>a[u][i]){
		                int t=a[j][i];
		                a[j][i]=a[u][i];
		                a[u][i]=t;
		            }
		        }
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        System.out.print(a[i][j]+" ");
		    }
		    System.out.println();
		}

	}
}