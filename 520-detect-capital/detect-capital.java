class Solution {
    public boolean detectCapitalUse(String word) {

        int upper = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                upper++;
            }
        }

        // Case 1: all uppercase
        if (upper == word.length()) {
            return true;
        }

        // Case 2: all lowercase
        if (upper == 0) {
            return true;
        }

        // Case 3: only first character uppercase
        if (upper == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            return true;
        }

        return false;
    }
}