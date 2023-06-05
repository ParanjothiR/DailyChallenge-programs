import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		int l=m.length();
		if(l>1){
		for(int i=0;i<l;i+=2){
		    if(l%2==0){
		        char a=m.charAt(i);
		        char d=m.charAt(i+1);
		        int y=Character.getNumericValue(a);
		        int h=Character.getNumericValue(d);
		        System.out.print(y*h+" ");
		    }else{
		        char a=m.charAt(i);
		        char d=m.charAt(i+1);
		        int h=Character.getNumericValue(a);
		        int y=Character.getNumericValue(d);
		        System.out.print(h*y+" ");
		        if(i+1==l-2){
		            break;
		        }
	
		    }
		}
		}
		   
		if(l%2!=0){
		    System.out.print(m.charAt(l-1));
		}

	}
}