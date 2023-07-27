import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a;
		int max=10001;
		for(int i=0;i<n;i++){
		    a=sc.nextInt();
		    int c=0;
		    for(int j=1;j<=a;j++){
		        if(a%j==0){
		            c++;
		        }
		    }
		    if(max>=c){
		        max=c;
		       
		      //  System.out.print(max);
		    }
		    
		}
		System.out.print(max);

	}
}