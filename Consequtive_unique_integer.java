import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		}
		int v=m;
		int y=0;
		int count=0;
		int k=0;
		for(int i=0;i<n;i++){
		   System.out.print(a[i]+" **");
		    if(n>=(m+i)){
		    for(int j=i+1;j<m+i;j++){
		      System.out.print(a[j]+" *");
		        if(a[i]==a[j]){
		            y++;
		              System.out.print(y+"*");
		            continue;
		            
		        }else{
		            count++;
		        }
		        for(int e=j;e<m+i;e++){
		            if(e!=j)
		            //System.out.print(a[e]+" ");
		            if(a[j]==a[e]){
		                y++;
		                continue;
		            }else{
		                count++;
		            }
		        }
		    }
		    if(y==0){
		        k++;
		    }else{
		        y=0;
		    }
		
		}
		}
		System.out.print(k);

	}
}