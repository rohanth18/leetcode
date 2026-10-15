class Solution {
    public int[] countBits(int n) {
        int[] newArray = new int[n+1];
        for(int i=0; i<=n;i++)
        {
            int sum = 0;
            int num = i;
            while(num!=0)
            {
                int digit=num%2;
                sum=sum+digit;
                num=num/2;
            }
            newArray[i]=sum;
        }
        return newArray;
    }
}