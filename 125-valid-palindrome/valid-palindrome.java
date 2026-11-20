class Solution {
    public boolean isPalindrome(String input) {
        input = input.toLowerCase();//madam

        int left = 0;
        int right = input.length() - 1;
        boolean palindrome = true;
        while(left < right)
        {
            char ch1 = input.charAt(left);
            char ch2 = input.charAt(right);
            if(Character.isLetterOrDigit(ch1) && Character.isLetterOrDigit(ch2))
            {
                if(ch1 != ch2)
                {
                    palindrome = false;
                    break;
                }
                left++;
                right--;
            }
            else if(!Character.isLetterOrDigit(ch1))
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return palindrome;
    }
}