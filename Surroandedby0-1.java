import java.util.*;
public class Hello {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        int l1=0;
        int l2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
                if(a[i][j]==1){
                    if(a[i+1][j]==0 && a[i-1][j]==0 && a[i][j+1]==0&&a[i][j-1]==0){
                        l1++;
                    }
                }else{
                    if(a[i+1][j]==1 && a[i-1][j]==1 && a[i][j+1]==1&& a[i][j-1]==1){
                        l2++;
                    }
                }
            }
        }
        System.out.print(l2+" "+l1);

	}
}