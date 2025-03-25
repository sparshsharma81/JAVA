import java.util.*;
public class longest_substring{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        String s = sc.next();
        
        int[] freq = new int[256]; //basically 256 characters hote hai..
        int l = 0;
        int max_len = 0;
        for(int i=0,j=0;i<s.length();i++){
            int ch2 = s.charAt(i);
            freq[ch2]++;
            l++;
        
        
            
            if(freq[ch] ==1){
                mx = Math.max(len,mx);
                continue;
            }
            while(freq[ch]>1){
                int c = s.charAt(j);

                freq[c]--;
                len--;
                j++;
            }
        }


    }
}