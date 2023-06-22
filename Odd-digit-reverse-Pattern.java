import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String k=sc.next();
		int l=k.length();
		int y=l-1;
		int t=0;
	    for(int i=l-1;i>=0;i--){
	        for(int j=y;j>=0;j--){
	            int h=k.charAt(j)-'0';
	           // System.out.print(h+" ");
	            if(h%2!=0){
	                System.out.print(h+" ");
	            }else{
	                t++;
	            }
	        }
	        if(t==l){
	            System.out.print("-1");
	            break;
	        }
	        y--;
	        t=0;
	    }

	}
}