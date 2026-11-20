class Solution {
    public boolean isPalindrome(String input) {
        //Step 1) convert everything to lowercase
        //bcoz -- A and a should be treated same
        input = input.toLowerCase();//madam

        //Step 2
        //Use StringBuilder as it has append() method to acoid creating new String

        StringBuilder cleaned = new StringBuilder();

        for(int i = 0; i < input.length(); i++)
        {
            char currChar = input.charAt(i);
            if(Character.isLetterOrDigit(currChar))//Check if current char is letter or digit
            {
                cleaned.append(currChar);
            }
        }

        //Step 3) Reverse the cleaned String

        StringBuilder reversebuilder = new StringBuilder(cleaned);
        reversebuilder.reverse();
        

        //Step 4)compare
        return cleaned.toString().equals(reversebuilder.toString());
    }
}