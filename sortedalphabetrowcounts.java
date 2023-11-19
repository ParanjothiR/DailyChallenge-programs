import java.util.*;
public class Hello {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        int co=0;
        for(int i=0;i<n;i++){
            int h=0;
            int c=0;
            for(int j=0;j<m;j++){
                char t=sc.next().charAt(0);
                int y=(int)t;
                if(h<=t){
                    c++;
                    h=t;
                }
            }
            if(c==m){
                co++;
            }
        }
        System.out.print(co);
	}
}