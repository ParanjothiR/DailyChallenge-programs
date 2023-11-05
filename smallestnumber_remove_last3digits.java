import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int t1=n%10;
		int t2=n%100;
		int y=n/10;
		int y1=(n/100)*10+t1;
		int y2=(n/1000)*100+(t2);
		if(y<=y1 && y<=y2){
		    System.out.print(y);
		}else if(y1<=y2 && y1<=y){
		    System.out.print(y1);
		}else if(y2<=y1 && y2<=y){
		    System.out.print(y2);
		}

	}
}