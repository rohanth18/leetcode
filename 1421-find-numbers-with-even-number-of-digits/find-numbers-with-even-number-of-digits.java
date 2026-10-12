class Solution {
    public int findNumbers(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return -1;
        }
        int evenDigitElementCount=0;
        for(int i=0;i<nums.length;i++)
        {
            int digitCount=0;
            while(nums[i]!=0)
            {
                digitCount++;
                nums[i]=nums[i]/10;
            }
            if(digitCount%2==0)
            {
                evenDigitElementCount++;
            }
        }
        return evenDigitElementCount;
    }
}