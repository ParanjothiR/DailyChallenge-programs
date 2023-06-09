import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String m=sc.next();
		int l=m.length();
		int binary=0;
		int octal=0;
		int decimal=0;
		int hex=0;
		for(int i=0;i<l;i++){
		    if(m.charAt(i)=='0'||m.charAt(i)=='1'){
		        binary++;
		    }
		    if(m.charAt(i)>='0' && m.charAt(i)<='7'){
		        octal++;
		    }
		    if(m.charAt(i)>='0'&& m.charAt(i)<=9){
		        decimal++;
		    }
		    if((m.charAt(i)>='0'&&m.charAt(i)<='9')||(m.charAt(i)>='A'&& m.charAt(i)<='F')){
		        hex++;
		    }
		}
		if(binary==l){
		    System.out.print("Binary");
		}else if(octal==l){
		    System.out.print("Octal");
		}else if(decimal==l){
		    System.out.print("Decimal");
		}else if(hex==l){
		    System.out.print("Hexadecimal");
		}else{
		    System.out.print("Invalid");
		}

	}
}