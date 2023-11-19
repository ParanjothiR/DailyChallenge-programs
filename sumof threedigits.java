import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		long k=sc.nextLong();
		long t=0;
		while(k>0){
		    t+=k%1000;
		    k=k/1000;
		}
		System.out.print(t);

	}
}