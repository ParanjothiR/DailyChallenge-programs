import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int y=sc.nextInt();
		int k=sc.nextInt();
		for(int i=k;i<1000001;i+=k){
		    if(!(i>=n && i<=y)){
		        System.out.print(i);
		        break;
		    }
		}

	}
}