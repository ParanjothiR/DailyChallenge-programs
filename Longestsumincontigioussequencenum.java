import java.util.*;
public class Hello {

    public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> v=new ArrayList<Integer>();
		int t=0;
		while(sc.hasNext()){
		    t++;
		    v.add(sc.nextInt());
		}
		int val=v.get(0)+v.get(1);
		for(int i=1;i<t-1;i++){
		    int y=v.get(i)+v.get(i+1);
		    if(val<=y){
		        val=y;
		    }
		}
		System.out.print(val);

	}
}