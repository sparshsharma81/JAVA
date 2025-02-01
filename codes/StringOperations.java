public class StringOperations {
    public static void main(String[] args) {
        // 1. Create Strings
        String str1 = "Hello"; 
        String str2 = new String("World");

        // 2. Basic Operations
        int length = str1.length(); // Length
        char ch = str1.charAt(1); // Character at index
        String substr = str1.substring(1, 4); // Substring
        String str3 = str1.concat(str2); // Concatenate
        boolean isEqual = str1.equals(str2); // Compare (case-sensitive)
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2); // Compare (ignore case)
        String replaced = str1.replace('l', 'p'); // Replace characters
        boolean contains = str2.contains("or"); // Check substring presence

        // 3. Searching & Indexing
        int index = str2.indexOf('o'); // First occurrence
        int lastIndex = str2.lastIndexOf('o'); // Last occurrence
        boolean starts = str1.startsWith("He"); // Check start
        boolean ends = str2.endsWith("ld"); // Check end

        // 4. Case Conversion
        String upper = str1.toUpperCase(); // To uppercase
        String lower = str2.toLowerCase(); // To lowercase

        // 5. Whitespace and Splitting
        String trimmed = "   Hello   ".trim(); // Trim whitespace
        String[] words = "apple,banana,grape".split(","); // Split string

        // 6. Joining Strings
        String joined = String.join(" ", "Hello", "World"); // Join strings

        // 7. Convert String to Array
        char[] chars = str1.toCharArray(); // Convert to char array

        // 8. Conversions
        int num = Integer.parseInt("123"); // String to number
        String numStr = String.valueOf(456); // Number to string

        // 9. String Immutability Example
        String original = "Immutable";
        String modified = original.concat(" String"); // Immutable

        // 10. Formatting
        String formatted = String.format("Name: %s, Age: %d", "John", 25); // Format string

        // 11. Mutable Strings
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World"); // Modify StringBuilder
        StringBuffer1 sbf = new StringBuffer1("Hello");
        sbf.append(" World"); // Modify StringBuffer

        // Outputs
        System.out.println("Length: " + length);
        System.out.println("Char at 1: " + ch);
        System.out.println("Substring: " + substr);
        System.out.println("Replaced: " + replaced);
        System.out.println("Contains 'or': " + contains);
        System.out.println("Uppercase: " + upper);
        System.out.println("Trimmed: " + trimmed);
        System.out.println("Joined: " + joined);
    }
}
