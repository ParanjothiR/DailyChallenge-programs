import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String k=sc.next();
		int t=sc.nextInt();
		int a[]=new int[t];
		for(int i=0;i<k.length();i++){
		    int y=(int)k.charAt(i);
		    y=y-97;
		    if(t>y && y>=0){
		        a[y]++;
		    }
		}
		for(int i=0;i<t;i++){
		    if(a[i]==0){
		        System.out.print("NO");
		        System.exit(0);
		    }
		}
		System.out.print("YES");

	}
}