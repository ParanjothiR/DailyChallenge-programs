import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[10];
		while(n>0){
		    int t=n%10;
		    a[t]++;
		    n=n/10;
		}
		int c=0;
		while(k>0){
		    int t=k%10;
		    if(a[t]!=0){
		        a[t]--;
		        c++;
		    }
		    k=k/10;
		}
		System.out.print(c);
		

	}
}