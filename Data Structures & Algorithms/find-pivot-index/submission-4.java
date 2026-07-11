class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int lsum=0,rsum=0;
            for(int l=0;l<i;l++)
            {
                lsum=lsum+nums[l];
            }
            for( int k=i+1;k<n;k++)
            {
                rsum=rsum+nums[k];
            }
            if(lsum==rsum)
            {
                return i;
            }

        }
        return -1;
    }
}