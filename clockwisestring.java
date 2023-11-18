import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		String m="abcd";
		for(int k=0;k<t/4;k++){
		    System.out.print(m);
		}
		for(int i=0;i<t%4;i++){
		    System.out.print(m.charAt(i));
		}
		

	}
}