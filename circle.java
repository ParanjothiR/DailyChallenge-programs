import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int x1=sc.nextInt();
		int y=sc.nextInt();
		int y1=sc.nextInt();
	//	System.out.print(Math.pow((y-x),2));
        double k=Math.pow((x-y),2)+Math.pow((x1-y1),2);
	//	System.out.print(k);
	double t=Math.sqrt(k);
// 	System.out.print(t);
		double c=(22.0/7.0)*t *t;
		System.out.format("%.2f",c);

	}
}