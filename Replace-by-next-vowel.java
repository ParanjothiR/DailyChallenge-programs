import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		char u=sc.next().charAt(0);
		int l=m.length();
		int in=-1;
		int vo=0;
		for(int i=0;i<l;i++){
		    if(m.charAt(i)==u && i<l-1){
		        for(int j=i+1;j<l;j++){
		            if(m.charAt(j)=='a'||m.charAt(j)=='e'||m.charAt(j)=='i'||m.charAt(j)=='o'||m.charAt(j)=='u'){
		                System.out.print(m.charAt(j));
		                vo++;
		                break;
		            }else{
                                 if(j==l-1){
                                     System.out.print(m.charAt(i));
                                 }else{
		                    continue;
                                }
		            }
		            
		        }
		    }else{
		        System.out.print(m.charAt(i));
		    }
		}    

	}
}