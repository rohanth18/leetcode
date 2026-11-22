class Solution {
    public String[] findWords(String[] words) {
        String s1 = "[qwertyuiop]+";
        String s2 = "[asdfghjkl]+";
        String s3 = "[zxcvbnm]+";

        String[] result = new String[words.length];
        int k = 0;

        for(int i = 0; i < words.length; i++)
        {
            String word = words[i].toLowerCase();

            if(word.matches(s1) || word.matches(s2) || word.matches(s3))
            {
                result[k++] = words[i];
            }
        }

        return java.util.Arrays.copyOf(result, k);
    }
}