import java.util.*;
public class longest_substring_without_repeating_character {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Integer,Integer>h1 = new HashMap<>();
        int count =0;
        int max_count = 0;

        StringBuilder st= new StringBuilder();
        int i=0;

        for(;i<s.length();i++){
          
            
            if(st.toString().contains(String.valueOf(s.charAt(i)))){
                max_count = Math.max(count,max_count);
                count = 1;
                st = new StringBuilder();
                st.append(s.charAt(i));
            }
            else{
                  st.append(s.charAt(i));
                  count++; //current element++;
            }
            // System.out.println(count);
            
        }
        System.out.println("ans : " + max_count);
        sc.close();

    }
}
