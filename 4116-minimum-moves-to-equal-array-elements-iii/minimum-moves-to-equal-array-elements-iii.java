class Solution {
    public int minMoves(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] > largest)
            {
                largest = nums[i];
            }
        }
        int moves = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < largest)
            {
                int num = nums[i];
                while(num != largest)
                {
                    num++;
                    moves++;
                }
            }
        }
        return moves;
    }
}