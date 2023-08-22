import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		int t=m.length();
		int k=sc.nextInt();
		int y=k%t;
		for(int i=y;i<t;i++){
		    System.out.print(m.charAt(i));
		}for(int j=0;j<y;j++){
		    System.out.print(m.charAt(j));
		}

	}
}