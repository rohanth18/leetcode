class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int current = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] != current)
            {
                nums[count] = nums[i];
                count++;
                current = nums[i];
            }
        }
        return count;
    }
}