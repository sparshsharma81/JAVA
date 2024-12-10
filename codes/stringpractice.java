public class stringpractice {
    public static void main(String[] args) {
        /*
         * write a java program to convert a string to lowercase
         * 2.write a java program to replace spaces with underscore
         * 3.write a java program to fill in a letter template which looks like below--
         * letter = "Dear<|name|>, Trans a lot"
         * REPLACE <|name|> with a string(some name)
         * 
         * 4.write a java program to detect double and triple spaces in this
         * 
         * 
         */

        //  String beforereplace = "this is before replacing";
        //  String after_replace = beforereplace.replace(" ","_");
        //  System.out.printf("So the replaced string is: %s",after_replace);

        //detecting double and triple spaces---
        String space =" hello world  this is   a triple  space";
        System.out.println(space.indexOf("  "));



    }
    
}
