// package StringTokenizer;.

import java.util.*;

public class stringTokenizer {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();

        StringTokenizer st = new StringTokenizer(s," ");
        int count = 0;
        while(st.hasMoreTokens()){
            count++;
            st.nextToken();
        }
        System.out.println(count);
    }

    
}
