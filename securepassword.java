import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String m=sc.nextLine();
	    int l=m.length();
	    for(int i=0;i<l;i++){
	        if((m.charAt(i)=='A'||m.charAt(i)=='a'||m.charAt(i)=='E'||m.charAt(i)=='e'||m.charAt(i)=='i'||m.charAt(i)=='I'||m.charAt(i)=='o'||m.charAt(i)=='O'||m.charAt(i)=='u'||m.charAt(i)=='U')||(m.charAt(i)>='0' && m.charAt(i)<='9')){
	            System.out.print("*");
	        }else{
	            System.out.print(m.charAt(i));
	        }
	    }

	}
}