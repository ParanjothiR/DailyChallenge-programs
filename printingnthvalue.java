import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		for(int i=1;i<=n;i++){
		    System.out.print(i+" ");
		    if(k>=0 && k>=i){
		        System.out.print(i+" ");
		    }else if(k<0 && (n+k)<i){
		        System.out.print(i+" ");
		    }
		}
		

	}
}