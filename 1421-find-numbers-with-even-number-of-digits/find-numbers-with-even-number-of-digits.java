class Solution {
    public int findNumbers(int[] nums) {
        int digcount=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int num=nums[i];
            while(num!=0)
            {
                
                num=num/10;
                digcount=digcount+1;
            }
            if(digcount%2==0)
            {
                count=count+1;
            }
            digcount=0;
           
        }
        return count;
        
    }
}