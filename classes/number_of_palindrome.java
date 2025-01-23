import java.util.*;

public class number_of_palindrome {
    
    public static boolean isPalindrome(String s){
    int left =0;
    int right = s.length()-1;
    while(left<right){
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;
}

public static int palindrome_String(String s){
    int count =0;
    for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            String sub = s.substring(i,j+1);
            if(isPalindrome(sub)){
                count++;

            }
        }
    }
    return count;
}
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.print("Number of palindrome String :"+ palindrome_String(s));
        //this code has time complexicity of O(n^3);
        



    }
}
