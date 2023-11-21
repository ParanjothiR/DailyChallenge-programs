import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		int l=m.length();
		int r=-1;
		for(int i=0;i<l;i++){
		    if(m.charAt(i)>='0' && m.charAt(i)<='9'){
		        int t=m.charAt(i)-'0';
		        if(r<t){
		            r=t;
		        }
		    }
		    else{
		        if(r==-1){
		            System.out.print(m.charAt(i));
		        }else{
		            System.out.print(r+""+m.charAt(i));
		            r=-1;
		        }
		    }
		    if(i==l-1){
		        if(r!=-1){
		        System.out.print(r);
		        }
		    }
		}

	}
}