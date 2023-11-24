import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a[]=new int[n];
	int sum=0;
	for(int i=0;i<n;i++){
	    a[i]=sc.nextInt();
	    int t=a[i];
	    int y=0;
	    while(t>0){
	        t=t/10;
	        y++;
	        
	    }
	    if(y%2!=0){
	        sum+=a[i];
	    }
	}
	

	
	System.out.print(sum);
    }
}