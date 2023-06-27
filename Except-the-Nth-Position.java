import java.util.*;
public class Hello {

    public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 String m=sc.next();
	 int k=sc.nextInt();
	 int l=m.length();
	 int j=1;
	 for(int i=0;i<l;i++){
	     if((j*k)-1==i){
	         j++;
	         continue;
	     }else{
	         System.out.print(m.charAt(i));
	     }
	 }

	}
}