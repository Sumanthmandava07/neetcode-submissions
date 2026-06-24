class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        HashSet<Integer> result = new HashSet<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    result.add(nums1[i]);
                    break;
                }
            }
        }
        int[] ans = new int[result.size()];
        int index = 0;

        for (int num : result) {
            ans[index++] = num;
        }

        return ans;
}
}