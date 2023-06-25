import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int sum=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    if(i<m){
		        sum+=a[i];
		    }
		}
		for(int j=n-m;j<n;j++){
		    System.out.print(sum-a[j]+" ");
		}
	}
}