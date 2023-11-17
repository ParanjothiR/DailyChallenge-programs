import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
        Scanner sc=new Scanner(System.in);
        String m[]=sc.next().split(":");
        int n=sc.nextInt();
        int k=Integer.parseInt(m[1])+n;
        int y=Integer.parseInt(m[0])+(k/60);
        k=k%60;
        y=y%24;
        if(k<=9){
            m[1]="0";
            m[1]+=String.valueOf(k);
            
        }else{
            m[1]=String.valueOf(k);
        }
        if(y==24 && k<0){
            m[0]="00";
        }else{
            if(y<=9){
                m[0]="0"+String.valueOf(y);
            }else{
                
            
            m[0]=String.valueOf(y);
            }
        }
        System.out.print(m[0]+":"+m[1]);
        
	}
}