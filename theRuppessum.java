import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int t=sc.nextInt();
		int y=0;
		for(int i=1;i<=k;i++){
		    y+=n;
		    if((t-y)>=0 &&(t-y)<=m){
		        System.out.print("YES");
		            System.exit(0);
		        
		   }
		}
		System.out.print("NO");

	}
}