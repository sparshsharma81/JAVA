import java.util.*;

public class longest_good_string {
    public static boolean isVowel(char c){
        if(c =='a' || c =='e' || c =='i' || c =='o' || c =='u' || c =='A' || c =='E' || c =='I' || c =='O' || c =='U'){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
    /*
     lets assume a string is a good string if it only contains vowel(a,e,i,o,u) 
     find the largest longest good string

     */
    
    Scanner sc= new Scanner(System.in);
    String a = sc.next();
    int current_count=0;
    int max_count =0;
    // for(int i=0; i<a.length; i++){

        // if(a.charAt(i) == a.charAt(i+1) && (a.charAt(i)=='a' || a.charAt(i)=='e' || a.charAt(i)=='i' || a.charAt(i)=='o' || a.charAt(i)=='u') &&
        // (a.charAt(i+1)=='a' || a.charAt(i+1)=='e' || a.charAt(i+1)=='i' || a.charAt(i+1)=='o' || a.charAt(i+1)=='u') ){
           
          
           
            // short++;
            // if(short>count){
            //     count =short;
            // }

           
        // }

        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            if(isVowel(c)){
                current_count++;
                max_count = Math.max(current_count , max_count);

            }
            else{
                current_count = 0;
            }
        }
   System.out.print(max_count);
    } 

    

}
