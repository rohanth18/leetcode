
class Solution {
    public String reverseVowels(String s) {
        char[] array = s.toCharArray();

        int left = 0;
        int right = array.length - 1;

        while (left < right) {

            while (left < right && !isVowel(array[left])) {
                left++;
            }

            while (left < right && !isVowel(array[right])) {
                right--;
            }

            if (left < right) {
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;

                left++;
                right--;
            }
        }

        return new String(array);
    }

    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i'
            || ch == 'o' || ch == 'u'
            || ch == 'A' || ch == 'E' || ch == 'I'
            || ch == 'O' || ch == 'U';
    }
}
