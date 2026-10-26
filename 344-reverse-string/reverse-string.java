class Solution {
    public void reverseString(char[] s) {
        int j = 0; 
        for(int i = s.length - 1; i >= j; i--)
        {
            char temp = s[j];
            s[j] = s[i];
            s[i] = temp; 
            j++;
        }
    }
}