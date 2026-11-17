
class Solution {
    public boolean isAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || 
            (ch >= 'a' && ch <= 'z')) {
            return true;
        }
        return false;
    }

    public String reverseOnlyLetters(String s) {
        char[] result = s.toCharArray();

        int left = 0;
        int right = result.length - 1;

        while (left < right) {

            if (isAlphabet(result[left]) && isAlphabet(result[right])) {
                char temp = result[left];
                result[left] = result[right];
                result[right] = temp;

                left++;
                right--;
            }
            else if (!isAlphabet(result[left])) {
                left++;
            }
            else {
                right--;
            }
        }

        return new String(result);
    }
}
