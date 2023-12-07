import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
	
		int t=n;
		
		for(int i=0;i<n;i++){
		    int y=0;
		    int k=0;
		    for(int j=0;j<m;j++){
		        int a=sc.nextInt();
		        if(j==0){
		            y=a;
		        }else{
		            if(y>=a){
		                k++;
		              //  System.out.print(k);
		            }else{
		                y=a;
		            }
		        }
		    }
		   // System.out.println();
		    if(k!=0){
		        t--;
		    }
		}
		System.out.print(t);
		

	}
}