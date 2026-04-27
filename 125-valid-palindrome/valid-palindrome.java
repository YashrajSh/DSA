import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {

        
        String str = s.replaceAll("[\\p{Punct}\\s]", "").toLowerCase();

       
        String reversed = new StringBuilder(str).reverse().toString();

        
        return str.equals(reversed);
    }
}