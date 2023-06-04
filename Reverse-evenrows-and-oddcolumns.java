import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[][]=new int[n][m];
		int h[][]=new int[n][m];
		int y=n-1;
		int r=m-1;
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        a[i][j]=sc.nextInt();
		        if(i%2!=0){
		            h[i][r]=a[i][j];
		            r--;
		        }else{
		            h[i][j]=a[i][j];
		        }
		    }
		    r=m-1;
		}
		for(int i=0;i<m;i++){
		    for(int j=0;j<n/2;j++){
		        if(i%2==0){
		          
		            int e=h[j][i];
		            int s=h[y][i];
		            //System.out.print(e+" "+s);
		            h[j][i]=s;
		            h[y][i]=e;
		            y--;
		        }
		    }
		    y=n-1;
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        System.out.print(h[i][j]+" ");
		    }System.out.println();
		}
	
		

	}
}