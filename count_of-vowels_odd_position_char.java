import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner  sc=new Scanner(System.in);
        String m=sc.next();
        int l=m.length();
        int count=0;
        for(int i=0;i<l;i++){
            char d=m.charAt(i);
            if(d=='a' || d=='e'||d=='i'||d=='o'||d=='u'||d=='A'||d=='E'||d=='I'||d=='O'||d=='U'){
                count++;
            }
        }
        for(int i=0;i<l;i++){
            if(count==0){
                System.out.print("-1");
                break;
            }else if(count%2==0){
                if(i%2!=0){
                System.out.print(m.charAt(i));
                }
            }else{
                if(i%2==0){
                System.out.print(m.charAt(i));
                }
            }
        }
    }

	
}