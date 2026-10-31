class Solution {
    public int numberOfMatches(int n) {
        int totalMatches = 0;
        while(n > 1)
        {
            if(n % 2 == 0)
            {
                int matches = n / 2;
                totalMatches = totalMatches + matches;
                n = matches;
            }
            else
            {
                int matches = n / 2;
                totalMatches += matches;
                n = matches + 1;
            }
        }
        return totalMatches;
    }
}