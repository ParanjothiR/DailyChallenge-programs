import java.util.*;
public class Hello {
    public static void primary(int a){
        int k=a;
        int count=0;
        for(int g=2;g<=k/2;g++){
            if(a%g==0){
                count++;
            }
        }
        if(count==0){
            System.out.print("1"+" ");
        }else{
            System.out.print("0"+" ");
        }
    }
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int a;
		for(int i=0;i<n;i++){
		    for(int j=0;j<m;j++){
		        a=sc.nextInt();
		        primary(a);
		    }System.out.println();
		}

	}
}