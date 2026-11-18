
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] result = new int[num_people];
        int index = 0;
        int sum = 1;

        while(candies > 0)
        {
            int give;

            if(candies < sum)
            {
                give = candies;
            }
            else
            {
                give = sum;
            }

            result[index] += give;
            candies -= give;

            index++;

            if(index == num_people)
            {
                index = 0;
            }

            sum++;
        }

        return result;
    }
}
