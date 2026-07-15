class Solution {
    public int maxAscendingSum(int[] nums) {
        // Arrays.sort(nums);
        int n=nums.length;
        int largestsum=0;
        for(int i=0;i<n;i++)
        {
            int sum=nums[i];
            largestsum=Math.max(largestsum,sum);
            for(int j=i+1;j<n;j++)
            {
                if(nums[j]<=nums[j-1])
                {
                    break;
                }
                sum=sum+nums[j];
                if(sum>largestsum)
                {
                    largestsum=sum;
                }
            }
        }
    return largestsum;
    }
}