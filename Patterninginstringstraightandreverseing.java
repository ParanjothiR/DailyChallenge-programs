import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		int l=m.length();
		for(int i=0;i<l;i++){
		    int k=i;
		    for(int j=0;j<l;j++){
		        if(i>=j){
		            if(i%2==0){
		               System.out.print(m.charAt(j)); 
		            }else{
		                System.out.print(m.charAt(k--));
		            }
		        }else{
		            System.out.print("*");
		        }
		    }System.out.println();
		}

	}
}