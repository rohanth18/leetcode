class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        char[] result = new char[words.length];
        for(int i = 0; i < words.length; i++)
        {
            String word = words[i];
            int sum = 0;
            for(int j = 0; j < word.length(); j++)
            {
                char letter = word.charAt(j);
                int index = letter - 'a';
                sum = sum + weights[index];
            }
            int weight = sum % 26;
            char res = (char)('z' - weight);
            result[i] = res;
        }
        String newString = new String(result);
        return newString;
    }
}