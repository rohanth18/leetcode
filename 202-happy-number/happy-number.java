class Solution {
    public boolean isHappy(int n) {
        int sum=0;
        while(n>9)
        {
            sum=0;
            while(n!=0)
            {
                int digit=n%10;
                sum=sum+(digit*digit);
                n=n/10;
            }
            n=sum;
        }
        if(n==1||n==7)
        {
            return true;
        }
        else{
        return false;
        }
    }
}