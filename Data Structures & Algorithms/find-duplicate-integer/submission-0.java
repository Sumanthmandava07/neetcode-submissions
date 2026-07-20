class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int left =0;
        int right=left+1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[left]==nums[right])
            {
                return nums[left];
            }
            else
            {
                left++;
                right++;
            }
        }
        return -1;
        
    }
}
