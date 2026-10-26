class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newnums = new int[nums.length * 2];
        for(int i = 0; i < nums.length; i++)
        {
            newnums[i] = nums[i];
            newnums[i + nums.length] = nums[i];
        }
        return newnums;
    }
}