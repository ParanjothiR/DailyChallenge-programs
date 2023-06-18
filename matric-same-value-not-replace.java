import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		String k="\0";
		String h[][]=new String[n][m];
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        h[i][j]=sc.next();
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		       k=sc.next();
		       if(h[i][j].equals(k)){
		           continue;
		       }else{
		           h[i][j]="*";
		       }
		    }
		    for(int t=0;t<m;t++){
		        System.out.print(h[i][t]+" ");
		    }System.out.println();
		}

	}
}