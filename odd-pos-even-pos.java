import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		String k=sc.next();
		int l=m.length();
		for(int i=0;i<l;i++){
		    if(i%2==0){
		        System.out.print(m.charAt(i));
		    }else{
		        System.out.print(k.charAt(i));
		    }
		}

	}
}