import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int k=0;
		int y=0;
		if(n>m){
		    k=m;
		}else{
		    k=n;
		    
		}
		for(int i=2;i<=k;i++){
		    if(n%i==0 && m%i==0){
		        y=i;
		        break;
		    }
		}
		if(y==0){
		    System.out.print("-1");
		}else{
		    System.out.print(y);
		}

	}
}