class Solution {
    public int arrangeCoins(int n) {
        int steps = 0;
        int i = 1;
        while(n != 0)
        {
            if(n >= i)
            {
                steps++;
                n = n - i;
                i++;
                continue;
            }
            break;            
        }
        return steps;
    }
}