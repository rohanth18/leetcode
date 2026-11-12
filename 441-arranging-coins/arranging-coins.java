class Solution {
    public int arrangeCoins(int n) {
        int steps = 0;
        int i = 1;
        while(n >= i)
        {
            steps++;
            n = n - i;
            i++;          
        }
        return steps;
    }
}