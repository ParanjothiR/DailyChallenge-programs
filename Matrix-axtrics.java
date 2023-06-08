import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int l;
		int u;
		for(int i=0;i<k;i++){
		    for(int j=0;j<k;j++){
		        l=sc.nextInt();
		        u=l%10;
		        if(u!=0 && l%u==0){
		            while(l>0){
		                System.out.print("*");
		                l=l/10;
		                //System.out.print(l+" ");
		            }System.out.print(" ");
		        }else{
		            System.out.print(l+" ");
		        }
		    }
		    System.out.println();
		}

	}
}