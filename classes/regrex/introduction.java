public class introduction{
    public static void main(String args[]){
        //regular expression
        //regex is a powerful tool in java for defining patterns that can be used for searching
        //we can use it to find patterns and do searching in java strings
        //special way of describing patterns
        //like from 1000 paper..we need to find a code from it

        //we have a package called java.util.regex.* === where classes are there that we will use to work with regex 
        //so first we will create a pattern..then we will create a pattern and then we will search the matcher in pattern


       /*
                Regex | Meaning | Example Match
                . | Any character | a, b, 1, etc
                \d | A digit (0–9) | 0, 5
                \w | Word character (letters, digits, _) | a, A, 9
                \s | Whitespace (space, tab, newline) |  
                * | 0 or more occurrences | aaa, ``
                + | 1 or more occurrences | aaa
                ? | 0 or 1 occurrence | a, ``
                [abc] | Matches a, b, or c | a
                [^abc] | Not a, b, or c | d, x
                `a | b` | Matches a or b
                ^ | Start of string | 
                $ | End of string |         


       
        */
       /*
       this is testing in github
       */

        String str = "1";
        boolean isMatch = str.matches("\\d+");
        System.out.println("first :"+ str.matches("[^abc]"));
        //iska matlab ek character jo abc na ho --- [^abc]
        //iska matlab ek character jo abc ho --- [abc]

        


        System.out.println(isMatch);
        


    }
}