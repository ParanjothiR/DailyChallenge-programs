import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=0;
		for(int i=1;i<=n;i++){
		    k=0;
		    for(int j=1;j<=n;j++){
		        k+=i;
		        System.out.print(k+" ");
		     
		    }System.out.println();
		    
		    
		}

	}
}