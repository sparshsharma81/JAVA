import java.util.*;
public class zero_shift {
    public static void main (String args[]) {
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for(int i = 0;i<a;i++){
			int b = sc.nextInt();
			list.add(b);
		}
		for(int i=0;i<a;i++){
			if(list.get(i)==0){
				int c = list.remove(i);
				list.add(c);
				i-=1;

			}
		}
		for(int i=0;i<a;i++){
			System.out.print(list.get(i)+" ");
		}
    }
}