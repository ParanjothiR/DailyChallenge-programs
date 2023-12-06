import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ctr1=1;
		int ctr2=m;
		while(ctr1<=n || ctr2>=1){
		    if(ctr1<=n){
		        System.out.print(ctr1+" ");
		        ctr1++;
		        
		    }
		   
		        if(ctr2>=1){
		            System.out.print(ctr2+" ");
		            ctr2--;
		        }
		    
		}
		

	}
}