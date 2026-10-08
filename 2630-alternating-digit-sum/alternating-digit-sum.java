class Solution {
    public int alternateDigitSum(int n) {
        int rev=0;
        while(n!=0)
        {
            int digit=n%10;
            rev=rev*10+digit;
            n=n/10;
        }
        int i=0;
        int sum=0;
        while(rev!=0)
        {
            int digit=rev%10;
            if(i%2==0)
            {
                sum=sum+digit;
            }
            else
            {
                sum=sum-digit;
            }
            i++;
            rev=rev/10;
        }
        return sum;
    }
}