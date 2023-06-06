import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String m=sc.next();
		String a[][]=new String[n][n];
		String k[][]=new String[n][n];
		int r=0;
		int g=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        a[i][j]=sc.next();
		  
		    }
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        String h=a[j][i];
		        if(h.equals(m)){
		            r++;
		            g=j;
		            if(r==2){
		                break;
		            }
		        }
		    }
		    for(int j=0;j<n;j++){
		        if(r==2){
		           if(j>=g+1){
		               k[j][i]="*";
		           }else{
		               k[j][i]=a[j][i];
		           }
		        }else{
		            k[j][i]=a[j][i];
		        }
		    }
		    g=0;
		    r=0;
		}
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        System.out.print(k[i][j]+" ");
		    }
		    System.out.println();
		}

	}
}