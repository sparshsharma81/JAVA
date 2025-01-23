import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        StringBuilder s1 = new StringBuilder(sc.next());
        StringBuilder s2 = new StringBuilder(s1.reverse());
        if(s2 ==s1){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
        
    }
}
