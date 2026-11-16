class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWords = 0;
        for(int i = 0; i < sentences.length; i++)
        {
            String currString = sentences[i];
            int currCount = 1;
            for(int j = 0; j < currString.length(); j++)
            {
                if(currString.charAt(j) == ' ')
                {
                    currCount++;
                }
            }
            if(currCount > maxWords)
            {
                maxWords = currCount; 
            }
        }
        return maxWords;
    }
}