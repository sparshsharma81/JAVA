import java.util.*;
public class first_non_repeating_character {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int n = s.length();
        // char[] freq = new char[n+1];
        StringBuilder s2 = new StringBuilder();
        for(int i=0;i<s.length();i++){
            
            if(s2.toString().contains(String.valueOf(s.charAt(i)))){
                System.out.print(s.charAt(i-1));
                break;

            }
            s2.append(String.valueOf(s.charAt(i)));
        }


        // HashMap<Character,Integer>h1 = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     char ch = s.charAt(i);
        //     //   if(h1.containsKey(ch)) {
        //     //     System.out.print(s.charAt(i-1));
        //     //     break;
        //     //   }
        //     h1.put(ch, i);
          
        // }
    }
}
