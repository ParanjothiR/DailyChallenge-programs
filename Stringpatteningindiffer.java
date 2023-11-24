import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		int l=m.length();
		int k=(l+1)/2;
		int f=0;
		for(int i=0;i<k;i++){
		    int t=i;
		    for(int j=0;j<l;j++){
		        if((i<k-1)&&((j==((k-1)+i))||(((k-1)-i)==j))){
		            System.out.print(m.charAt(i));
		            
		        }else if(i<(k-1)){
		            System.out.print("*");
		        }else{
		            System.out.print(m.charAt(t));
		            if(t==(l-1)){
		                f++;
		            }
		            if(f==0){
		                t++;
		            }else{
		                t--;
		            }
		        }
		    }System.out.println();
		}

	}
}