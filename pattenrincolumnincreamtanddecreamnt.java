import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m[][]=new int[n][n];
		int t=n;
		int k=1;
		for(int i=0;i<n;i++){
		    k=1;
		    t=n;
		    for(int j=0;j<n;j++){
		        if(i%2==0){
		            if(j<i){
		              m[i][j]=0;  
		            }else{
		              m[i][j]=k;
		              k++;
		            }
		        }else{
		            if(j<i){
		                m[i][j]=0;
		            }else{
		                m[i][j]=t;
		                t--;
		            }
		        }
		    }
		    
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(m[j][i]!=0){
		        System.out.print(m[j][i]+" ");
		        }
		    }
		    System.out.println();
		}

	}
}