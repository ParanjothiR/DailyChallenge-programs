import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int f=0;
		while(m>0){
		    int y=m%10;
		    if(n%10==y || ((n/10)%10)==y){
		        f=1;
		        System.out.print("Valid");
		        break;
		    }
		    m=m/10;
		}
		if(f==0){
		    System.out.print("Invalid");
		}

	}
}