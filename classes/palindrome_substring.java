public class palindrome_substring {
    public static void main(String[] args) {
        //in order to find the number of palindrome ---
        //the more optimal approach is to do separately for odd and even numbers
        //for odd substring
        for(int i=0;i<str.length();i++){
            for(int l = i;r=i;l>=0 && r<str.length();l--;r++){
                if(str.charAt(l) != str.charAt(r)){
                    break;
                }
                ans++;
            }
        }

        //now for even substring
        for(int i=0;i<str.length();i++){
            for(int l=i;r=i+1;l>=0 && r.length();l--;r++){
                if(str.charAt(l) !=str.charAt(r)){

                    break;
            }
            ans++;
        }
    }
}

}
