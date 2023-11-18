import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		while(k>0){
		    int t=k%100;
            if((t%10)<(t/10)){
                System.out.print("NO");
                System.exit(0);
            }
            k=k/10;
		}
		System.out.print("YES");

	}
}