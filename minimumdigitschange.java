import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		String g=sc.next();
		int k=sc.nextInt();
		int l=g.length();
		int h=0;
		int c=0;
		for(int i=0;i<l;i++){
		   int d=g.charAt(i)-'0';
		   if(d!=0){
		       if(k>c){
		        
		       if(i==0 ){
		           if(d==1){
		               h=1;
		           }else if(d!=1){
		               
		            h=1; 
		            c++;
		           }
		       }else{
		           
		           if(d!=0){
		               h=h*10;
		               c++;
		           }
		               
		          
		       }
		       }else{
		           h=h*10;
		           h=h+d;
		       }
		   }else{
		       h=h*10;
		      // System.out.print(h);
		   }
		  // System.out.print(d);
		   
		}
		System.out.print(h);
		

	}
}