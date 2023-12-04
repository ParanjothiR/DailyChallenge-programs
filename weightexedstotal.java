import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int m=sc.nextInt();
		int a[]=new int[n];
		int t=0;
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    if(a[i]>k){
		        t+=a[i];
		        t+=m;
		    }else{
		        t+=a[i];
		    }
		}
		System.out.print(t);
        
	}
}