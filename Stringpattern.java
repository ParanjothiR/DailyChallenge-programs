import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		int l=m.length();
		for(int i=0;i<l;i++){
		    for(int j=i;j<l;j++){
		        if(i==j){
		            for(int k=0;k<i;k++){
		                System.out.print(m.charAt(i));
		            }
		        }else{
		            System.out.print(m.charAt(j));
		        }
		    }
		    System.out.println();
		}

	}
}