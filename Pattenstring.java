import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		int l=m.length();
		int t=l;
		int s=0;
		int e=l-1;
		int k=0;
		if(l%2==0){
		    t=l-1;
		}
		for(int i=0;i<t;i++){
		    if(i<=t/2){
		       for(int j=0;j<l;j++){
		           if(s>j || j>e){
		               System.out.print("*");
		           }else{
		               System.out.print(m.charAt(j));
		           }
		       }
		       s++;
		       e--;
		       System.out.println();
		       
		    }else{
		        if(k==0){
		            s--;
		            e++;
		            k++;
		        }
		        s--;
		        e++;
		        for(int j=0;j<l;j++){
		            if(s>j || j>e){
		                System.out.print("*");
		            }else{
		                System.out.print(m.charAt(j));
		            }
		        }
		    
		    System.out.println();
		    }
		}

	}
}