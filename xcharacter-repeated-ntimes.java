import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String m1=sc.next();
		int k=sc.nextInt();
		int m=sc.nextInt();
		for(int i=0;i<m;i++){
		    for(int j=0;j<k;j++){
		        System.out.print(m1.charAt(j));
		    }
		}

	}
}