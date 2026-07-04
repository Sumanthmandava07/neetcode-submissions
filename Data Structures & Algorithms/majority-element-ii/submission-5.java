class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result=new ArrayList<>();
        int n=nums.length;
        int count1=0;
        int count2=0;
        int ele1=0;
        int ele2=0;
        int maxcount=(n/3)+1;
        for(int i=0;i<n;i++)
        {
            if(count1==0 && nums[i]!=ele2)
            {
                ele1=nums[i];
                count1++;
            }
            else if(count2==0 && nums[i]!=ele1)
            {
                ele2=nums[i];
                count2++;
            }
            else if(ele1==nums[i])
            {
                count1++;
            }
            else if(ele2==nums[i])
            {
                count2++;
            }
            else
            {
                count1--;
                count2--;
            }
        }
        count1 = 0; count2 = 0; 
        for (int i = 0; i < n; i++) {
            if (nums[i] == ele1)
            {
                count1++;
            }  
            if (nums[i] == ele2)
            {
                count2++;
            }
        }
        // int mini = n / 3 + 1;
        // List<Integer> result = new ArrayList<>(); 
        if (count1 >= maxcount) 
        {
            result.add(ele1);
        }
        if (count2 >= maxcount && ele1 != ele2) 
        {
            result.add(ele2);
        }
        return result;
    }
}