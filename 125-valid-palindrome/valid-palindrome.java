class Solution {
    public boolean isPalindrome(String input) {
        //Step 1) convert everything to lowercase
        //bcoz -- A and a should be treated same
        input = input.toLowerCase();//madam

        //Step 2) Keep only letters and digits
        //Ignore : spaces, comma, full stop, colon etc
        String cleaned = "";

        for(int i = 0; i < input.length(); i++)
        {
            char currChar = input.charAt(i);
            if(Character.isLetterOrDigit(currChar))//Character is in-built class has isLetterOrDigit() method
            {
                cleaned = cleaned + currChar;
            }
        }

        //Step 3) Reverse the cleaned String

        StringBuilder builder = new StringBuilder(cleaned);
        String reversed = builder.reverse().toString();

        //Step 4)compare
        return cleaned.equals(reversed);
    }
}