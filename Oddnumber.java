import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[2][n];
		for(int i=0;i<2;i++){
		    for(int j=0;j<n;j++){
		        a[i][j]=sc.nextInt();
		    }
		}
		for(int i=0;i<n;i++){
		    if(a[0][i]%2!=0){
		        System.out.print(a[0][i]+" ");
		    }
		    if(a[1][i]%2!=0){
		        System.out.print(a[1][i]+" ");
		    }
		}

	}
}