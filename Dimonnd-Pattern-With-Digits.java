import java.util.*;
public class Main {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=n-2;
		int d=0;
		int u=n+n;
		int r=0;
		int num=0;
		for(int i=0;i<n+(n-1);i++){
		    if(i<=n-1){
		        int y=n+2+i;
		        for(int j=0;j<y;j++){
		            if(j<=m){
		                System.out.print("-");
		            }else{
		                if(d==0){
		                    System.out.print("<");
		                    d++;
		                }else if(j==y-1){
		                    System.out.print(">");
		                    d=0;
		                }else{
		                    if(num==9){
		                        System.out.print(num);
		                        num=0;
		                    }else{
		                        System.out.print(num);
		                        num=num+1;
		                    }
		                }
		            }
		        }
		        System.out.println();
		        m--;
		    }else{
		        
		        for(int k=0;k<u;k++){
		            if(r>=k){
		                System.out.print("-");
		            }else{
		                if(d==0){
		                    System.out.print("<");
		                    d++;
		                }else if(k==u-1){
		                    System.out.print(">");
		                    d=0;
		                }else{
		                    if(num==9){
		                        System.out.print(num);
		                        num=0;
		                    }else{
		                        System.out.print(num);
		                        num=num+1;
		                    }
		                }
		            }
		            
		        }
		        u--;
		        r++;
		        System.out.println();
		    }
		}

	}
}