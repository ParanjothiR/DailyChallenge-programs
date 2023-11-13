import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String m=sc.nextLine();
		int l=m.length();
		int i=0;
		int t=0;
		int f=0;
		for(i=0;i<l;i++){
		    if(m.charAt(i)=='['){
		        System.out.print('[');
		        for(int j=i+1;j<l;j++){
		            if(m.charAt(j)=='['){
		                break;
		            }
		            if(m.charAt(j)==']'){
		               // System.out.print(']');
		                t=j;
		                f++;
		                break;
		            }
		        }
		    }else if(f!=0 && t>=i){
		        if(m.charAt(i)==']'){
		            System.out.print(']');
		        }else{
		            if(m.charAt(i)==' '){
		                System.out.print(m.charAt(i));
		            }else{
		        int y=(int)m.charAt(i);
		        y=y-32;
		        char u=(char)y;
		        System.out.print(u);
		        if(t==i){
		            f=0;
		            t=0;
		        }
		        }
		        }
		    }else{
		       System.out.print(m.charAt(i)); 
		    }
		}

	}
}