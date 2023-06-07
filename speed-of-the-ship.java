import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
       float m=sc.nextFloat();
       float n=sc.nextFloat();
       float sum=n;
       int count=0;
       while(m>sum){
           sum+=sum/4.0;
           count++;
       }
       System.out.print(count);
	
    }
}