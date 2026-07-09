class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
    //     for(int i=0;i<n;i++)
    //     {
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(nums[i]==nums[j] && Math.abs(i-j)<=k )
    //             {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    HashMap<Integer,Integer> map1=new HashMap<>();
    for(int i=0;i<n;i++)
    {
        if(map1.containsKey(nums[i])&&i-map1.get(nums[i]) <= k)
        {
            return true;
        }
        map1.put(nums[i],i);
    }
    return false;
}
}