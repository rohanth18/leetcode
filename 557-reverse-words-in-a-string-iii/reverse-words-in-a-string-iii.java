
class Solution {
    public String reverseWords(String s) {
        char[] result = s.toCharArray();
        int end = 0;

        while(end < result.length) {
            
            int left = end;

            while(end < result.length && result[end] != ' ') {
                end++;
            }

            int right = end - 1;

            while(left < right) {
                char temp = result[left];
                result[left] = result[right];
                result[right] = temp;

                left++;
                right--;
            }

            end++;
        }

        return new String(result);
    }
}
