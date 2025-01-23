public class palindrome_substr_optimized {
    public static void main(String[] args) {
        String str = "your_input_string"; // Replace with actual input
        int ans = 0;

        // For odd-length palindromic substrings
        for (int i = 0; i < str.length(); i++) {
            for (int l = i, r = i; l >= 0 && r < str.length(); l--, r++) {
                if (str.charAt(l) != str.charAt(r)) {
                    break;
                }
                ans++;
            }
        }

        // For even-length palindromic substrings
        for (int i = 0; i < str.length(); i++) {
            for (int l = i, r = i + 1; l >= 0 && r < str.length(); l--, r++) {
                if (str.charAt(l) != str.charAt(r)) {
                    break;
                }
                ans++;
            }
        }

        System.out.println("Number of palindromic substrings:" + ans); 
    }
}