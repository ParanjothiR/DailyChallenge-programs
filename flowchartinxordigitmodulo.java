import java.util.*;
public class Hello {

    
		//Your Code Here
		public static void getNumberbinary(int k){
		    int t=k;
		    int c=0;
		    while(t>0){
		        c+=t%2;
		        t=t/2;
		    }
		    System.out.print(c);
		}
		public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		getNumberbinary(n^m);

	}
}