class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n=piles.length;
        int low =1;
        int high=piles[0];
        for(int i=1;i<n;i++)
        {
            high=Math.max(high,piles[i]);
        }
        while(low<high)
        {
            int mid=low+(high-low)/2;
            int hours=0;
            for(int i=0;i<n;i++)
            {
                hours=hours+(piles[i]+mid-1)/mid;
            }
            if(hours<=h)
            {
                high=mid;
            }
            else
            {
                low=mid+1;
            }
        }
        return low;
    }
}